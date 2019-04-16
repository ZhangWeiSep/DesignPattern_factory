package com.factory.demo;

/**
 * 创建人类工厂
 * @pathName：HumanFactory
 * @author：ZhangWei
 */
public class HumanFactory<T> extends AbstractHumanFactory {

    /**
     * 创建人的方法
     *
     * @param c 人的类型
     * @return
     */
    @Override
    public T createHuman(Class c) {
        T human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
