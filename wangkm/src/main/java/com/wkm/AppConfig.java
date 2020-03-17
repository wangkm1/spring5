package com.wkm;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: wangkm
 * @Date: 2020/2/25 09:25
 */
@Configurable
@ComponentScan("com.wkm")
public class AppConfig {
}
