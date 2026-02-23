package com.perblue.rpg.g2d.layers;

import com.badlogic.gdx.utils.h;
import com.perblue.rpg.assets.RPGAssetManager;
import com.perblue.rpg.g2d.RenderContext2D;
import com.perblue.rpg.g2d.Renderable2D;
import java.util.Iterator;

public class BasicRenderGroup implements RenderGroup {
    private RPGAssetManager assetManager;
    private RenderGroupType renderLayer;
    protected h<Renderable2D> renderables = new h();

    public BasicRenderGroup(RenderGroupType renderGroupType, RPGAssetManager rPGAssetManager) {
        this.renderLayer = renderGroupType;
        this.assetManager = rPGAssetManager;
    }

    public void add(Renderable2D renderable2D) {
        this.renderables.add(renderable2D);
    }

    public void remove(Renderable2D renderable2D) {
        this.renderables.c(renderable2D, true);
    }

    public void update(RenderContext2D renderContext2D, float f, float f2) {
        this.renderables.g();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.renderables.b) {
                Renderable2D renderable2D = (Renderable2D) this.renderables.a(i2);
                if (renderable2D.isAlive()) {
                    renderable2D.update(renderContext2D, f, f2);
                } else {
                    renderable2D.dispose(this.assetManager);
                    this.renderables.b(i2);
                }
                i = i2 + 1;
            } else {
                this.renderables.h();
                return;
            }
        }
    }

    public Iterable<Renderable2D> getIterable() {
        return this.renderables;
    }

    public h<Renderable2D> getInternalArray() {
        return this.renderables;
    }

    public void render(RenderContext2D renderContext2D) {
        renderContext2D.getRenderManager().start(this.renderLayer.shouldSort);
        renderContext2D.getRenderManager().addAll(this.renderables);
        renderContext2D.getRenderManager().end(renderContext2D);
    }

    public void dispose(RPGAssetManager rPGAssetManager) {
        Iterator it = this.renderables.iterator();
        while (it.hasNext()) {
            ((Renderable2D) it.next()).dispose(rPGAssetManager);
        }
        this.renderables.clear();
    }

    public RenderGroupType getRenderGroupType() {
        return this.renderLayer;
    }
}
