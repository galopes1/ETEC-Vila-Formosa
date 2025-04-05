package setores;

import javax.swing.JOptionPane;
public class exerciciomatriz {

	public static void main(String[] args) {
 
		int soma = 0;
		int diag = 0;
		int diag2 = 0;
		int linha, coluna;
		int matriz[][] = new int[3][3];

		for(linha = 0;linha  < 3 ; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Entre o valor da " + (linha +1) + " linha "));		
				
			}
		}
		diag = matriz[0][0] + matriz[1][1] + matriz[2][2];
		JOptionPane.showMessageDialog(null,"A soma da linha diagonal é "+ diag);
		
		diag2 = matriz[0][2] + matriz[1][1] + matriz[0][2];
		JOptionPane.showMessageDialog(null, "A soma da linha diagonal secundária é " + diag2 );
		
		soma = matriz[1][0] + matriz[1][1] + matriz[1][2];
		JOptionPane.showMessageDialog(null, "A soma da segunda linha é " + soma);
	}

}
