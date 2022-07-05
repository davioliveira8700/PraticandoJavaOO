import java.math.BigDecimal;

public class ExecutarTest {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1l);
		produto1.setNome("Orientação a objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setNome("Modulo de Spring Boot API REST");
		produto2.setId(2l);
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setNome("Modulo de Angular");
		produto3.setId(3l);
		produto3.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda curso de formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Davi de Oliveira");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		
	  System.out.println("Valor total= " + venda.getValorTotal());
	
	}

}
