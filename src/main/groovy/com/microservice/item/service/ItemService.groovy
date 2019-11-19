package com.microservice.item.service

import com.microservice.item.model.Item
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.client.RestTemplate

@Service
class ItemService {

  @Autowired
  RestTemplate clientRest

  List<Item> findAll(){
    null
  }

  Item findById(Long id, Integer amount){
    null
  }

}