package org.example.service;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        logger.info("Adding product: {}", product.getName());
        return productRepository.save(product);
    }

    public Product findProduct(Long id) throws Exception {
        return productRepository.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product changePrice(Long id, double price) throws Exception {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
        logger.info("Changing product {} price from {} to {} ", product.getName(), product.getPrice(), price);
        product.setPrice(price);
        return productRepository.save(product);
    }
}