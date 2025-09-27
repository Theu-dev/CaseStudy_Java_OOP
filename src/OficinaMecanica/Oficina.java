package OficinaMecanica;

import javax.swing.JOptionPane;

public class Oficina
{
    public static void main(String[] args)
    {
        String resposta = "";
        boolean perfilValido = false;
        Cliente cliente = null;
        while(!perfilValido)

         resposta = JOptionPane.showInputDialog("Qual seu perfil cadastral(Fisico ou Juridico): ");
         
         if(resposta.equalsIgnoreCase("Fisico"))
         {
            cliente = new PessoaFisica();
            cliente.solicitarServico();
            perfilValido = true;

         } else if(resposta.equalsIgnoreCase("Judico"))
         {
            cliente = new PessoaJuridica();
            cliente.solicitarServico();
            perfilValido = true;
            
         } else {JOptionPane.showMessageDialog(null, "Digite uma categoria valida (Fisica ou Juridica)"); }
    }
}
