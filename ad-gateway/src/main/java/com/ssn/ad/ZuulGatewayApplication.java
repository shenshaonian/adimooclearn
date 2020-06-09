package com.ssn.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: 范子祺
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
