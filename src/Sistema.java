import example.Product;
import example.ProductRepository;

public class Sistema {

	public static void main(String[] args) {
		ProductRepository productRepo = new ProductRepository();
		
		Product produto1 = new Product("Leite", "Parmalat");
		Product produto2 = new Product("Manteiga", "Parmalat");
		Product produto3 = new Product("Ovo", "Granja Galeto");

		productRepo.add(produto1);
		productRepo.add(produto2);
		productRepo.add(produto3);

		System.out.println(productRepo.list().length);

		productRepo.delete(produto1.getId());

		System.out.println(productRepo.list().length);

		Product p = productRepo.get(produto2.getId());

		System.out.println(productRepo.get(p.getId()).getName());;

		p.setName("Margarina");

		productRepo.update(p);

		System.out.println(productRepo.get(produto2.getId()).getName());;
	}
}
