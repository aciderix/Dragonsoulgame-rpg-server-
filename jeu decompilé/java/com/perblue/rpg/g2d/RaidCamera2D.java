package com.perblue.rpg.g2d;

import a.a.c;
import a.a.d;
import a.a.f;
import com.badlogic.gdx.graphics.j;
import com.badlogic.gdx.math.h;
import com.badlogic.gdx.math.p;
import com.badlogic.gdx.math.q;
import com.badlogic.gdx.utils.b.a;
import com.perblue.b.b;
import com.perblue.rpg.util.TempVars;

public class RaidCamera2D extends j implements b {
    private static final float SHAKE_FREQ_X = 62.831856f;
    private static final float SHAKE_FREQ_Y = 47.12389f;
    private static final float SHAKE_LENGTH = 0.5f;
    private boolean cameraBound = true;
    private long lastZoomTime = 0;
    private float maxBaseShakeAmplitude = 100.0f;
    protected float maxZoom = 1.0f;
    protected float minZoom = 1.0f;
    private p prevShakeOffset = new p();
    private float prevZoom = this.zoom;
    private float shakeAmplitude = 0.0f;
    private float shakeAnimTime = 0.0f;
    private p shakeOffset = new p();
    protected float sizeX = 0.0f;
    protected float sizeY = 0.0f;
    private float velocityX = 0.0f;
    private float velocityY = 0.0f;

    public RaidCamera2D(float f, float f2) {
        super(f, f2);
        checkBounds();
    }

    public boolean touchDown(float f, float f2, int i, int i2) {
        this.prevZoom = this.zoom;
        this.velocityX = 0.0f;
        this.velocityY = 0.0f;
        return false;
    }

    public boolean tap(float f, float f2, int i, int i2) {
        return false;
    }

    public boolean longPress(float f, float f2) {
        return false;
    }

    public boolean fling(float f, float f2, int i) {
        if (this.lastZoomTime + 300 < System.currentTimeMillis()) {
            float f3 = this.zoom / this.minZoom;
            this.velocityX = f * f3;
            this.velocityY = f3 * f2;
        }
        return false;
    }

    public boolean pan(float f, float f2, float f3, float f4) {
        translate((-f3) * this.zoom, this.zoom * f4);
        checkBounds();
        return false;
    }

    public void setCameraBound(boolean z) {
        this.cameraBound = z;
    }

    public boolean isCameraBound() {
        return this.cameraBound;
    }

    protected void checkBounds() {
        if (this.cameraBound) {
            this.position.a = 0.0f;
            this.position.b = 0.0f;
        }
    }

    public boolean panStop(float f, float f2, int i, int i2) {
        checkBounds();
        return false;
    }

    public boolean zoom(float f, float f2) {
        return false;
    }

    public void setZoom(float f) {
        this.zoom = f;
        checkBounds();
    }

    public void setPosition(p pVar) {
        setPosition(pVar.b, pVar.c);
    }

    public void setPosition(float f, float f2) {
        this.position.a = f;
        this.position.b = f2;
        checkBounds();
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public boolean pinch(p pVar, p pVar2, p pVar3, p pVar4) {
        float c = pVar.c(pVar2) / pVar3.c(pVar4);
        this.zoom = this.prevZoom * c;
        this.zoom = Math.min(this.maxZoom, c * this.prevZoom);
        this.zoom = Math.max(this.minZoom, this.zoom);
        this.velocityX = 0.0f;
        this.velocityY = 0.0f;
        this.lastZoomTime = System.currentTimeMillis();
        checkBounds();
        return false;
    }

    public boolean scrolled(int i) {
        this.zoom += ((float) i) / 3.0f;
        this.zoom = h.a(this.zoom, this.minZoom, this.maxZoom);
        this.velocityX = 0.0f;
        this.velocityY = 0.0f;
        this.lastZoomTime = System.currentTimeMillis();
        checkBounds();
        return false;
    }

    public void setMinZoom(float f) {
        this.minZoom = f;
    }

    public float getMinZoom() {
        return this.minZoom;
    }

    public void setWorldSize(float f, float f2) {
        this.maxZoom = f / this.viewportWidth;
        this.minZoom = this.maxZoom;
        this.zoom = f / this.viewportWidth;
        this.sizeX = f / 2.0f;
        this.sizeY = f2 / 2.0f;
    }

    public void addShake(float f) {
        if (this.shakeAmplitude == 0.0f) {
            this.shakeAnimTime = 0.0f;
            this.position.c(this.shakeOffset.b, this.shakeOffset.c, 0.0f);
            this.shakeOffset.b(0.0f, 0.0f);
            this.prevShakeOffset.b(0.0f, 0.0f);
        }
        float f2 = this.maxBaseShakeAmplitude * this.zoom;
        float a = h.a(f, 0.0f, 1.0f) * f2;
        if (a > this.shakeAmplitude) {
            this.shakeAmplitude = a + (this.shakeAmplitude * 0.1f);
        } else {
            this.shakeAmplitude = ((a / this.shakeAmplitude) * (0.2f * a)) + this.shakeAmplitude;
        }
        this.shakeAmplitude = Math.min(this.shakeAmplitude, f2);
    }

    public void update() {
        float deltaTime = a.b.getDeltaTime();
        this.maxBaseShakeAmplitude = 0.01f * Math.max(this.viewportWidth, this.viewportHeight);
        if (this.shakeOffset == null) {
            this.shakeOffset = new p();
        }
        if (this.prevShakeOffset == null) {
            this.prevShakeOffset = new p();
        }
        if (!a.d.c()) {
            float f = 5.0f * deltaTime;
            q qVar = this.position;
            qVar.a += (-this.velocityX) * deltaTime;
            qVar = this.position;
            qVar.b += this.velocityY * deltaTime;
            this.velocityX *= 1.0f - f;
            this.velocityY = (1.0f - f) * this.velocityY;
        }
        if (this.shakeAmplitude > 0.0f) {
            this.shakeAmplitude -= ((this.maxBaseShakeAmplitude * this.zoom) * deltaTime) / SHAKE_LENGTH;
            this.shakeAmplitude = Math.max(0.0f, this.shakeAmplitude);
            this.shakeAnimTime = deltaTime + this.shakeAnimTime;
            this.prevShakeOffset.a(this.shakeOffset);
            this.shakeOffset.b(this.shakeAmplitude * h.b(SHAKE_FREQ_X * this.shakeAnimTime), this.shakeAmplitude * h.b(SHAKE_FREQ_Y * this.shakeAnimTime));
            p obtainVec2 = TempVars.obtainVec2();
            obtainVec2.a(this.shakeOffset).b(this.prevShakeOffset);
            this.position.b(obtainVec2.b, obtainVec2.c, 0.0f);
            TempVars.free(obtainVec2);
        }
        checkBounds();
        super.update();
    }

    public void animateToPosition$2ca9d575(a.a.h hVar, p pVar, float f, com.perblue.common.c.b bVar, final Runnable runnable) {
        d a = d.a((Object) this, 1, f).a(bVar).a(pVar.b, pVar.c);
        a.a.a p = c.p();
        p.a(a);
        p.a(d.b(new f() {
            public void onEvent(int i, a.a.a<?> aVar) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }));
        hVar.a(p);
    }

    public void animateToPosition(a.a.h hVar, p pVar, Runnable runnable) {
        animateToPosition$2ca9d575(hVar, pVar, 0.75f, a.a.a.d.b, runnable);
    }

    public void setVelocity(int i, int i2) {
        this.velocityX = (float) i;
        this.velocityY = (float) i2;
    }

    public void pinchStop() {
    }
}
