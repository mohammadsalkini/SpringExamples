package at.refugeescode.amazingHelloWorld;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;
    @org.junit.jupiter.api.Test
    void sayHelloWorld() {
        String sayHelloWorld = helloWorld.sayHelloWorld();
        assertEquals("Hello World", sayHelloWorld);
    }
}