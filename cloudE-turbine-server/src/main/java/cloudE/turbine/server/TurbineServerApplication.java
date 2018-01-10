package cloudE.turbine.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * @author xionglihdfs
 * @Description: hystrix dashboard 聚合
 * @date 2017年12月26日
 */
@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class TurbineServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(TurbineServerApplication.class, args);
    }
}
