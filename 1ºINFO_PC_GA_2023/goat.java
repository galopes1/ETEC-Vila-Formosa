package bron;
import javax.swing.JOptionPane;
public class goat{	
   public static void main (String args[]){	
	   
	   int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua nota"));
	   
       if (nota>4)
    	   JOptionPane.showMessageDialog(null, "Voc� foi aprovado");
       
       else 
    	   JOptionPane.showMessageDialog(null, "Voc� foi reprovado");
	
      }
}
 
