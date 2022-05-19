import facades.Facade;

public class Sistema {
	
	public static void main(String[] args) {
		
		String jsonP1 = "{\"nome\":\"Leite integral\", \"fabricante\":\"Parmalat\", \"preco\":10.5}";
		String jsonP2 = "{\"nome\":\"Leite\", \"fabricante\":\"Vale\", \"preco\":6.5}";;
		String jsonP3 = "{\"nome\":\"Açúcar\", \"fabricante\":\"Alegre\", \"preco\":3.5}";;
		
		Facade mercadoFacade = new Facade();
		
		// Adicionando produtos no catálogo		
		String idP1 = mercadoFacade.criarProduto(jsonP1);
		mercadoFacade.criarProduto(jsonP2);
		mercadoFacade.criarProduto(jsonP3);
				
		String jsonL1 = "{\"idProduto\":\"" + idP1 + "\", \"quantidade\":10}";;
		
		// Adicionando lotes no catálogo
		mercadoFacade.criarLote(jsonL1);
		
		// Lista produtos produto "leite" no catálogo de produto
		System.out.println(mercadoFacade.listarProdutos());
				
		// Consulta de produto "leite" no catálogo de produto
		System.out.println(mercadoFacade.findProdutosByName("leite"));
		
		// Consulta de produto "leite" no catálogo de produto com lotes no sistema
		System.out.println(mercadoFacade.findProdutosByName("leite", true));
	}
}
