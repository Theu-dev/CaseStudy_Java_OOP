package Lista7;

import javax.swing.JOptionPane;

public class Compra {
    public static void main(String[] args) {
        String resposta;
        boolean categoriaValida = false;
        Cliente cliente = null;

        while (!categoriaValida) {
            resposta = JOptionPane.showInputDialog("Pessoa: Fisica ou Juridica?");

            if (resposta.equalsIgnoreCase("Fisica")) {
                cliente = new PessoaFisica();
                cliente.fazerPedido(); // já imprime dentro
                categoriaValida = true;

            } else if (resposta.equalsIgnoreCase("Juridica")) {
                cliente = new PessoaJuridica();
                cliente.fazerPedido(); // já imprime dentro
                categoriaValida = true;

            } else {
                JOptionPane.showMessageDialog(null, "Digite uma categoria valida (Fisica ou Juridica)");
            }
        }
    }
}
