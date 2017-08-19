package com.abdul.epl.config;

import com.abdul.epl.api.PlayerApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        this.register(HelloResource.class);
        this.register(PlayerApi.class);
    }
}
