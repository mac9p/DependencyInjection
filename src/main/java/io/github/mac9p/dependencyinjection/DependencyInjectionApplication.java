package io.github.mac9p.dependencyinjection;

import io.github.mac9p.dependencyinjection.controllers.ConstructorBasedController;
import io.github.mac9p.dependencyinjection.controllers.MyController;
import io.github.mac9p.dependencyinjection.controllers.PropertyInjectedController;
import io.github.mac9p.dependencyinjection.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("----------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println("----------- Setter");
        SetterBasedController setterBasedController = (SetterBasedController) context.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());
        System.out.println("----------- COnstructor");
        ConstructorBasedController constructorBasedController = (ConstructorBasedController) context.getBean("constructorBasedController");
        System.out.println(constructorBasedController.getGreeting());
    }

}
