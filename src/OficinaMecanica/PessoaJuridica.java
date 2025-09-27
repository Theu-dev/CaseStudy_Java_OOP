package OficinaMecanica;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Cliente
{
    private String cnpj;
    private String razaoSocial;

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public PessoaJuridica()
    {
        super();
        cnpj = JOptionPane.showInputDialog("Insira seu CNPJ: ");
        razaoSocial = JOptionPane.showInputDialog("Insira sua razão social: ");
    }
}
