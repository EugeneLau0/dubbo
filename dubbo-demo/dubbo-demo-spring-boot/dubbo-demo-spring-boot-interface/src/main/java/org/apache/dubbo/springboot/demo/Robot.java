package org.apache.dubbo.springboot.demo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author eugene
 * @version 1.0.0
 * @since 2022/4/5
 **/
@SPI
public interface Robot {
    void sayHello();
}
