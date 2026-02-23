package com.perblue.rpg.g2d;

import com.badlogic.gdx.graphics.g2d.f;
import com.badlogic.gdx.graphics.g2d.g;
import com.badlogic.gdx.graphics.g3d.b.a;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.p;
import com.badlogic.gdx.math.q;
import com.badlogic.gdx.n;
import com.esotericsoftware.spine.Bone;
import com.perblue.rpg.assets.RPGAssetManager;
import com.perblue.rpg.g2d.layers.RenderGroupType;
import com.perblue.rpg.game.data.display.DisplayDataUtil;
import com.perblue.rpg.game.objects.AnimationElement;
import com.perblue.rpg.game.objects.Entity;
import com.perblue.rpg.game.objects.Unit;
import com.perblue.rpg.simulation.AnimationConstants;
import com.perblue.rpg.simulation.ai.AIHelper;
import com.perblue.rpg.simulation.ai.Direction;
import com.perblue.rpg.simulation.skills.UnstableUnderstudySkill3.UnstableUnderstudyPolymorph;
import com.perblue.rpg.util.TempVars;
import java.util.Locale;

public class RPGParticleEffect implements Renderable2D {
    private static n particleDecalConverter$60a37c36 = new n() {
        public final a convert(a aVar) {
            return aVar;
        }
    };
    private long current;
    private int drawOrder = 0;
    public final f effect;
    private long emitDuration;
    private boolean flipX;
    private Bone followBone;
    private Entity followEntity;
    private boolean needToUpdateIsoPos = true;
    private p offset;
    private Matrix4 privateTmpOldProjMat = TempVars.obtainMat4();
    private boolean removeOnCompletion;
    private RenderGroupType renderGroup;
    private q sortPosition;
    public final ParticleType type;
    private q worldRenderPosition;

    public String toString() {
        return String.format(Locale.US, "%s [%d/%d]", new Object[]{this.type, Long.valueOf(this.current), Long.valueOf(this.emitDuration)});
    }

    public RPGParticleEffect(ParticleType particleType, f fVar, p pVar, float f, float f2, long j, @Deprecated boolean z) {
        boolean z2 = true;
        this.type = particleType;
        this.effect = fVar;
        this.worldRenderPosition = TempVars.obtainVec3().a(0.0f, 0.0f, 0.0f);
        this.sortPosition = TempVars.obtainVec3().a(0.0f, 0.0f, 0.0f);
        this.offset = TempVars.obtainVec2().a(pVar);
        if (z || j >= 0) {
            z2 = false;
        }
        this.removeOnCompletion = z2;
        if (j < 0) {
            j = Long.MAX_VALUE;
        }
        this.emitDuration = j;
        fVar.b(f);
        if (f2 != 0.0f) {
            fVar.c(f2);
        }
    }

    public q getSortPosition() {
        return this.sortPosition;
    }

    public q getWorldPosition() {
        return this.worldRenderPosition;
    }

    public void setUpdatedWorldPos(q qVar) {
        setUpdatedWorldPos(qVar.a, qVar.b, qVar.c);
    }

    public void setUpdatedWorldPos(float f, float f2, float f3) {
        if (this.worldRenderPosition != null) {
            if (this.flipX) {
                f = -f;
            }
            if (!(this.worldRenderPosition.a == f && this.worldRenderPosition.b == f2 && this.worldRenderPosition.c == f3)) {
                this.needToUpdateIsoPos = true;
            }
            this.worldRenderPosition.a(f, f2, f3);
        }
    }

    public n getDecalConverter$79e73e29(RenderContext2D renderContext2D) {
        return particleDecalConverter$60a37c36;
    }

