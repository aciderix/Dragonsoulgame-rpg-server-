package com.perblue.rpg.g2d;

import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.l;
import java.util.HashMap;
import java.util.Map;

public class ShaderFactory {
    private static final String BASE_FRAG_SHADER = "shaders/Decals-fs.glsl";
    private static final String BASE_VERT_SHADER = "shaders/Decals-vs.glsl";
    private static final a<ShaderAttribute> types = new a();
    private String baseFragShader = com.badlogic.gdx.utils.b.a.e.b(BASE_FRAG_SHADER).d(null);
    private String baseVertexShader = com.badlogic.gdx.utils.b.a.e.b(BASE_VERT_SHADER).d(null);
    private Map<Long, RPGShader> shaderMap = new HashMap();

    public enum ShaderAttribute {
        ALPHA_ATLAS,
        ALPHA_TEST,
        RENDER_TYPE,
        DARKEN,
        DESATURATE,
        HSV
    }

    static {
        for (ShaderAttribute register : ShaderAttribute.values()) {
            register(register);
        }
    }

    public static final long getAttributeType(ShaderAttribute shaderAttribute) {
        for (int i = 0; i < types.b; i++) {
            if (types.a(i) == shaderAttribute) {
                return 1 << i;
            }
        }
        return 0;
    }

    public static final ShaderAttribute getAttributeAlias(long j) {
        int i = -1;
        while (j != 0) {
            i++;
            if (i < 63) {
                if (((j >> i) & 1) != 0) {
                    break;
                }
            }
            break;
        }
        return (i < 0 || i >= types.b) ? null : (ShaderAttribute) types.a(i);
    }

    protected static final long register(ShaderAttribute shaderAttribute) {
        long attributeType = getAttributeType(shaderAttribute);
        if (attributeType > 0) {
            return attributeType;
        }
        types.add(shaderAttribute);
        return 1 << (types.b - 1);
    }

    public static boolean hasAttribute(long j, ShaderAttribute shaderAttribute) {
        return (getAttributeType(shaderAttribute) & j) != 0;
    }

    public static long getShaderMask(ShaderAttribute shaderAttribute, ShaderAttribute shaderAttribute2, ShaderAttribute shaderAttribute3) {
        return ((0 | getAttributeType(shaderAttribute)) | getAttributeType(shaderAttribute2)) | getAttributeType(shaderAttribute3);
    }

    public static long getShaderMask(ShaderAttribute shaderAttribute, ShaderAttribute shaderAttribute2) {
        return (0 | getAttributeType(shaderAttribute)) | getAttributeType(shaderAttribute2);
    }

    public static long getShaderMask(ShaderAttribute shaderAttribute) {
        return 0 | getAttributeType(shaderAttribute);
    }

    public RPGShader createShader(long j) {
        boolean z = false;
        if (this.shaderMap.get(Long.valueOf(j)) == null) {
            String str = "";
            for (ShaderAttribute shaderAttribute : ShaderAttribute.values()) {
                if (hasAttribute(j, shaderAttribute)) {
                    str = str + "#define " + shaderAttribute + "\n";
                    if (shaderAttribute == ShaderAttribute.ALPHA_ATLAS) {
                        z = true;
                    }
                }
            }
            RPGShader rPGShader = new RPGShader(str + this.baseVertexShader, str + this.baseFragShader, z);
            if (rPGShader.isCompiled()) {
                this.shaderMap.put(Long.valueOf(j), rPGShader);
            } else {
                throw new l(rPGShader.getLog());
            }
        }
        return (RPGShader) this.shaderMap.get(Long.valueOf(j));
    }
}
