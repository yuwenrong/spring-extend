package org.example.extend;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 初始化bean的
 *
 *
 * 使用场景：实现此接口，来进行系统启动的时候一些业务指标的初始化工作。
 */
@Component
public class MyInitializingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[InitializingBean] MyInitializingBean");
    }
}
