import models.Lote;
import models.Produto;

import facades.Facade;

public class Sistema {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Leite", "Parmalat", 10.5);
		Produto p2 = new Produto("Leite integral", "Vale", 6.5);
		Produto p3 = new Produto("Açúcar", "Alegre", 3.5);

		Lote l1 = new Lote(p1, 10L);
		
		Facade mercadoFacade = new Facade();
		
		// Adicionando produtos no catálogo		
		mercadoFacade.criarProduto(p1);
		mercadoFacade.criarProduto(p2);
		mercadoFacade.criarProduto(p3);
				
		// Adicionando lotes no catálogo
		mercadoFacade.criarLote(l1);
		
		// Lista produtos produto "leite" no catálogo de produto
		System.out.println(mercadoFacade.listarProdutos());
				
		// Consulta de produto "leite" no catálogo de produto
		System.out.println(mercadoFacade.findProdutosByName("leite"));
		
		// Consulta de produto "leite" no catálogo de produto com lotes no sistema
		System.out.println(mercadoFacade.findProdutosByName("leite", true));
	}
}
