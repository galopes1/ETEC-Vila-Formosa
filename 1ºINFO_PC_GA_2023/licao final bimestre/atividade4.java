package atividade;

import javax.swing.JOptionPane;
public class atividade4 {

	public static void main(String[] args) {
		
		int numeros[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int checarpares = 0;
		int checarimpares = 0;
		int numerospar[] = new int[11];
		int numerosimpar[] = new int[11];
		String numimpar = "Números impares\n";
		String numpar = "Números pares\n";
		
		for(int i = 0; i < 10; i++){
			if(numeros[i] % 2 == 0){
				checarpares++;
				numerospar[i] = numeros[i];			
		}else{
			checarimpares ++;
			numerosimpar[i] = numeros[i];
			}
		}
		for (int i = 0; i < numerospar.length; i++) {
	          System.out.println(numerospar[i] + "");
	      }
		for (int i = 0; i < numerosimpar.length; i++) {
	          System.out.println(numerosimpar[i] + "");
	      }
		for (int i = 0; i < 11; i++){
			numimpar += "Impar[" + (i+1) + "] " + numerosimpar[i] + "\n";
		}
		for (int i = 0; i < 11; i++){
			numpar += "Par[" + (i+1) + "] " + numerospar[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, numpar);
		JOptionPane.showMessageDialog(null, numimpar);
		

	}

}
