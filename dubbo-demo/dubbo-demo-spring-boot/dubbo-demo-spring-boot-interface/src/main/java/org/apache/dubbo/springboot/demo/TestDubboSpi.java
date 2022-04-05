package org.apache.dubbo.springboot.demo;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author eugene
 * @version 1.0.0
 * @since 2022/4/5
 **/
public class TestDubboSpi {
    public static void main(String[] args) {
        ExtensionLoader<Robot> loader = ExtensionLoader
            .getExtensionLoader(Robot.class);
        Robot prime = loader.getExtension("optimusPrime");
        prime.sayHello();
        Robot bumblebee = loader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
