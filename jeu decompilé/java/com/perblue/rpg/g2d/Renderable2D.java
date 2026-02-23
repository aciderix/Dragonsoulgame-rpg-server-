package com.perblue.rpg.g2d;

import com.perblue.rpg.assets.RPGAssetManager;

public interface Renderable2D {
    void dispose(RPGAssetManager rPGAssetManager);

    float getDrawOrder();

    float getGroundX();

    float getGroundY();

    boolean isAlive();

    void render(RenderContext2D renderContext2D);

    void update(RenderContext2D renderContext2D, float f, float f2);
}
