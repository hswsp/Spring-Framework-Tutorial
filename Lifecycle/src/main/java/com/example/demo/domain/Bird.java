package com.example.demo.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author MrBird
 */
public class Bird implements InitializingBean, DisposableBean {

    public Bird() {
        System.out.println("调用无参构造器创建Bird");
    }

    @Override
    public void destroy() {
        System.out.println("DisposableBean 销毁Bird");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBean 初始化Bird");
    }
}
