package com.perblue.rpg.g2d;

import com.badlogic.gdx.graphics.glutils.t;

public class RPGShader extends t {
    private static final String UNIFORM_ATLAS_DISABLE = "u_alphaAtlasDisable";
    private static final String UNIFORM_DARKEN_ALPHA = "u_darkenAlpha";
    private static final String UNIFORM_RENDER_TYPE = "u_renderType";
    private boolean hasAlphaAtlas;

    public enum RenderType {
        NORMAL(0.0f),
        DESATURATED(1.0f),
        BRIGHTEN(2.0f);
        
        private float value;

        private RenderType(float f) {
            this.value = f;
        }

        public final float getValue() {
            return this.value;
        }
    }

    public RPGShader(String str, String str2, boolean z) {
        super(str, str2);
        this.hasAlphaAtlas = z;
    }

    public void setDarken(Float f) {
        setUniformf(UNIFORM_DARKEN_ALPHA, f.floatValue());
    }

    public void setRenderType(RenderType renderType) {
        setUniformf(UNIFORM_RENDER_TYPE, renderType.getValue());
    }

    public void setAlphaAtlasDisable(boolean z) {
        if (this.hasAlphaAtlas) {
            setUniformf(UNIFORM_ATLAS_DISABLE, z ? 1.0f : 0.0f);
        }
    }
}
