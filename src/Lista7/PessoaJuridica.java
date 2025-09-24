package Lista7;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Cliente {
    // Atributo comum
    private String cnpj;

    // Métodos de acesso
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    // Construtor
    public PessoaJuridica() {
        super();
        this.cnpj = JOptionPane.showInputDialog("Digite seu CNPJ: ");
    }

    // Cria pedido e chama a impressão
    public void fazerPedido() {
        Produto produto = new Produto();
        Pedido pedido = new Pedido(this, produto);

        imprimirFatura(pedido.getFatura(), pedido); // passa fatura e pedido já existentes
    }

    // Imprime usando o pedido e a fatura criados
    public void imprimirFatura(Fatura fatura, Pedido pedido) {
        JOptionPane.showMessageDialog(
            null,
            "===== FATURA =====\n\n" +
            "Cliente: " + this.getNome() + "\n" +
            "CNPJ: " + this.getCnpj() + "\n\n" +

            "Endereço:\n" +
            "Rua: " + atRefEndereco.getRua() + ", " + atRefEndereco.getNumero() +
            " - " + atRefEndereco.getBairro() + "\n" +
            "Cidade: " + atRefEndereco.getCidade() +
            " - Estado: " + atRefEndereco.getEstado() + "\n" +
            "CEP: " + atRefEndereco.getCep() + "\n\n" +

            "Telefone:\n" +
            "(" + atRefTelefone.getDdd() + ") " + atRefTelefone.getNumero() +
            " - " + atRefTelefone.getOperadora() + "\n\n" +

            "Pedido Nº: " + pedido.getNumeroPedido() + "\n" +
            "Data: " + pedido.getData() + "\n" +
            "Quantidade: " + pedido.getQuantidade() + "\n\n" +

            "Produto:\n" +
            "Código: " + pedido.getProduto().getCodigo() + "\n" +
            "Nome: " + pedido.getProduto().getNome() + "\n" +
            "Preço Unitário: R$ " + pedido.getProduto().getPrecoUnitario() + "\n\n" +

            "Número da Fatura: " + fatura.getNumeroFatura() + "\n" +
            "Data de Vencimento: " + fatura.getDataVencimento() + "\n" +
            "Valor Total: R$ " + fatura.getValorTotal(),
            "Fatura",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
