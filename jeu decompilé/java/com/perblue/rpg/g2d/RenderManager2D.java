package com.perblue.rpg.g2d;

import com.badlogic.gdx.utils.a;
import java.util.Comparator;
import java.util.Iterator;

public class RenderManager2D {
    private Comparator<Renderable2D> comparator = new Comparator<Renderable2D>() {
        public int compare(Renderable2D renderable2D, Renderable2D renderable2D2) {
            int compareOrder = compareOrder(renderable2D, renderable2D2);
            if (compareOrder == 0) {
                compareOrder = compareY(renderable2D, renderable2D2);
            }
            if (compareOrder == 0) {
                return compareX(renderable2D, renderable2D2);
            }
            return compareOrder;
        }

        private int compareY(Renderable2D renderable2D, Renderable2D renderable2D2) {
            float access$000 = RenderManager2D.floatDelta(renderable2D.getGroundY(), renderable2D2.getGroundY());
            if (access$000 < 0.0f) {
                return 1;
            }
            if (access$000 > 0.0f) {
                return -1;
            }
            return 0;
        }

        private int compareX(Renderable2D renderable2D, Renderable2D renderable2D2) {
            float access$000 = RenderManager2D.floatDelta(renderable2D.getGroundX(), renderable2D2.getGroundX());
            if (access$000 < 0.0f) {
                return 1;
            }
            if (access$000 > 0.0f) {
                return -1;
            }
            return 0;
        }

        private int compareOrder(Renderable2D renderable2D, Renderable2D renderable2D2) {
            float access$000 = RenderManager2D.floatDelta(renderable2D.getDrawOrder(), renderable2D2.getDrawOrder());
            if (access$000 < 0.0f) {
                return 1;
            }
            if (access$000 > 0.0f) {
                return -1;
            }
            return 0;
        }
    };
    private a<Renderable2D> renderables = new a();
    private boolean shouldSort;

    public void addAll(a<Renderable2D> aVar) {
        this.renderables.a((a) aVar);
    }

    public void add(Renderable2D renderable2D) {
        this.renderables.add(renderable2D);
    }

    public void start(boolean z) {
        this.shouldSort = z;
    }

    public void end(RenderContext2D renderContext2D) {
        if (this.shouldSort) {
            this.renderables.a(this.comparator);
        }
        renderContext2D.getPolyBatch().a();
        if (renderContext2D.getDarkenShaderAlpha() < 1.0f) {
            renderContext2D.getDarkDecalShader().setUniformf("u_darkenAlpha", renderContext2D.getDarkenShaderAlpha());
        }
        Iterator it = this.renderables.iterator();
        while (it.hasNext()) {
            ((Renderable2D) it.next()).render(renderContext2D);
        }
        renderContext2D.getPolyBatch().b();
        this.renderables.clear();
    }

    private static float floatDelta(float f, float f2) {
        if (Float.isNaN(f)) {
            if (Float.isNaN(f2)) {
                return 0.0f;
            }
            return 1.0f;
        } else if (!Float.isNaN(f2)) {
            return f - f2;
        } else {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            return -1.0f;
        }
    }
}
