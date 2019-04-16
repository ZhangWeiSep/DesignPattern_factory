package com.factory.demo;

/**
 * 白色人种
 * @pathName：WhiteHuman
 * @author：ZhangWei
 */
public class WhiteHuman implements Human {


    /**
     * 人种颜色
     */
    @Override
    public void personColor() {
        System.out.println("白色皮肤");
    }

    /**
     * 人的行为：说话
     */
    @Override
    public void talk() {
        System.out.println("说话一般是单字节");
    }
}
