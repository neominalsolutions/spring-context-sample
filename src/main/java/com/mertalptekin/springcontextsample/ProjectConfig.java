package com.mertalptekin.springcontextsample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Uygulama içerisinde kullanılacak konfigürasyon sınıfı
// Bean tanımlarını buraya yapıyoruz

@Configuration
public class ProjectConfig {

    @Bean
    public String getString() { // getString Bean ismi, method ismi bean ismi ile aynı
        return "Merhaba Spring Context!";
    }

    @Bean
    public Product product1() {
        return new Product("Kalem", 10.0, 100);
    }

    @Bean(name = "product2")
    public Product productInstance() {
        return new Product("Silgi", 10.0, 100);
    }




}
