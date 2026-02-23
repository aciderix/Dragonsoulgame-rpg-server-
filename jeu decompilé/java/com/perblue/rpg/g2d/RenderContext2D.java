package com.perblue.rpg.g2d;

import com.badlogic.gdx.graphics.g2d.k;
import com.badlogic.gdx.graphics.glutils.t;
import com.badlogic.gdx.graphics.glutils.u;
import com.badlogic.gdx.graphics.j;
import com.badlogic.gdx.math.h;
import com.badlogic.gdx.math.p;
import com.badlogic.gdx.math.q;
import com.esotericsoftware.spine.SkeletonMeshRenderer;
import com.perblue.rpg.assets.RPGAssetManager;
import com.perblue.rpg.g2d.ShaderFactory.ShaderAttribute;
import com.perblue.rpg.game.data.display.EnvironmentData;
import com.perblue.rpg.game.objects.Environment;
import com.perblue.rpg.network.messages.EnvironmentType;

public class RenderContext2D {
    private k alphaPolyBatch;
    private RPGAssetManager assetManager;
    private t darkDecalShader;
    private float darkenShaderAlpha = 1.0f;
    private u debugShapeRenderer;
    private t decalShader;
    private t desaturateShader;
    private boolean dontSkew;
    private EnvironmentType envType = EnvironmentType.CH1_COMBAT_1;
    private t hsvDecalShader;
    private t irisShader;
    private j orthoCam;
    private RenderManager2D renderManager;
    private SkeletonMeshRenderer skeletonRenderer;

    public RenderContext2D(t tVar, t tVar2, t tVar3, t tVar4, t tVar5, RPGAssetManager rPGAssetManager) {
        this.alphaPolyBatch = new k(1000, tVar);
        this.renderManager = new RenderManager2D();
        this.decalShader = tVar;
        this.darkDecalShader = tVar2;
        this.desaturateShader = tVar3;
        this.hsvDecalShader = tVar5;
        this.assetManager = rPGAssetManager;
        this.skeletonRenderer = new SkeletonMeshRenderer();
        this.debugShapeRenderer = new u();
        this.irisShader = tVar4;
    }

    public void setCamera(j jVar) {
        this.orthoCam = jVar;
        this.alphaPolyBatch.a(jVar.combined);
    }

    public k getPolyBatch() {
        return this.alphaPolyBatch;
    }

    public j getCamera() {
        return this.orthoCam;
    }

    public RenderManager2D getRenderManager() {
        return this.renderManager;
    }

    public SkeletonMeshRenderer getSkeletonRenderer() {
        return this.skeletonRenderer;
    }

    public u getDebugShapeRenderer() {
        return this.debugShapeRenderer;
    }

    public t getShader() {
        return this.assetManager.getShader();
    }

    public t getShader(ShaderAttribute shaderAttribute) {
        return this.assetManager.getShader(ShaderFactory.getShaderMask(shaderAttribute));
    }

    public t getShader(ShaderAttribute shaderAttribute, ShaderAttribute shaderAttribute2) {
        return this.assetManager.getShader(ShaderFactory.getShaderMask(shaderAttribute, shaderAttribute2));
    }

    public t getShader(ShaderAttribute shaderAttribute, ShaderAttribute shaderAttribute2, ShaderAttribute shaderAttribute3) {
        return this.assetManager.getShader(ShaderFactory.getShaderMask(shaderAttribute, shaderAttribute2, shaderAttribute3));
    }

    public t getDecalShader() {
        return this.decalShader;
    }

    public t getDarkDecalShader() {
        return this.darkDecalShader;
    }

    public t getDesaturateShader() {
        return this.desaturateShader;
    }

    public t getHsvShader() {
        return this.hsvDecalShader;
    }

    public void setDarkenShaderAlpha(float f) {
        this.darkenShaderAlpha = f;
    }

    public float getDarkenShaderAlpha() {
        return this.darkenShaderAlpha;
    }

    public t getIrisShader() {
        return this.irisShader;
    }

    public void transformWorldToIso(q qVar, p pVar) {
        pVar.b = calcIsoX(qVar.a, qVar.b);
        pVar.c = (qVar.b * 0.6f) + qVar.c;
    }

    public void transformWorldToIso(q qVar, q qVar2) {
        qVar2.a = calcIsoX(qVar.a, qVar.b);
        qVar2.b = (qVar.b * 0.6f) + qVar.c;
    }

    public void transformWorldToIso(p pVar, p pVar2) {
        pVar2.b = calcIsoX(pVar.b, pVar.c);
        pVar2.c = pVar.c * 0.6f;
    }

    private float calcIsoX(float f, float f2) {
        float f3 = (f2 - Environment.PLAYABLE_BOUNDS.c) / Environment.PLAYABLE_BOUNDS.e;
        if (this.dontSkew) {
            return f;
        }
        if (EnvironmentData.isTrapezoid(this.envType)) {
            return f * h.b(1.05f, 0.95f, f3);
        }
        float f4 = Environment.PLAYABLE_BOUNDS.d / 40.0f;
        f3 = h.b(f4, -f4, f3);
        if (EnvironmentData.getAngle(this.envType) < 0.0f) {
            f3 = -f3;
        }
        return f + f3;
    }

    public EnvironmentType getEnvType() {
        return this.envType;
    }

    public void setEnvType(EnvironmentType environmentType) {
        this.envType = environmentType;
    }

    public void setDontSkewEnv(boolean z) {
        this.dontSkew = z;
    }
}
