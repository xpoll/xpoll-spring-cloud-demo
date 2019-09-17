package cn.blmdz.cloud.provide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.blmdz.cloud.provide.dao")
public class ServiceProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProvideApplication.class, args);
	}
}
