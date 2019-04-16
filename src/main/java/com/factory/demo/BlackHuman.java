package com.factory.demo;

/**
 * 黑色人种
 * @pathName：BlackHuman
 * @author：ZhangWei
 */
public class BlackHuman implements Human {

    /**
     * 人种颜色
     */
    @Override
    public void personColor() {
        System.out.println("黑色皮肤");
    }

    /**
     * 人的行为：说话
     */
    @Override
    public void talk() {
        System.out.println("说话很难听懂");
    }
}
