package com.mertalptekin.springcontextsample;

import com.mertalptekin.springcontextsample.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringContextSampleApplication {


    public static void main(String[] args) {
        // Uygulamanın Spring Context'i ApplicationContext

      var context= SpringApplication.run(SpringContextSampleApplication.class, args);


//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextSampleApplication.class);
        String s1 = context.getBean("getString", String.class);
        Product p3 = context.getBean("product1", Product.class);
        Product p2 = context.getBean("product2", Product.class);

        System.out.println(s1);
        System.out.println(p2.getName());
        System.out.println(p3.getName());

       IProductService service =  context.getBean(IProductService.class);
       service.getProducts();

        // Beanlerimize burada erişelim.
    }

}
