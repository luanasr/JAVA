package Editora;



public abstract class Publicacao {
	private String titulo;
	private int anoEdicao;
	private int numEdicao;


	
	
	

	public Publicacao(String titulo, int anoEdicao, int numEdicao) {
		super();
		this.titulo = titulo;
		this.anoEdicao = anoEdicao;
		this.numEdicao = numEdicao;
	
		
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	public int getNumEdicao() {
		return numEdicao;
	}
	public void setNumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}
	public double calculaPrecoVenda() {

		return 0;
	}

	

	
	
	
	
	

}
