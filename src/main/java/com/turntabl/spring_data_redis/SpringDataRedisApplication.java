package com.turntabl.spring_data_redis;

import com.turntabl.spring_data_redis.Producer.CustomerInfoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRedisApplication implements CommandLineRunner {
	@Autowired
	private CustomerInfoPublisher redisPublisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		redisPublisher.publish();
		redisPublisher.publish();
		redisPublisher.publish();
		Thread.sleep(50);
		redisPublisher.publish();
		redisPublisher.publish();
	}
}
