package atividade;

import javax.swing.JOptionPane;
public class atividade2 {
 	public static void main (String[]args){	
	int resp = Integer.parseInt(JOptionPane.showInputDialog(
			"\n Deseja executar este programa? \n Digite 1- Para Sim ou 2 - Para N�o.")); 
	while (resp == 1) { // enquanto resp for iqual a 1 ...
	  double base = Double.parseDouble(JOptionPane.showInputDialog
				                ( " Digite a base do ret�ngulo : "));
	  double altura = Double.parseDouble(JOptionPane.showInputDialog
				                ( " Digite a altura do ret�ngulo : "));          
	  double  area = base * altura;
	  JOptionPane.showMessageDialog(null," A area do ret�ngulo � igual a " +  area + "\n");      
	  resp = Integer.parseInt(JOptionPane.showInputDialog
			   ("\n Deseja calcular a �rea novamente ? "
			  + "\n Digite 1- Para Sim ou 2 - Para N�o."));         
	    }; // ... executa at� aqui  
   }
}