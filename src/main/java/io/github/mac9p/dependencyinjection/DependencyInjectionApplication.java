package io.github.mac9p.dependencyinjection;

import io.github.mac9p.dependencyinjection.controllers.*;
import io.github.mac9p.dependencyinjection.services.PrototypeBean;
import io.github.mac9p.dependencyinjection.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());



        MyController myController = (MyController) context.getBean("myController");
        System.out.println("------------ Primary");
        System.out.println(myController.sayHello());

        System.out.println("----------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("----------- Setter");
        SetterBasedController setterBasedController = (SetterBasedController) context.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());
        System.out.println("----------- COnstructor");
        ConstructorBasedController constructorBasedController = (ConstructorBasedController) context.getBean("constructorBasedController");
        System.out.println(constructorBasedController.getGreeting());

        System.out.println("bean scopes!!!!!!!!!!!!!!!!!!!!!");
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

    }

}
