package com.microservice.item

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@Configuration
class AppConfig {

  //Client that works with api rest
  @Bean("clientRest")
  RestTemplate registerRestTemplate(){
    new RestTemplate()
  }

}