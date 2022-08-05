package cn.happymaya.ddp.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * The application for the api gateway.
 * @author superhsc
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    /**
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}
