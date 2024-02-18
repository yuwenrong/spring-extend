package org.example.extend;

import org.springframework.beans.factory.FactoryBean;

/**
 *
 *
 * 使用场景：用户可以扩展这个类，来为要实例化的bean作一个代理，比如为该对象的所有的方法作一个拦截，在调用前后输出一行log，模仿ProxyFactoryBean的功能。
 *
 *
 * FactoryBean表现的是一个工厂的职责。 即一个Bean A如果实现了FactoryBean接口，那么A就变成了一个工厂，根据A的名称获取到的实际上是工厂调用getObject()返回的对象，而不是A本身，如果要获取工厂A自身的实例，那么需要在名称前面加上'&'符号。
 *
 *
 * FactoryBean在Spring中最为典型的一个应用就是用来创建AOP的代理对象。
 * 我们知道AOP实际上是Spring在运行时创建了一个代理对象，也就是说这个对象，是我们在运行时创建的，而不是一开始就定义好的，这很符合工厂方法模式。更形象地说，AOP代理对象通过Java的反射机制，在运行时创建了一个代理对象，在代理对象的目标方法中根据业务要求织入了相应的方法。这个对象在Spring中就是——ProxyFactoryBean。
 *
 * 所以，FactoryBean为我们实例化Bean提供了一个更为灵活的方式，我们可以通过FactoryBean创建出更为复杂的Bean实例。
 *
 * 当然在spring中，Spring容器内部许多地方了使用FactoryBean。下面是一些比较常见的FactoryBean实现：
 *
 * JndiobjectFactoryBean
 * LocalSessionFactoryBean
 * SqlMapClientFactoryBean
 * ProxyFactoryBean
 * TransactionProxyFactoryBean
 *
 *
 * Mybatis中的SqlSessionFactoryBean
 */
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
