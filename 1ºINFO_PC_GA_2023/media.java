package atividade;

import javax.swing.JOptionPane;
public class media {

	public static void main(String[] args) {
	
      double aluno1[] = new double[4];
      double aluno2[] = new double[4];
      double aluno3[] = new double[4];
      double aluno4[] = new double[4];
      double aluno5[] = new double[4];
      double mediatotal[] = new double[5];
      double media = 7;
      double guarda = 0;
      
      for(int i = 0; i <= 3; i++) {
    	  
        aluno1[i] = Double.parseDouble(JOptionPane.showInputDialog("Aluno 1\n Digite sua " + (i+1)+ "ª nota"));
        guarda += aluno1[i];
      }
     mediatotal[0] = guarda / 4;
	JOptionPane.showMessageDialog(null,"Sua média final foi: " + mediatotal[0]);
	
	if (mediatotal[0] >= 7)
		JOptionPane.showMessageDialog(null,"Aprovado");
	else 
		JOptionPane.showMessageDialog(null,"Reprovado");
	
	guarda = 0;
	
	for(int i = 0; i <= 3; i++) {
  	  
        aluno2[i] = Double.parseDouble(JOptionPane.showInputDialog("Aluno 2\n Digite sua " + (i+1)+ "ª nota"));
        guarda += aluno2[i];
      }
     mediatotal[1] = guarda / 4;
	JOptionPane.showMessageDialog(null,"Sua média final foi: " + mediatotal[1]);
	
	if (mediatotal[1] >= 7)
		JOptionPane.showMessageDialog(null,"Aprovado");
	else 
		JOptionPane.showMessageDialog(null,"Reprovado");
	
	guarda = 0;
	
	for(int i = 0; i <= 3; i++) {
  	  
        aluno3[i] = Double.parseDouble(JOptionPane.showInputDialog("Aluno 3\n Digite sua " + (i+1)+ "ª nota"));
        guarda += aluno3[i];
      }
     mediatotal[2] = guarda / 4;
	JOptionPane.showMessageDialog(null,"Sua média final foi: " + mediatotal[2]);
	
	if (mediatotal[2] >= 7)
		JOptionPane.showMessageDialog(null,"Aprovado");
	else 
		JOptionPane.showMessageDialog(null,"Reprovado");
	
	guarda = 0;
	
	for(int i = 0; i <= 3; i++) {
  	  
        aluno4[i] = Double.parseDouble(JOptionPane.showInputDialog("Aluno 4\n Digite sua " + (i+1)+ "ª nota"));
        guarda += aluno4[i];
      }
     mediatotal[3] = guarda / 4;
	JOptionPane.showMessageDialog(null,"Sua média final foi: " + mediatotal[3]);
	
	if (mediatotal[3] >= 7)
		JOptionPane.showMessageDialog(null,"Aprovado");
	else 
		JOptionPane.showMessageDialog(null,"Reprovado");
	
	guarda = 0;
	
	for(int i = 0; i <= 3; i++) {
  	  
        aluno5[i] = Double.parseDouble(JOptionPane.showInputDialog("Aluno 5\n Digite sua " + (i+1)+ "ª nota"));
        guarda += aluno5[i];
      }
     mediatotal[4] = guarda / 4;
	JOptionPane.showMessageDialog(null,"Sua média final foi: " + mediatotal[4]);
	
	if (mediatotal[4] >= 7)
		JOptionPane.showMessageDialog(null,"Aprovado");
	else 
		JOptionPane.showMessageDialog(null,"Reprovado");
        
      
	}

}