package example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private BatchRepository batchRepository;
    private ProductRepository productRepository;

    public ProductService() {
        this.batchRepository = new BatchRepository();
        this.productRepository = new ProductRepository();
    }

    public Product create(String name, String manufacturer) {
        Product product = new Product(name, manufacturer);

        this.productRepository.add(product);

        return product;
    }

    public Product getProductById(String id) {
        return this.productRepository.get(id);
    }

    public void deleteProduct(String id) {
        this.productRepository.delete(id);
    }

    public List<Product> listProductsByName(String name) {
        List<Product> products = this.productRepository.list();
        return filterProductsByName(name, products);
    }

    public List<Product> listProductsWithBatchByName(String name) {
        List<Batch> batches = this.batchRepository.list();

        List<Product> products = getProductsByBatches(batches);

        return filterProductsByName(name, products);
    }

    private List<Product> getProductsByBatches(List<Batch> batches) {
        List<Product> products = new ArrayList<Product>();

        batches.forEach(batch -> {
            Product product = this.productRepository.get(batch.getProduct().getId());
            products.add(product);
        });

        return products;
    }

    private List<Product> filterProductsByName(String name, List<Product> products) {
        List<Product> filteredProducts = new ArrayList<Product>();

        products.forEach(product -> {
            if (product.getName().contains(name)) {
                filteredProducts.add(product);
            }
        });

        return filteredProducts;
    }
}
