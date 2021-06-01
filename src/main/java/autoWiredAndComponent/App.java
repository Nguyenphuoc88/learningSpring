package autoWiredAndComponent;

import dependencyInjection.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App{

    public static void main(String[] args){

        SpringApplication.run(App.class,args);
        //ApplicationContext contain all beans --> dependencies in project
        ApplicationContext context = SpringApplication.run(App.class,args);

        Outfit outfit = context.getBean(Outfit.class);
        System.out.println("Instance:" + outfit);
        outfit.wear();
    }

}
