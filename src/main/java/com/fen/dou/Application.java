package com.fen.dou;


import com.fen.dou.mapper.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application  {
    public static void main(String[] args) {
       ApplicationContext ac =  SpringApplication.run(Application.class, args);
       AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
       annotationConfigApplicationContext.register(TestAutoConfig.class);
       annotationConfigApplicationContext.setParent(ac);
       annotationConfigApplicationContext.setClassLoader(ac.getClassLoader());
       annotationConfigApplicationContext.refresh();
       SayHello sayHello = annotationConfigApplicationContext.getBean(SayHello.class);
       SayHello sayHello1 = ac.getBean(SayHello.class);
       sayHello.say();
       sayHello1.say();
       UserMapper userMapper = annotationConfigApplicationContext.getBean(UserMapper.class);
       System.out.println(userMapper);

       AnnotationConfigApplicationContext annotationConfigApplicationContext1 = new AnnotationConfigApplicationContext();
       annotationConfigApplicationContext1.register(TestAutoConfig2.class);
       annotationConfigApplicationContext1.setParent(ac);
       annotationConfigApplicationContext1.setClassLoader(ac.getClassLoader());
       annotationConfigApplicationContext1.refresh();
       SayHello2 sayHello2 = annotationConfigApplicationContext1.getBean(SayHello2.class);
       sayHello2.say();

       SayHello sayHello3 = annotationConfigApplicationContext1.getBean(SayHello.class);
       sayHello3.say();
    }
}
