package oi;
import javax.swing.JOptionPane;

public class atividade4 {

    public static void main(String[] args) {
    	int resp = Integer.parseInt(JOptionPane.showInputDialog(
    			"\n Deseja executar este programa? \n Digite 1- Para Sim ou 2 - Para Não.")); 
    	while (resp == 1) { // enquanto resp for iqual a 1 ...
    	
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
            char sexo = JOptionPane.showInputDialog("Digite seu sexo").charAt(0);
            
            double pesoideal;
            if (sexo == 'm' || sexo == 'M') {
                pesoideal = (72.7 * altura) - 58;
            } else {	
                pesoideal = (62.1 * altura) - 44.7;
            }
            
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoideal + "kg");
            
            resp = Integer.parseInt(JOptionPane.showInputDialog("\n Deseja calcular o peso ideal novamente? "
                    + "\n Digite 1- Para Sim ou 2 - Para Não."));
    	};
    }
}