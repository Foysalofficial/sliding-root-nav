package com.foysaldev.slidingrootnav.callback;

public interface DragStateListener {

    void onDragStart();
    void onDragEnd(boolean isMenuOpened);

}
