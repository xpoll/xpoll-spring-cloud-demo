package cn.blmdz.cloud.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfiguration {

	@Bean
	public RestTemplate restTemplate () {
		
		return new RestTemplate();
	}
}
