package com.factory.demo;

/**
 * 人类抽象工厂
 * @pathName：AbstractHumanFactory
 * @author：ZhangWei
 */
public abstract class AbstractHumanFactory<T> {

    /**
     * 创建人的方法
     * @param c 人的类型
     * @return
     */
    public abstract T createHuman(Class c);

}
