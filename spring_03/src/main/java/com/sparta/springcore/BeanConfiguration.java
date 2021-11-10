package com.sparta.springcore;

import com.sparta.springcore.repository.ProductRepository;
import com.sparta.springcore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    @Autowired
    public ProductService productService(ProductRepository productRepository) {
        return new ProductService(productRepository);
    }
}

