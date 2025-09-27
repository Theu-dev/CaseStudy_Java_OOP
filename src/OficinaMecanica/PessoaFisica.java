package OficinaMecanica;

import javax.swing.JOptionPane;

public class PessoaFisica extends Cliente
{
    private String cpf;
    private String dtNascimento;
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDtNascimento() { return dtNascimento; }
    public void setDtNascimento(String dtNascimento) { this.dtNascimento = dtNascimento; }

    public PessoaFisica()
    {super();
        
        cpf = JOptionPane.showInputDialog("Insira seu CPF: ");
        dtNascimento = JOptionPane.showInputDialog("Insira sua data de nascimento: ");
    }
}
