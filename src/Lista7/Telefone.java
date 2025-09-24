package Lista7;

import javax.swing.JOptionPane;

public class Telefone 
{	
	//atributos comus
	private int ddi;
	private int ddd;
	private int numero;
	private String tipo;
	private String operadora;
	
	//Metodos de acesso
	public int getDdi() { return ddi; }
	public void setDdi(int ddi) { this.ddi = ddi; }
	
	public int getDdd() { return ddd; }
	public void setDdd(int ddd) { this.ddd = ddd; }
	
	public int getNumero() { return numero; }
	public void setNumero(int numero) {	this.numero = numero; }
	
	public String getTipo() { return tipo; }
	public void setTipo(String tipo) { this.tipo = tipo; }
	
	public String getOperadora() { return operadora; }
	public void setOperadora(String operadora) { this.operadora = operadora; }
	
	//Metodo construtor
	public Telefone()
	{
		ddi = Integer.parseInt(JOptionPane.showInputDialog("Digite seu DDI: "));
		ddd = Integer.parseInt(JOptionPane.showInputDialog("Digite seu DDD: "));
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
		tipo = JOptionPane.showInputDialog("Digite o tipo de telefone(Celular/Fixo): ");
		operadora = JOptionPane.showInputDialog("Digite sua operadora: ");
	}
}
