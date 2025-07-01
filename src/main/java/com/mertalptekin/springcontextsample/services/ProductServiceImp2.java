package com.mertalptekin.springcontextsample.services;

import com.mertalptekin.springcontextsample.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp2 implements IProductService {

    @Autowired
    @Qualifier("dbLogger")
    private ILogger logger;

    @Override
    public List<Product> getProducts() {
        logger.log("getProducts");
        System.out.println("getProducts-v2");
        return List.of();
    }
}
