
    //	BeanFactory factory = new BeanFactory(new ClassPathResource("spring.xml"));
   // gives 13 because for this object we have initialized it

package com.tandan.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // First object
        Alien obj1 = (Alien) context.getBean("alien");
        obj1.show();
        System.out.println(obj1.getAge());
       obj1.compile();
  }
}


//we call objects as singleton beans as only 1 object is being created and many will be referencing from it.
//even if we not ask for object in scope then also it automatically gives us
//this is not the case in prototype