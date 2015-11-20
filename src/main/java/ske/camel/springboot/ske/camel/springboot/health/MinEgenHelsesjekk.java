package ske.camel.springboot.ske.camel.springboot.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
/**
 * Created by m86922 on 20.11.15.
 */
@Component
public class MinEgenHelsesjekk implements HealthIndicator {

        private static final String WARN = "WARN";
        @Override
        public Health health() {
            String errorCode = "{{health}}";
            // perform some specific health check
            if (WARN.equals(errorCode)) {
                return Health.unknown().withDetail("Error code", errorCode).build();
            }
            return Health.up().build();
        }

}



