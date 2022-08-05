package cn.happymaya.ddp.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * The application for the supplier service.
 * @author superhsc
 */
@SpringBootApplication
@EnableEurekaClient
@Configuration
@ImportResource(locations={"classpath:applicationContext.xml"})
public class SupplierApplication {

	/**
	 * @param args the argument
	 */
	public static void main(String[] args) {
		SpringApplication.run(SupplierApplication.class, args);
	}

}
