package com.factory.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }*/

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        //生成白色人种
        Human whiteHuman = (Human) humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.personColor();
        whiteHuman.talk();
        //生成黑色人种
        Human blackHuman = (Human) humanFactory.createHuman(BlackHuman.class);
        blackHuman.personColor();
        blackHuman.talk();
        //生成黄色人种
        Human yellowHuman = (Human) humanFactory.createHuman(YellowHuman.class);
        yellowHuman.personColor();
        yellowHuman.talk();
    }
}
