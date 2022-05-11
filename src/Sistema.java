import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Produto biscoito = new Produto("Biscoito", "Trakinas");
		Produto pao = new Produto("Pao", "Frances");
		
		Lote lote = new Lote(leite, 10L);
		
		ProdutoRepository produtoRepository = new ProdutoRepository();
		
		
		produtoRepository.addProduto(leite);
		produtoRepository.addProduto(biscoito);
		produtoRepository.addProduto(pao);

		produtoRepository.removeProduto("Leite");
		
		produtoRepository.updateProduto("Biscoito", "Sorvete", "Morango");
		
		produtoRepository.listarCatalogo();
		
		//System.out.println(produtoRepository.getProduto("Leite"));
		
		
	}
}
