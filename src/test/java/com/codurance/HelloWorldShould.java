package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldShould {
    @Test public void
    sayHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.sayHelloWorld(), is("<html><body><img src='https://jefferywilcox.files.wordpress.com/2010/02/spiff81.jpg'></body></html>"));
    }

}
