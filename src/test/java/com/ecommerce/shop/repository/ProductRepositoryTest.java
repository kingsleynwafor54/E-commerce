package com.ecommerce.shop.repository;

import com.ecommerce.shop.data.model.Currency;
import com.ecommerce.shop.data.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
@Sql( {"/db/insert.sql"})
class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepositoryIml;
    @BeforeEach
    void setUp() {
    }
    @Test
    public void createProductTest(){
        Product product= new Product();
        product.setName("Luxury Sofa");
        product.setPrice(400D);
        product.setCurrency(Currency.NGN);
        product.setDetails("The man is going to,"+"market to,"+"come and see what the lord has done");

        assertThat(product).isNotNull();
        assertThat(product.getId()).isNull();
        log.info("Product before saving->{}",product);
        productRepositoryIml.save(product);
        assertThat(product.getId()).isNotNull();
        log.info("Product after saving->{}",product);

    }
    @Test
    @Transactional
    public void whenFindAllProductIsCalledThenProductListIsReturnedTest(){
        List<Product> products= productRepositoryIml.findAll();
        assertThat(products).hasSize(4);
        log.info("product from database->{}",products);
    }
}