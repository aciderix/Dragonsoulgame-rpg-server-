package com.perblue.rpg.game.objects;

public interface ISceneListener {
    void entityAdded(IEntity iEntity);

    void entityDestroyed(IEntity iEntity);

    void entityMoved(IEntity iEntity);

    void entityRemoved(IEntity iEntity);

    void unitCostumeRefresh(IEntity iEntity);

    void unitRemoveRendering(IEntity iEntity);
}
