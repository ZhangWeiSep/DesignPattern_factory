package com.factory.demo;

/**
 * 黄色人种
 * @pathName：YellowHuman
 * @author：ZhangWei
 */
public class YellowHuman implements Human {
    /**
     * 人种颜色
     */
    @Override
    public void personColor() {
        System.out.println("黄色皮肤");
    }

    /**
     * 人的行为：说话
     */
    @Override
    public void talk() {
        System.out.println("说话一般用双字节");
    }
}
