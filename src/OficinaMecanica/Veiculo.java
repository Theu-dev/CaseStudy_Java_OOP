package OficinaMecanica;

import javax.swing.JOptionPane;

public class Veiculo
{
    private String placa;
    private String modelo;
    private String ano;

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }

    public Veiculo()
    {
        this.placa = JOptionPane.showInputDialog("Placa do carro: ");
        this.modelo = JOptionPane.showInputDialog("Modelo do carro: ");
        this.ano = JOptionPane.showInputDialog("Ano de fabricação: ");
    }   
}
