package ske.camel.springboot.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


/**
 * Created by m86922 on 20.11.15.
 */
@Component
public class MinEgenHelsesjekk implements HealthIndicator {

        private static final String WARN = "WARN";
        private static Logger LOGGER = LoggerFactory.getLogger(MinEgenHelsesjekk.class);


        @Value("${health}")
        private String health;

        @Override
        public Health health() {

            LOGGER.info("Helsen er: "+health);

            // perform some specific health check
            if (WARN.equals(health)) {
                return Health.outOfService().withDetail("Error code", WARN).build();
            }
            return Health.up().build();
        }

}



