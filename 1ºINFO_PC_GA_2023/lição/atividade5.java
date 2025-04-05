package oi;
import javax.swing.JOptionPane;

public class atividade5 {
    public static void main(String[] args) {
        String senhaCorreta = "asdfg";
        int tentativasRestantes = 3;
        boolean senhaCorretaDigitada = false;

        while (tentativasRestantes > 0 && !senhaCorretaDigitada) {
            String senhaDigitada = JOptionPane.showInputDialog(null, "Digite a senha:");
            
            if (senhaDigitada.equals(senhaCorreta)) {
                senhaCorretaDigitada = true;
                JOptionPane.showMessageDialog(null, "Senha correta! Acesso permitido.");
            } else {
                tentativasRestantes--;
                JOptionPane.showMessageDialog(null, "Senha incorreta! Tente novamente. Tentativas restantes: " + tentativasRestantes);
            }
        }

        if (!senhaCorretaDigitada) {
            JOptionPane.showMessageDialog(null, "Você excedeu o número máximo de tentativas. Acesso negado.");
        }
    }
}
