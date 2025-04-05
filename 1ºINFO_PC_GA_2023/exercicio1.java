package exercicios;

import javax.swing.JOptionPane;
public class exercicio1 {

	public static void main(String[] args) {
		
		int numeros[] = new int[20];
		int numeros2[] = new int[20];
		int numeros3[] = new int[20];
		int vetnumeros = 0;
		int tamanho = 19;
		int X = 0;
		for(int i = 0; i <= tamanho; i++){
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Primeiro vetor \n Entre o valor do " + (i+1)+ "° número"));
		
			vetnumeros = vetnumeros + numeros[i];
		}
	
    for(int i = 0; i <= tamanho; i++){
	numeros2[i] = Integer.parseInt(JOptionPane.showInputDialog("Segundo vetor \n Entre o valor do " + (i+1) + "° número"));
    
    
    vetnumeros = vetnumeros + numeros2[i];
	}
	
    for(int i = 0; i <= tamanho; i++){
    numeros3[i] = numeros2[i] + numeros[i];
    	
    	
    }
    
    String message = "Resultado da soma (Vetor C):\n";
    
    for(int i = 0; i <= tamanho; i++){
    	
    	message += "C[" + i + "] = " + numeros3[i] + "\n";
    	
    }
    
    
    
    
    
	JOptionPane.showMessageDialog(null, message);
	
	
	}

}
