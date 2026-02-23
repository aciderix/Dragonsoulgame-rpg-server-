package com.perblue.rpg.g2d;

import com.badlogic.gdx.a.a.d;
import com.badlogic.gdx.a.a.l;
import com.badlogic.gdx.a.c;
import com.badlogic.gdx.a.e;
import com.badlogic.gdx.c.a;
import com.badlogic.gdx.graphics.g2d.n;
import com.esotericsoftware.spine.SkeletonBinary;
import com.esotericsoftware.spine.SkeletonData;
import com.esotericsoftware.spine.SkeletonJson;

public class SkeletonDataLoader extends l<SkeletonData, SkeletonDataParameter> {

    public static class SkeletonDataParameter extends c<SkeletonData> {
        public String atlasFile;
        public float scale = 1.0f;

        public SkeletonDataParameter(String str) {
            this.atlasFile = str;
        }

        public SkeletonDataParameter(String str, float f) {
            this.atlasFile = str;
            this.scale = f;
        }
    }

    public SkeletonDataLoader(d dVar) {
        super(dVar);
    }

    public a resolve(String str) {
        if (str.contains(".skel")) {
            str = str.replaceAll("skel_.*", "skel");
        }
        return super.resolve(str);
    }

    public SkeletonData load(e eVar, String str, a aVar, SkeletonDataParameter skeletonDataParameter) {
        n nVar = (n) eVar.get(skeletonDataParameter.atlasFile, n.class);
        float f = skeletonDataParameter.scale;
        if (str.contains(".skel")) {
            str = str.replaceAll("skel_.*", "skel");
        }
        if (str.endsWith("json") || str.endsWith("txt")) {
            SkeletonJson skeletonJson = new SkeletonJson(nVar);
            skeletonJson.setScale(f);
            return skeletonJson.readSkeletonData(aVar);
        }
        SkeletonBinary skeletonBinary = new SkeletonBinary(nVar);
        skeletonBinary.setScale(f);
        return skeletonBinary.readSkeletonData(aVar);
    }

    public com.badlogic.gdx.utils.a<com.badlogic.gdx.a.a> getDependencies(String str, a aVar, SkeletonDataParameter skeletonDataParameter) {
        com.badlogic.gdx.utils.a<com.badlogic.gdx.a.a> aVar2 = new com.badlogic.gdx.utils.a();
        if (skeletonDataParameter == null || skeletonDataParameter.atlasFile == null) {
            throw new RuntimeException("The atlas parameter is required to load the skeleton");
        }
        if (!(skeletonDataParameter == null || skeletonDataParameter.atlasFile == null)) {
            aVar2.add(new com.badlogic.gdx.a.a(resolve(skeletonDataParameter.atlasFile), n.class));
        }
        return aVar2;
    }
}
