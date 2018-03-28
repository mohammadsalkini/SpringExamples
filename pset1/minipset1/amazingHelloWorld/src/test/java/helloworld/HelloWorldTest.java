package at.refuggescod.amazinghelloworld.helloworld;

import helloworld.HelloWorld;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {
    @Autowired
    HelloWorld helloWorld;
    @Test
    void sayhelloworld() {

        String sayhelloworld = helloWorld.sayHelloWorld();
        assertThat(sayhelloworld,is("Hello World"));

    }

}