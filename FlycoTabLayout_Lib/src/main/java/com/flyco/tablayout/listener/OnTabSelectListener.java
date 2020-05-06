package com.flyco.tablayout.listener;

public interface OnTabSelectListener {
    void onTabSelect(int position);

    default void onTabReselect(int position) {
    }
}