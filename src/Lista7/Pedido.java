package Lista7;

import java.util.Random;
import javax.swing.JOptionPane;

public class Pedido {
    private int numeroPedido;
    private float quantidade;
    private int data;

    private Produto produto;   // associação com Produto
    private Cliente cliente;   // associação com Cliente
    private Fatura fatura;     // cada pedido gera uma fatura

    // Getters e setters
    public int getNumeroPedido() { return numeroPedido; }
    public void setNumeroPedido(int numeroPedido) { this.numeroPedido = numeroPedido; }

    public float getQuantidade() { return quantidade; }
    public void setQuantidade(float quantidade) { this.quantidade = quantidade; }

    public int getData() { return data; }
    public void setData(int data) { this.data = data; }

    public Produto getProduto() { return produto; }
    public Cliente getCliente() { return cliente; }

    public Fatura getFatura() { return fatura; }

    // Construtor
    public Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;

        Random random = new Random();
        this.numeroPedido = random.nextInt(10000);
        quantidade = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de pedidos: "));
        data = Integer.parseInt(JOptionPane.showInputDialog("Data de digitação: "));

        // gera fatura automaticamente
        fatura = new Fatura(this);
    }
}
