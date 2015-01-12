package ps.lpweb.altavista.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ps.lpweb.altavista.model.Unidade;
import ps.lpweb.altavista.service.UnidadeService;

@Named
@RequestScoped
public class UnidadeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private UnidadeService service;
	
	private Unidade unidade;
	
	@PostConstruct
	private void init() {
		
		this.unidade = new Unidade();
		System.out.println("Hurry! It Works!");
	}
	
	public void salvar() {
		
		service.salvar(this.unidade);
		init();
	}
	
	public List<Unidade> listar() {
		
		return service.listar();
	}
	
	public Unidade getUnidade() {	
		return this.unidade;
	}
}