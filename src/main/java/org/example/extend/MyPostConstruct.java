package org.example.extend;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * @PostConstruct 注解
 *
 * 其作用是在bean的初始化阶段，如果对一个方法标注了@PostConstruct，会先调用这个方法。
 * 这个触发点是在postProcessBeforeInitialization之后，
 * InitializingBean.afterPropertiesSet之前。
 *
 * 使用场景：可以对某一方法进行标注，来进行初始化某一个属性
 *
 */
@Component
public class MyPostConstruct {

    public MyPostConstruct(){
        System.out.println("MyPostConstruct");
    }

    @PostConstruct
    public void init(){
        System.out.println("MyPostConstruct init");
    }
}
