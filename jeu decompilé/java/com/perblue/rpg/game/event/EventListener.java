package com.perblue.rpg.game.event;

public interface EventListener<E extends Event> {
    void onEvent(E e);
}
