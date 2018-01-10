package cloudE.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author xionglihdfs
 * @Description: 链路监控
 * @date 2017年12月24日
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinServerApplication {
	public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
