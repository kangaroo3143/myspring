package com.kangaroo.test.v1;

import com.kangaroo.beans.BeanDefinition;
import com.kangaroo.beans.factory.BeanFactory;
import com.kangaroo.beans.factory.support.DefaultBeanfactory;
import org.junit.Test;

public class BeanFactoryTest {



@Test
    public void testGetBean(){
        BeanFactory factory=new DefaultBeanfactory("petstore-v1.xml");
        BeanDefinition bd = factory.getBeanDefinition("petS");

    }


}



