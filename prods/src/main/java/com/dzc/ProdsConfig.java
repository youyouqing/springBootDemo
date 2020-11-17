package com.dzc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProdsConfig {

    @Bean("v1")
    public Map<String, String> getVersionV1()
    {
        return new HashMap<String, String>() {
            {
                put("version", "1.0");
            }
        };
    }

    @Bean("v2")
    public Map<String, String> getVersionV2()
    {
        return new HashMap<String, String>() {
            {
                put("version", "2.0");
            }
        };
    }

    @Bean
    public Map<String, String> getVersion()
    {
        return new HashMap<String, String>() {
            {
                put("version", "0.0");
            }
        };
    }
}
