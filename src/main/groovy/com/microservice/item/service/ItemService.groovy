package com.microservice.item.service

import com.microservice.item.model.Item
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.client.RestTemplate
import com.microservice.item.model.Product
import java.util.Arrays

@Service
class ItemService {

  @Autowired
  RestTemplate clientRest

  List<Item> findAll(){
    List<Product> products = Arrays.asList(clientRest.getForObject("http://localhost:8001/list", Product[].class))
    products.collect{ p -> new Item(product: p, amount: 1) }
  }

  Item findById(Long id, Integer amount){
    def pathVariables = [:]
    pathVariables.put("id", id.toString())
    Product product = clientRest.getForObject("http://localhost:8001/detail/{id}", Product.class, pathVariables)
    null
  }

}