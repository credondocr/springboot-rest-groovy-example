package com.mycompany.example

import com.mycompany.example.controllers.CityController
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.BlockJUnit4ClassRunner

@RunWith(BlockJUnit4ClassRunner.class)
public class HelloWorldControllerUnitTests {

    def controller

    @Before
    public void setup() {
        controller = new CityController()
    }

    @Test
    public void sayHelloToKirk() throws Exception {

        def result = controller.greeting('Kirk')

        assert result instanceof Hello
        assert result.content == 'Hello, Kirk!'
    }

}