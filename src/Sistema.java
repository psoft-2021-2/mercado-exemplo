import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Produto produto1 = new Produto("pao", "visconti");
		Produto produto2 = new Produto("ovo", "cascavel");
		
		Lote lote = new Lote(produto, 10L);
		
		ProdutoRepository produtoRepositorio = new ProdutoRepository();
		produtoRepositorio.addProduto(produto1);
		
		//System.out.println(produto);
		System.out.println(produtoRepositorio);
		//System.out.println(lote);
	}
}
