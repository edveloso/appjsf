package web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ProdutoBean {

	private Produto produto;

	public String adicionaForm() {
		produto = new Produto();		
		return "produto_form";
	}
	
}
