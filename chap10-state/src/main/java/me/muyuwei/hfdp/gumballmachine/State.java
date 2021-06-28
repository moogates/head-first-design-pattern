package me.muyuwei.hfdp.gumballmachine;

public interface State {
    void onRefill(int count); // 加入糖果
    void onInsertQuarter();   // 插入硬币
    void onEjectQuarter();    // 弹出硬币
    void onTurnCrank();       // 转动按钮
}
