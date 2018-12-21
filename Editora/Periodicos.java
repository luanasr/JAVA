package Editora;

public class Periodicos extends Publicacao {
	
	private int ISBN;
	private double Valor; 
	private int qtdFolha;
    private static final double VALOR_FOLHA = 0.50; 
	
	public Periodicos(String titulo, int anoEdicao, int numEdicao, int iSBN, int qtdFolha) {
		super(titulo, anoEdicao, numEdicao);
		ISBN = iSBN;
		this.qtdFolha = qtdFolha; 
        this.setValor(calculaPrecoVenda()); 

	}
	
	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public int getQtdFolha() {
		return qtdFolha;
	}

	public void setQtdFolha(int qtdFolha) {
		this.qtdFolha = qtdFolha;
	}

	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
    @Override 
    public double calculaPrecoVenda() { 
        return (VALOR_FOLHA * qtdFolha); 
    } 


}
