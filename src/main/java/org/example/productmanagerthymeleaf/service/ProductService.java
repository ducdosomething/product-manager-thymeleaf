package org.example.productmanagerthymeleaf.service;

import org.example.productmanagerthymeleaf.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Lap", "1000$", "Notebook", "Asus"));
        products.put(2, new Product(2, "Iphone", "3000$", "15 pro max", "Apple"));
        products.put(3, new Product(3, "Samsung", "2000$", "S24 ultra", "Samsung"));
        products.put(4, new Product(4, "Shoe", "500$", "Running", "nike"));
        products.put(5, new Product(5, "Shirt", "100$", "Clothe", "Adidas"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
