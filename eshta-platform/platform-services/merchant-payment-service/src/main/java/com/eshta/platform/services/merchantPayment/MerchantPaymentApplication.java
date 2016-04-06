package com.eshta.platform.services.merchantPayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Senussi at night :)
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MerchantPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantPaymentApplication.class, args);
    }

}
