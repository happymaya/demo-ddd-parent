package cn.happymaya.ddp.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @author superhsc
 */
@SpringBootApplication
@ImportResource(locations={"classpath*:applicationContext-*.xml"})
@MapperScan("com.demo2.support.dao")
@EnableEurekaClient
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		System.out.println(".....................................");
		System.out.println("...The Customer Application started..");
		System.out.println(".....................................");
	}

}
