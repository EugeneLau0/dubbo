package org.apache.dubbo.springboot.demo.impl;

import org.apache.dubbo.springboot.demo.Robot;

/**
 * @author eugene
 * @version 1.0.0
 * @since 2022/4/5
 **/
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("I'm OptimusPrime!");
    }
}
