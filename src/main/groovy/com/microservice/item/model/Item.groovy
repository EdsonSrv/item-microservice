package com.microservice.item.model

class Item {
  Product product
  Integer amount

  Double getTotal(){
    product.price * amount
  }
}