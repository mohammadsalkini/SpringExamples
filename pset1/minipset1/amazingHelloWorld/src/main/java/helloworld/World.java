package helloworld;

import org.springframework.stereotype.Component;

@Component
public class World {
    public String sayWorld(){
        return "World";
    }
}
