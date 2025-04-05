package atividade;

import javax.swing.JOptionPane;
public class atividade2 {
 	public static void main (String[]args){	
	int resp = Integer.parseInt(JOptionPane.showInputDialog(
			"\n Deseja executar este programa? \n Digite 1- Para Sim ou 2 - Para Não.")); 
	while (resp == 1) { // enquanto resp for iqual a 1 ...
	  double base = Double.parseDouble(JOptionPane.showInputDialog
				                ( " Digite a base do retângulo : "));
	  double altura = Double.parseDouble(JOptionPane.showInputDialog
				                ( " Digite a altura do retângulo : "));          
	  double  area = base * altura;
	  JOptionPane.showMessageDialog(null," A area do retângulo é igual a " +  area + "\n");      
	  resp = Integer.parseInt(JOptionPane.showInputDialog
			   ("\n Deseja calcular a área novamente ? "
			  + "\n Digite 1- Para Sim ou 2 - Para Não."));         
	    }; // ... executa até aqui  
   }
}