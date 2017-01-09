package org.hsk.repository.jpa;

import org.hsk.model.jpa.Product;
import org.hsk.model.jpa.Unit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by cartman on 22.12.16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(value = "MyApp")
public class ProductRepositoryTest {


  @Autowired
  ProductRepository productRepository;


  @Before
  public void before(){

  }

  @After
  public void after(){
    productRepository.deleteAll();
  }

  @Test
  public void testCreate() {
    Product p = new Product();
    p.setAmount(10.0);
    p.setCalories(100.0);
    p.setName("Test product");
    p.setUnit(Unit.G);
    p = productRepository.save(p);
    Product p1 = new Product();
    p1.setAmount(50.0);
    p1.setCalories(200.0);
    p1.setName("Test product 2");
    p1.setUnit(Unit.KG);
    p1 = productRepository.save(p1);
    Product product = productRepository.findOne(1);
    assertNotNull(product);
    assertEquals(p.getUnit(), product.getUnit());
    product = productRepository.findOne(2);
    assertEquals(p1.getUnit(), product.getUnit());
    assertNotNull(product);

  }
}
