package org.hsk.controller;

import org.hsk.model.jpa.Product;
import org.hsk.repository.jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cartman on 09.01.17.
 */


@RestController
@RequestMapping("/api/product")
public class ProductController {

  @Autowired
  ProductRepository productRepository;

  @GetMapping("/get/{id}")
  public Product get(@PathVariable Integer id) {
    return productRepository.findOne(id);
  }

  @GetMapping("/getAll")
  public List<Product> getAll(){
    return productRepository.findAll();
  }

}
