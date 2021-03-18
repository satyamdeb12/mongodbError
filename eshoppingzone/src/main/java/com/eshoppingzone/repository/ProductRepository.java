package com.eshoppingzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
