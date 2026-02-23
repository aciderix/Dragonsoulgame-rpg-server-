package com.perblue.rpg.g2d;

import com.perblue.rpg.assets.RPGAssetManager;

public class SpriteRenderable implements Renderable2D {
    protected RPGSprite sprite;

    public SpriteRenderable(RPGSprite rPGSprite) {
        this.sprite = rPGSprite;
    }

    public void render(RenderContext2D renderContext2D) {
        this.sprite.draw$17d2f830(renderContext2D.getPolyBatch());
    }

    public void update(RenderContext2D renderContext2D, float f, float f2) {
    }

    public RPGSprite getDecal() {
        return this.sprite;
    }

    public void dispose(RPGAssetManager rPGAssetManager) {
        if (this.sprite != null) {
            this.sprite.dispose(rPGAssetManager);
            this.sprite = null;
        }
    }

    public boolean isAlive() {
        return true;
    }

    public float getGroundX() {
        return this.sprite.getGroundX();
    }

    public float getGroundY() {
        return this.sprite.getGroundY();
    }

    public float getDrawOrder() {
        return 0.0f;
    }
}
