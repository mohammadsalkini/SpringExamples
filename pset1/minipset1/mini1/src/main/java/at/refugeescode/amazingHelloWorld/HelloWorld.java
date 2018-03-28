package at.refugeescode.amazingHelloWorld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    hello hello;
    world world;

    public HelloWorld(hello hello, world world){
        this.hello = hello;
        this.world = world;

    }
    public String sayHelloWorld(){
        return hello.sayHello() + " " + world.sayWorld();
    }

}