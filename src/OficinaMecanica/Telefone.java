package OficinaMecanica;

import javax.swing.JOptionPane;

public class Telefone 
{
    private String ddi;
    private String ddd;
    private String numero;
    private String tipo;
    private String operadora;

    public String getDdi() { return ddi; }
    public void setDdi(String ddi) { this.ddi = ddi; }

    public String getDdd() { return ddd; }
    public void setDdd(String ddd) { this.ddd = ddd; }

    public String getNumrero() { return numero; }
    public void setNumrero(String numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getOperadora() { return operadora; }
    public void setOperadora(String operadora) { this.operadora = operadora; }

    public Telefone()
    {
        ddi = JOptionPane.showInputDialog("Insira seu DDI: ");
        ddd = JOptionPane.showInputDialog("Insira seu DDD: ");
        numero = JOptionPane.showInputDialog("Insira seu numero: ");
        tipo = JOptionPane.showInputDialog("Insira o tipo de aparelho(Telef. ou Celular): ");
        operadora = JOptionPane.showInputDialog("Insira sua Operadora: ");
    }
}
