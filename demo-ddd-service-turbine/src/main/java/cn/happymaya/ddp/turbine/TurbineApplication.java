package cn.happymaya.ddp.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * The application for the hystrix turbine server.
 * @author superhsc
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
@EnableHystrixDashboard
public class TurbineApplication {

    /**
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }

}
