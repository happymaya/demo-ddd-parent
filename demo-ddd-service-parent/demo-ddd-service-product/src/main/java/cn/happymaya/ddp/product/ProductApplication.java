package cn.happymaya.ddp.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

/**
 * @author superhsc
 */
@SpringBootApplication
@ImportResource(locations={"classpath*:applicationContext-*.xml"})
@MapperScan("com.demo2.support.dao")
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class ProductApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
		System.out.println(".....................................");
		System.out.println("....The Product Application started..");
		System.out.println(".....................................");
	}

}
