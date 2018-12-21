package Editora;

public class Livros extends Publicacao {
	
	private String NomeAutor;
	private CategoriaEnum Categoria;
	private double Valor; 
	private double precoCompra; 

	
	

	public Livros(String titulo, int anoEdicao, int numEdicao, String nomeAutor, CategoriaEnum categoria, double precoCompra) {
		super(titulo, anoEdicao, numEdicao);
		NomeAutor = nomeAutor;
		Categoria = categoria;
		this.precoCompra = precoCompra; 
		setValor(calculaPrecoVenda()); 
	}
	public String getNomeAutor() {
		return NomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		NomeAutor = nomeAutor;
	}
	public CategoriaEnum getCategoria() {
		return Categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		Categoria = categoria;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}

	  

	
	@Override
	public String toString() {
		return "Livros [Nome do Autor = " + NomeAutor + ", Categoria =" + Categoria
				+ ", Preço =" + Valor + ", Preco de Compra=" + precoCompra + "]";
	}
	@Override 
	public double calculaPrecoVenda(){ 
	    double PrecoV = 0.0; 
	    PrecoV = precoCompra + (precoCompra * 0.10); 
       return PrecoV; 
	}

	
 
	
	
	
	

	
	

}
