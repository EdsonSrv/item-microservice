package com.microservice.item.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import com.microservice.item.service.ItemService
import com.microservice.item.model.Item

@RestController
class ItemController {

  @Autowired
  ItemService service

  @GetMapping("/list")
  List<Item> list(){
    service.findAll()
  }

}