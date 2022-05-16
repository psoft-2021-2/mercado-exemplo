package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private Map<String, Product> productsCollection;

    public ProductRepository() {
        this.productsCollection = new HashMap<String, Product>();
    }

    public String add(Product product) {
        this.productsCollection.put(product.getId(), product);
        return product.getId();
    }

    public Product update(Product product) {
        Boolean hasProduct = this.productsCollection.containsKey(product.getId());

        if (hasProduct) {
            this.productsCollection.put(product.getId(), product);
        }

        return product;
    }

    public Product get(String productId) {
        return productsCollection.get(productId);
    }

    public List<Product> list() {
        List<Product> result = new ArrayList<Product>();

        this.productsCollection.forEach((id, product) -> {
            result.add(product);
        });

        return result;
    }

    public void delete(String productId) {
        this.productsCollection.remove(productId);
    }
}
