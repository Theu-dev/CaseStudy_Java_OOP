package OficinaMecanica;

import javax.swing.JOptionPane;

public abstract class Cliente
{
    protected String nome;

    protected Endereco atRefEndereco;
    protected Telefone atRefTelefone;
    protected Veiculo atRefVeiculo;
    protected Servico atRefServico;
    protected OrdemServico atRefOrdemServico;


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Endereco getatRefEndereco() { return atRefEndereco; }
    public void setatRefEndereco(Endereco atRefEndereco) { this.atRefEndereco = atRefEndereco; }

    public Telefone getAtRTelefone() { return atRefTelefone; }
    public void setAtRTelefone(Telefone atRefTelefone) { this.atRefTelefone = atRefTelefone; }

    public Veiculo getAtRefVeiculo() { return atRefVeiculo; }
    public void setAtRefVeiculo(Veiculo atRefVeiculo) { this.atRefVeiculo = atRefVeiculo; }

    public Servico getAtRefServico() { return atRefServico; }
    public void setAtRefServico(Servico atRefServico) { this.atRefServico = atRefServico; }

    public OrdemServico getAtRefOrdemServico() { return atRefOrdemServico; }
    public void setAtRefOrdemServico(OrdemServico atRefOrdemServico) { this.atRefOrdemServico = atRefOrdemServico; }

    public Cliente()
    {
        this.nome = JOptionPane.showInputDialog("Digite seu nome: ");

        this.atRefEndereco = new Endereco();
        this.atRefTelefone = new Telefone();
        this.atRefVeiculo = new Veiculo();
        this.atRefOrdemServico = new OrdemServico();
    }

    protected void solicitarServico()
    {
        this.atRefServico = new Servico();
    }
    protected void imprimirNota()
    {
        
    }

}
