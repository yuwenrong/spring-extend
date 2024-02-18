package org.example.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.util.StringValueResolver;

/**
 * 这个类只有一个触发点，发生在bean的实例化之后，注入属性之前，也就是Setter之前。
 *这个类的扩展点方法为setBeanFactory，可以拿到BeanFactory这个属性。
 *
 * 可以对每个bean作特殊化的定制。也或者可以把BeanFactory拿到进行缓存，日后使用
 *
 *
 * BeanNameAware -> BeanClassLoaderAware -> BeanFactoryAware -> EnvironmentAware -> EmbeddedValueResolverAware -> ResourceLoaderAware -> ApplicationEventPublisherAware -> MessageSourceAware -> ApplicationContextAware -> ImportAware -> LoadTimeWeaverAware
 */
@Configuration
public class MyBeanFactoryAware implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, EnvironmentAware, EmbeddedValueResolverAware,
        ResourceLoaderAware, ApplicationEventPublisherAware, MessageSourceAware, ApplicationStartupAware, ApplicationContextAware, ImportAware,
        LoadTimeWeaverAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory***************************************");
    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }

    @Override
    public void setApplicationStartup(ApplicationStartup applicationStartup) {

    }

    @Override
    public void setMessageSource(MessageSource messageSource) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {

    }

    @Override
    public void setEnvironment(Environment environment) {

    }

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {

    }
}
