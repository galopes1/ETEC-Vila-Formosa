package atividade;

import javax.swing.JOptionPane;

public class listanome {

    public static void main(String[] args) {

        String[] nomes = new String[10]; 
        boolean encontrado = false; 

        for (int i = 0; i < 10; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite um nome:");
        }

        String nomeProcurado = JOptionPane.showInputDialog("Procure um nome na lista \n Digite um nome");


        for (int i = 0; i < 10; i++) {
            if (nomes[i].equals(nomeProcurado)) {
                encontrado = true;
                break; 
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Achei");
        } else {
            JOptionPane.showMessageDialog(null, "Não achei");
        }
    }
}