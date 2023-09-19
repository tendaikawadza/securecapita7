package io.getarrays.securecapita.configuration;

import io.getarrays.securecapita.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {



    @Bean
    public ProductService productService() {
        return new ProductService();
    }



}
