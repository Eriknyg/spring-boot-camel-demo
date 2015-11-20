package ske.camel.springboot;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by m86922 on 30.09.15.
 */
@Component
public class SimpleCamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://trigger2").
                log(LoggingLevel.INFO, "Hello world!");
    }
}


