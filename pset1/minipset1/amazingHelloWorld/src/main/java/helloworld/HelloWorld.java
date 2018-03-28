package helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    Hello hello;
    World world;

    public HelloWorld(Hello hello, World world){
        this.hello = hello;
        this.world = world;

    }
    public String sayHelloWorld(){
        return hello.sayHello() + " " + world.sayWorld();
    }

}
