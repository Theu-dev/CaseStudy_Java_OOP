  package Lista7;

import javax.swing.JOptionPane;

public abstract class Cliente 
{	
	//Atributo comum
	protected String nome;
	
	//Atributo de referencia
	 protected Endereco atRefEndereco;
	 protected Telefone atRefTelefone;
	
	//Metodo de acesso protegido
	protected String getNome() { return nome; }
	protected void setNome(String nome) { this.nome = nome; }
	
	//Construtor simples
	public Cliente()
	{
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		this.atRefEndereco = new Endereco();
		this.atRefTelefone = new Telefone();
	}
	
	//Operações abstratas
	public abstract void fazerPedido();
	public abstract void imprimirFatura(Fatura fatura, Pedido pedido);
}
