package com.mertalptekin.springcontextsample.starter;

import com.mertalptekin.springcontextsample.Product;
import com.mertalptekin.springcontextsample.services.IProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mertalptekin.springcontextsample"})
// uygulmayı ayrı bir oaket yaptığımızda component taramasını nerede yapacağına dair bir fikri yok. bu sebeple bu işlemi yaptık streotype tüm bean yapılarını ana paket üzerinden register ettik.
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
