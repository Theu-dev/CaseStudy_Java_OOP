package Lista7;

import java.util.Random;
import javax.swing.JOptionPane;

public class Produto
{
	private int codigo;
	private String nome;
	private float quantidade;
	private float precoUnitario;
	
	public int getCodigo() { return codigo; }
	public void setCodigo(int codigo) { this.codigo = codigo; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public float getQuantidade() { return quantidade; }
	public void setQuantidade(float quantidade) { this.quantidade = quantidade; }
	
	public float getPrecoUnitario() { return precoUnitario; }
	public void setPrecoUnitario(float precoUnitario) { this.precoUnitario = precoUnitario; }
	
	public Produto()
	{
        Random random = new Random();
        this.codigo = random.nextInt(10000);
		nome = JOptionPane.showInputDialog("Nome do produto: ");
		quantidade = Float.parseFloat(JOptionPane.showInputDialog("Quantidade do produto: "));
		precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Preço do produto: "));
	}
	
}
