package Lista7;

import java.util.Random;

import javax.swing.JOptionPane;

public class Fatura {
    private int numeroFatura;
    private String dataVencimento;
    private float valorTotal;

    // Construtor padrão (se precisar)
    public Fatura() {}

    // Construtor que gera a fatura a partir do pedido
    public Fatura(Pedido pedido) {
        Random random = new Random();
        this.numeroFatura = random.nextInt(10000); // número aleatório de fatura
        this.dataVencimento = JOptionPane.showInputDialog("Data de vencimento");
        this.valorTotal = pedido.getQuantidade() * pedido.getProduto().getPrecoUnitario();
    }

    // Getters e setters
    public int getNumeroFatura() { return numeroFatura; }
    public void setNumeroFatura(int numeroFatura) { this.numeroFatura = numeroFatura; }

    public String getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }

    public float getValorTotal() { return valorTotal; }
    public void setValorTotal(float valorTotal) { this.valorTotal = valorTotal; }
}
