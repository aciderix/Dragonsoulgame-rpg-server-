package com.perblue.rpg.g2d.layers;

import com.perblue.rpg.assets.RPGAssetManager;
import com.perblue.rpg.g2d.RenderContext2D;
import com.perblue.rpg.g2d.Renderable2D;

public interface RenderGroup {
    void add(Renderable2D renderable2D);

    void dispose(RPGAssetManager rPGAssetManager);

    RenderGroupType getRenderGroupType();

    void remove(Renderable2D renderable2D);

    void render(RenderContext2D renderContext2D);

    void update(RenderContext2D renderContext2D, float f, float f2);
}
