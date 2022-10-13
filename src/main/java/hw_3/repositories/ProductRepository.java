package hw_3.repositories;

import hw_3.data.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productsList;

    @PostConstruct
    public void init() {
        productsList = new ArrayList<>(List.of(
                new Product(1, "brick", 10),
                new Product(2, "stick", 20),
                new Product(3, "stone", 50),
                new Product(4, "steel", 40),
                new Product(5, "resin", 50),
                new Product(6, "cement", 75),
                new Product(7, "water", 25),
                new Product(8, "plaster", 32),
                new Product(9, "glass", 40),
                new Product(10, "wood", 70)
        ));
    }

    public List<Product> getAllProduct() {
        return Collections.unmodifiableList(productsList);
    }

    public Product findIdProduct(Long id) {
        return productsList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}