    public void update(RenderContext2D renderContext2D, float f, float f2) {
        if (!this.type.useSimulationTime()) {
            f2 = f;
        }
        if (f2 > 0.0f) {
            float f3;
            float worldY;
            float playSpeed = f2 * this.type.getPlaySpeed();
            this.current = (long) (((float) this.current) + (1000.0f * playSpeed));
            if (this.followBone != null) {
                float f4;
                AnimationElement animationElement = this.followEntity.getAnimationElement();
                if (animationElement != null) {
                    animationElement.updateWorldTransform();
                }
                this.sortPosition.a(this.followEntity.getPosition());
                f3 = this.followEntity.getPosition().a;
                if (AIHelper.getDirection(this.followEntity) == Direction.RIGHT) {
                    f3 += this.followBone.getWorldX() * this.followEntity.getScale();
                } else {
                    f3 -= this.followBone.getWorldX() * this.followEntity.getScale();
                }
                if (this.flipX) {
                    f3 = -f3;
                }
                float f5 = this.followEntity.getPosition().b;
                worldY = this.followEntity.getPosition().c + (this.followBone.getWorldY() * this.followEntity.getScale());
                if (this.offset != null) {
                    if (AIHelper.getDirection(this.followEntity) == Direction.RIGHT) {
                        f3 += this.offset.b;
                    } else {
                        f3 -= this.offset.b;
                    }
                    f4 = worldY + this.offset.c;
                    worldY = f3;
                    f3 = f4;
                } else {
                    f4 = worldY;
                    worldY = f3;
                    f3 = f4;
                }
                if (this.followBone.getData().getName().equals(AnimationConstants.BUFF_LOCATION_BONE) && this.followEntity.hasBuff(UnstableUnderstudyPolymorph.class)) {
                    int i;
                    worldY = this.followEntity.getPosition().a;
                    if (this.flipX) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    f5 = worldY * ((float) i);
                    worldY = this.followEntity.getPosition().b;
                    f3 = this.followEntity.getPosition().c + 300.0f;
                } else {
                    f4 = f5;
                    f5 = worldY;
                    worldY = f4;
                }
                if (!(f5 == this.worldRenderPosition.a && worldY == this.worldRenderPosition.b && f3 == this.worldRenderPosition.c)) {
                    this.worldRenderPosition.a(f5, worldY, f3);
                    this.needToUpdateIsoPos = true;
                }
            } else {
                this.sortPosition.a(this.worldRenderPosition);
                if (this.flipX) {
                    q qVar = this.sortPosition;
                    qVar.a = -qVar.a;
                }
                if (this.type.renderOnGround() && this.followEntity != null) {
                    this.offset.c = -DisplayDataUtil.getFlyingHeight(((Unit) this.followEntity).getData().getType());
                }
            }
            if (this.needToUpdateIsoPos) {
                p obtainVec2 = TempVars.obtainVec2();
                renderContext2D.transformWorldToIso(this.worldRenderPosition, obtainVec2);
                this.effect.a(obtainVec2.b + this.offset.b, obtainVec2.c + this.offset.c);
                TempVars.free(obtainVec2);
                this.needToUpdateIsoPos = false;
            }
            this.effect.a(playSpeed);
            if (this.effect.d() && !this.removeOnCompletion) {
                if (this.emitDuration < 0 || this.current < this.emitDuration) {
                    f3 = this.effect.g();
                    worldY = this.effect.h();
                    this.effect.b();
                    this.effect.b(f3);
                    this.effect.c(worldY);
                    this.effect.i();
                }
            }
        }
    }

    public void setRotation(float f) {
        this.effect.c(f);
    }

    public void setDuration(long j) {
        this.emitDuration = this.current + j;
    }

