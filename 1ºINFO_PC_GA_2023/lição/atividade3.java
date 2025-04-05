package atividade;

import javax.swing.JOptionPane;
public class atividade3 {
 	public static void main (String[]args){	
	int resp = Integer.parseInt(JOptionPane.showInputDialog(
			"\n Deseja executar este programa? \n Digite 1- Para Sim ou 2 - Para Não.")); 
	while (resp == 1) { // enquanto resp for iqual a 1 ...
	  double nota1 = Double.parseDouble(JOptionPane.showInputDialog
				                ( " Digite a primeira nota : "));
	  double nota2 = Double.parseDouble(JOptionPane.showInputDialog
			  				                ( " Digite a segunda nota : "));
	  double nota3 = Double.parseDouble(JOptionPane.showInputDialog
              ( " Digite a terceira nota : "));
	  double nota4 = Double.parseDouble(JOptionPane.showInputDialog
              ( " Digite a quarta nota : "));
	  double  media = (nota1 + nota2 + nota3 + nota4) / 4;
	  JOptionPane.showMessageDialog(null," A sua média anual é de:" +  media + "\n");      
	  resp = Integer.parseInt(JOptionPane.showInputDialog
			   ("\n Deseja calcular a sua nota novamente? "
			  + "\n Digite 1- Para Sim ou 2 - Para Não."));         
	    }; // ... executa até aqui  
   }
}