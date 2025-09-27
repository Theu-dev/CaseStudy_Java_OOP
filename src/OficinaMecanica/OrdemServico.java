package OficinaMecanica;

import javax.swing.JOptionPane;

public class OrdemServico 
{
    private String numeroOS;
    private String data;
    private int quantidade;

    public String getNumeroOS() { return numeroOS; }
    public void setNumeroOS(String numeroOS) { this.numeroOS = numeroOS; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public OrdemServico()
    {
        this.numeroOS = JOptionPane.showInputDialog("Numero da ordem de serviço: ");
        this.data = JOptionPane.showInputDialog("Data da ordem de serviço: ");
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira seu CPF: "));
    }

    protected void gerarNotaFiscal()
    {

    }
    }
