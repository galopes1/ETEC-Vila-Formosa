package atividade;

import javax.swing.JOptionPane;

public class vetorinteiro {
	public static void main(String[] args) {

	int numeros[] = new int[10];
	int marcar = 0;
	int media = 0;
	int multiplos =  0;
	int maiordez = 0;
	int menorquetrinta = 0;
	
	for(int i = 0; i < 10; i++){
	
	  numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "� n�mero inteiro" ));
	  marcar += numeros[i];	 
	}
       media = marcar / 10;
	
       JOptionPane.showMessageDialog(null, "A m�dia dos n�meros �: " + media);
       
       
       for(int i = 0; i < 10; i++){
        
    	    if(numeros[i] % 5 == 0){
    	       multiplos ++; 	
    	    }
    	    else{
    	    }
    	   
    	    if(numeros[i] > 10){
    	    	maiordez ++;
    	    }
    	    else{
    	    	
    	    }
    	    if(numeros[i] < 30){
    	    	menorquetrinta ++;
    	    }
    	    else{
    	    	
    	    }
       }
    	    
    	    JOptionPane.showMessageDialog(null,"Na lista tem " + multiplos + " m�ltiplos de 5 \n" + "Na lista tem " + maiordez + " n�meros maiores que dez. \n" + "Na lista tem " + menorquetrinta + " n�meros menores que trinta");
    	       
       }
       }
	
