package com.mqz.mini.cloud.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author mqz
 * @since 2020年12月23日
 * @description mini-cloud a 注册中心微服务a
 * @abount https://github.com/DemoMeng
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MiniCloudAApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniCloudAApplication.class, args);
    }

}
