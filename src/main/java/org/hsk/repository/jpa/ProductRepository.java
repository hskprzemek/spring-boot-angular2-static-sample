package org.hsk.repository.jpa;

import org.hsk.model.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cartman on 22.12.16.
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
