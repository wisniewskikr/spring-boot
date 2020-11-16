package com.example.configs;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MappingConfig {

    @Bean
    DozerBeanMapper mapper() {
        List<String> mappings = Arrays.asList("mappings/dozer-mapping.xml");
        return new DozerBeanMapper(mappings);
    }

}
