package Lista7;

import javax.swing.JOptionPane;

public class Endereco
{
	//Metodos de acesso comuns
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private int cep;
	private String estado;
	
	//Metodos de acesso
	public String getRua() { return rua; }
	public void setRua(String rua) { this.rua = rua; }
	
	public int getNumero() { return numero; }
	public void setNumero(int numero) { this.numero = numero; }
	
	public String getComplemento() { return complemento;	}
	public void setComplemento(String complemento) { this.complemento = complemento; }
	
	public String getBairro() { return bairro; }
	public void setBairro(String bairro) { this.bairro = bairro; }
	
	public String getCidade() { return cidade; }
	public void setCidade(String cidade) { this.cidade = cidade; }
	
	public int getCep() { return cep;	}
	public void setCep(int cep) { this.cep = cep; }
	
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
	
	//metodo construtor
	public Endereco()
	{
		rua = JOptionPane.showInputDialog("Nome da rua: ");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Numero do local(Apenas numeros): "));
		complemento = JOptionPane.showInputDialog("Complemento: ");
		bairro = JOptionPane.showInputDialog("Nome do bairro: ");
	    cidade = JOptionPane.showInputDialog("Cidade: ");
		cep = Integer.parseInt(JOptionPane.showInputDialog("Cep(Apenas numeros): "));
		estado = JOptionPane.showInputDialog("Estado: ");
	}
}
