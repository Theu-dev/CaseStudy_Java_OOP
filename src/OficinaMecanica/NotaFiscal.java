package OficinaMecanica;

import javax.swing.JOptionPane;

public class NotaFiscal
{
    private String numeroNF;
    private String dataEmissao;
    private float valorTotal;

    public String getNumeroNF() { return numeroNF; }
    public void setNumeroNF(String numeroNF) { this.numeroNF = numeroNF; }

    public String getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(String dataEmissao) { this.dataEmissao = dataEmissao; }

    public float getValorTotal() { return valorTotal; }
    public void setValorTotal(float valorTotal) { this.valorTotal = valorTotal; }

    public NotaFiscal()
    {
        this.numeroNF = JOptionPane.showInputDialog("Numero da NF: ");
        this.dataEmissao = JOptionPane.showInputDialog("Data de emissão da NF: ");
    }
}
