package com.mertalptekin.springcontextsample.services;

import com.mertalptekin.springcontextsample.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
 // Bu sınıfı @Primary ile işaretlediğimizde, eğer birden fazla bean varsa ve bu bean'lerden biri @Primary ise, o bean kullanılır.
public class ProductServiceImp1 implements IProductService{

    // DI
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    @Qualifier("txtLogger") // bu sınıf üzerinden instance üret.
    private ILogger logger;



    @Override
    public List<Product> getProducts() {

       Product p = applicationContext.getBean("product1",Product.class);
       System.out.println(p.getName());
       logger.log("Product Get Log");

        System.out.println("getProducts-v1");
        return List.of(
                new Product("P-1",10.5,20),
                new Product("P-2",15.5,30));
    }
}
