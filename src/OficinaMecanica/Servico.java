package OficinaMecanica;

import javax.swing.JOptionPane;

public class Servico
{
    private String codigo;
    private String descricao;
    private Float precoUnitario;

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Float getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(Float precoUnitario) { this.precoUnitario = precoUnitario; }
    
    public Servico()
    {
        this.codigo = JOptionPane.showInputDialog("Cod. do Produto: ");
        this.descricao = JOptionPane.showInputDialog("Descrição do produto: ");
        this.precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Preço por unidade: "));
    }
}
