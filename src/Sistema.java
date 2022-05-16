import java.util.List;

import example.Product;
import example.ProductService;

public class Sistema {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		
		Product produto1 = productService.create("Leite", "Parmalat");
		Product produto2 = productService.create("Manteiga", "Parmalat");
		Product produto3 = productService.create("Ovo", "Granja Galeto");

		Product testeGet1 = productService.getProductById(produto1.getId());

		System.out.println(testeGet1);

		List<Product> produtos = productService.listProductsByName("Manteiga");
		System.out.println(produtos.size());
		System.out.println(produtos.get(0));

	}
}
