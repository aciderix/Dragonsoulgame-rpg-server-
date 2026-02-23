package com.perblue.rpg.g2d.layers;

public enum RenderGroupType {
    BACKGROUND(true, false),
    SHADOWS(true, true),
    PARTICLES_GROUND(true, true),
    ENTITY(true, true),
    PARTICLES_FOREGROUND(true, true),
    FOREGROUND(false, false),
    FADE_LAYER(false, false);
    
    public final boolean sheared;
    public final boolean shouldSort;

    private RenderGroupType(boolean z, boolean z2) {
        this.shouldSort = z;
        this.sheared = z2;
    }
}
