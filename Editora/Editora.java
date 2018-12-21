
package Editora;

import java.util.HashMap;
import java.util.Map;

public class Editora {
	private String nome;
	private String cnpj;
	private Livros livro;
	
	private Map<String, Publicacao> publicacoes;
	

	// CONTRUTOR E GETTER-SETTERS
	
	public Editora(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.publicacoes = new HashMap<>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Livros getLivro() {
		return livro;
	}
	public void setLivro(Livros livro) {
		this.livro = livro;
	}
	
	// METODOS
	
	public Publicacao verificarTitulo (Publicacao publicacaoBusca){
		
		for(Publicacao publicacaoLista: publicacoes.values()){
			if(publicacaoLista.getTitulo().equals(publicacaoBusca.getTitulo())){
				return publicacaoLista;
			}
		}
		throw new PublicacaoException("Titulo existente");
	}
	
	
	
	

}
