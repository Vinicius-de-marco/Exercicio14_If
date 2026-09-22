
import javax.swing.JOptionPane;
public class principal {

    public static void main(String[] args) {
        int nasc,ano, idade;
        
        nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano autal: "));
        
        if (nasc >= ano) {
            JOptionPane.showMessageDialog(null, "Ano de nascimento invalido! ");
        } else {
            idade = nasc - ano;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        }
    }
}
