package com.perblue.rpg.g2d;

import com.badlogic.gdx.graphics.g2d.n;
import com.badlogic.gdx.graphics.g2d.n.a;
import com.badlogic.gdx.graphics.g2d.n.b;
import com.perblue.rpg.assets.RPGAssetManager;

public class RPGSprite extends b {
    private n parentAtlas;
    private RotationType rotationType = RotationType.FULL;
    private IsoPosition sourcePosition = new IsoPosition();

    public RPGSprite(a aVar) {
        super(aVar);
    }

    public IsoPosition getSourcePosition() {
        return this.sourcePosition;
    }

    public void setSourcePosition(IsoPosition isoPosition) {
        this.sourcePosition.set(isoPosition);
    }

    public void dispose(RPGAssetManager rPGAssetManager) {
        if (this.parentAtlas != null) {
            rPGAssetManager.unloadAsset(this.parentAtlas);
            this.parentAtlas = null;
        }
    }

    public float getGroundX() {
        return this.sourcePosition.getGroundX();
    }

    public float getGroundY() {
        return this.sourcePosition.getGroundY();
    }

    public void setRotationType(RotationType rotationType) {
        this.rotationType = rotationType;
    }

    public RotationType getRotationType() {
        return this.rotationType;
    }

    public void setParentAtlas(n nVar) {
        this.parentAtlas = nVar;
    }
}
