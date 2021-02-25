package com.jzjr.hellospringbootactuator.actuate;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class DemoHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        boolean result = checkSuccess();
        if(result){
            builder.up().build();
            return;
        }
        builder.down().withDetail("msg","我就是做个示例");
    }

    private boolean checkSuccess() {
        return true;
    }
}
