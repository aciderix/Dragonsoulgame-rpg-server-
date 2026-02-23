package com.perblue.rpg.g2d;

import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.graphics.g2d.n;

public class RPGAnimatedSprite extends RPGSprite {
    private a animation;
    private n.a currFrame;
    protected float stateTime;

    public RPGAnimatedSprite(a aVar) {
        super((n.a) aVar.a(0.0f));
        this.animation = aVar;
        this.currFrame = (n.a) aVar.a(0.0f);
    }

    public void update(float f) {
        this.stateTime += f;
        n.a aVar = (n.a) this.animation.a(this.stateTime);
        if (aVar != this.currFrame) {
            setAtlasRegion(aVar);
            this.currFrame = aVar;
        }
    }

    public void resetState() {
        this.stateTime = 0.0f;
    }

    public a getAnimation() {
        return this.animation;
    }

    public boolean isAnimationComplete() {
        return this.animation.b(this.stateTime) >= this.animation.a().length + -1;
    }

    public float getDuration() {
        return ((float) this.animation.a().length) * this.animation.b();
    }
}
