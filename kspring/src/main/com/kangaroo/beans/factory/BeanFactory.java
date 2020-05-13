package com.kangaroo.beans.factory;

import com.kangaroo.beans.BeanDefinition;

public interface BeanFactory {

    BeanDefinition getBeanDefinition(String beanID);

    public Object getBean(String beanID);

}
