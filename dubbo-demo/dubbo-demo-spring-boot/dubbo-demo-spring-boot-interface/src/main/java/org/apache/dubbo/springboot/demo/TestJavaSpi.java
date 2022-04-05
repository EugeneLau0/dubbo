package org.apache.dubbo.springboot.demo;

import java.util.ServiceLoader;

/**
 * @author eugene
 * @version 1.0.0
 * @since 2022/4/5
 **/
public class TestJavaSpi {

    public static void main(String[] args) {
        ServiceLoader<Robot> load = ServiceLoader.load(Robot.class);
        System.out.println("java spi");
        load.forEach(Robot::sayHello);
    }
}