    /* DevToolsApp WARNING: Removed duplicated region for block: B:12:0x008a  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:9:0x005c  */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:15:? A:{SYNTHETIC, RETURN} */
    /* DevToolsApp WARNING: Removed duplicated region for block: B:11:0x0081  */
    public void render(com.perblue.rpg.g2d.RenderContext2D r10) {
        /*
        r9 = this;
        r8 = 3089; // 0xc11 float:4.329E-42 double:1.526E-320;
        r1 = 0;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r10.getPolyBatch();
        r0 = r9.followEntity;
        if (r0 == 0) goto L_0x0094;
    L_0x000d:
        r0 = r9.followEntity;
        r0 = r0 instanceof com.perblue.rpg.game.objects.Unit;
        if (r0 == 0) goto L_0x0094;
    L_0x0013:
        r0 = r9.followEntity;
        r0 = (com.perblue.rpg.game.objects.Unit) r0;
        r3 = com.perblue.rpg.game.buff.DungeonManTrappedBuff.class;
        r3 = r0.hasBuff(r3);
        if (r3 == 0) goto L_0x0094;
    L_0x001f:
        r2.e();
        r3 = com.perblue.rpg.util.TempVars.obtainVec3();
        r0 = r0.getDoorScissorPosition();
        r10.transformWorldToIso(r0, r3);
        r0 = r3.b;
        r4 = 1108082688; // 0x420c0000 float:35.0 double:5.47465589E-315;
        r0 = r0 + r4;
        r3.b = r0;
        r0 = r10.getCamera();
        r0.project(r3);
        r0 = com.badlogic.gdx.utils.b.a.g;
        r0.glEnable(r8);
        r0 = com.badlogic.gdx.utils.b.a.g;
        r4 = r3.b;
        r4 = (int) r4;
        r5 = com.badlogic.gdx.utils.b.a.b;
        r5 = r5.getWidth();
        r6 = com.badlogic.gdx.utils.b.a.b;
        r6 = r6.getHeight();
        r0.glScissor(r1, r4, r5, r6);
        com.perblue.rpg.util.TempVars.free(r3);
        r0 = 1;
    L_0x0058:
        r1 = r9.flipX;
        if (r1 == 0) goto L_0x008a;
    L_0x005c:
        r1 = r9.privateTmpOldProjMat;
        r3 = r2.f();
        r1.a(r3);
        r1 = r2.f();
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r1.b(r3, r7, r7);
        r2.a(r1);
        r1 = r9.effect;
        r3 = r10.getPolyBatch();
        r1.a(r3);
        r1 = r9.privateTmpOldProjMat;
        r2.a(r1);
    L_0x007f:
        if (r0 == 0) goto L_0x0089;
    L_0x0081:
        r2.e();
        r0 = com.badlogic.gdx.utils.b.a.g;
        r0.glDisable(r8);
    L_0x0089:
        return;
    L_0x008a:
        r1 = r9.effect;
        r3 = r10.getPolyBatch();
        r1.a(r3);
        goto L_0x007f;
    L_0x0094:
        r0 = r1;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.perblue.rpg.g2d.RPGParticleEffect.render(com.perblue.rpg.g2d.RenderContext2D):void");
    }

    public boolean isComplete() {
        if (this.removeOnCompletion) {
            return this.effect.d();
        }
        if (this.effect.d()) {
            return true;
        }
        if (this.current > this.emitDuration) {
            stopEmitting();
            if (!this.type.shouldAllowCompletion()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAlive() {
        return !isComplete();
    }

    public void dispose(RPGAssetManager rPGAssetManager) {
        if (this.effect instanceof g.a) {
            ((g.a) this.effect).j();
        }
        if (this.worldRenderPosition != null) {
            TempVars.free(this.worldRenderPosition);
            TempVars.free(this.sortPosition);
            TempVars.free(this.offset);
        }
        if (this.privateTmpOldProjMat != null) {
            TempVars.free(this.privateTmpOldProjMat);
            this.privateTmpOldProjMat = null;
        }
        this.worldRenderPosition = null;
        this.sortPosition = null;
        this.offset = null;
        this.renderGroup = null;
    }

    public void stopEmitting() {
        this.effect.a(false);
        this.effect.c();
        this.removeOnCompletion = true;
    }

    public float getGroundX() {
        return this.sortPosition.a;
    }

    public float getGroundY() {
        return this.sortPosition.b;
    }

    public void setRenderGroup(RenderGroupType renderGroupType) {
        this.renderGroup = renderGroupType;
    }

    public RenderGroupType getRenderGroup() {
        return this.renderGroup;
    }

    public Bone getFollowBone() {
        return this.followBone;
    }

    public void setFollow(Entity entity, Bone bone) {
        this.followEntity = entity;
        this.followBone = bone;
    }

    public void setEntity(Entity entity) {
        this.followEntity = entity;
    }

    public void setFlipX(boolean z) {
        this.flipX = z;
        setUpdatedWorldPos(this.worldRenderPosition);
    }

    public boolean getFlipX() {
        return this.flipX;
    }

    public void setOffset(p pVar) {
        if (this.offset != null) {
            this.offset.a(pVar);
        }
    }

    public float getDrawOrder() {
        return (float) this.drawOrder;
    }

    public void setDrawOrder(int i) {
        this.drawOrder = i;
    }
}
