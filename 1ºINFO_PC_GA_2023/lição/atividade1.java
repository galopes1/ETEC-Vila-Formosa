package atividade;
import javax.swing.JOptionPane;
public class atividade1 {
	public static void main (String[]args){
		JOptionPane.showMessageDialog(null,"A conta poupan�a tem um dep�sito de R$500,00 com remunera��o de 1% ao m�s de juros");
int resp = Integer.parseInt(JOptionPane.showInputDialog("\n Deseja calcular quanto ter� na conta em 3 meses? \n Digite 1- Para Sim ou 2 - Para N�o.")); 		
while (resp == 1) { // enquanto resp for iqual a 1 ...

double primeiromes = 500 / 100 * 1;

double segundomes = 500 / 100 * 1;

double terceiromes = 500 / 100 * 1;

double resposta = primeiromes + segundomes + terceiromes + 500;

JOptionPane.showMessageDialog(null,"O saldo na conta ser� de R$" +  resposta + "\n");
resp = Integer.parseInt(JOptionPane.showInputDialog
		   ("\n Deseja calcular a conta novamente ? "
		  + "\n Digite 1- Para Sim ou 2 - Para N�o."));         
 }; // ... executa at� aqui  
}
}














