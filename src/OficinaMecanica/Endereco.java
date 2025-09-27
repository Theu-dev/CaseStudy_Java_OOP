package OficinaMecanica;

import javax.swing.JOptionPane;

public class Endereco 
{
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Endereco()
    {
        this.rua = JOptionPane.showInputDialog("Nome da rua: ");
        this.numero = JOptionPane.showInputDialog("Número da sua casa: ");
        this.complemento = JOptionPane.showInputDialog("Complemento do endereço: ");
        this.bairro = JOptionPane.showInputDialog("Bairro: ");
        this.cidade = JOptionPane.showInputDialog("Cidade: ");
        this.cep = JOptionPane.showInputDialog("CEP: ");
        this.estado = JOptionPane.showInputDialog("Estado: ");
    }
    }
