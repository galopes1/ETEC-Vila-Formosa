package lanchonete;

import javax.swing.JOptionPane;

public class lanche {
    public static void main(String[] args) {
        int total = 0;
    	int resp = 0;
        String notaFiscal = "NOTA FISCAL:\n";
        do {
            int lancheEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha um lanche, colocando seu respectivo número \n Lanches disponíveis: \n (1) xburger: 7 reais \n (2) xbacon: 8 reais \n (3) xegg: 6 reais \n (4) misto quente 4 reais \n "));
            int precoLanche = 0;
            String nomeLanche = "";

            switch (lancheEscolhido) {
                case 1:
                    precoLanche += 7;
                    nomeLanche = "X-Burger";
                    break;
                case 2:
                    precoLanche += 8;
                    nomeLanche = "X-Bacon";
                    break;
                case 3:
                    precoLanche += 6;
                    nomeLanche = "X-Egg";
                    break;
                case 4:
                    precoLanche += 4;
                    nomeLanche = "Misto Quente";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida.");
                    return;
            }

            notaFiscal += nomeLanche + ": " + precoLanche + " reais\n";
            total += precoLanche;
            resp = Integer.parseInt(JOptionPane.showInputDialog("\n Deseja escolher outro lanche? \n Digite 1 - Para Sim ou 2 - Para Não."));
        } while (resp == 1);

        int resposta = 0;
        do {
            int sucoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha um suco, colocando seu respectivo número \n Sucos disponíveis: \n (1) Laranja: 3 reais \n (2) Uva: 3 reais \n (3) Limão: 3 reais \n (4) Manga 3 reais \n "));
            int precosuco = 0;
            String nomeSuco = "";

            switch (sucoEscolhido) {
                case 1:
                    precosuco = 3;
                    nomeSuco = "Suco de Laranja";
                    break;
                case 2:
                    precosuco = 3;
                    nomeSuco = "Suco de Uva";
                    break;
                case 3:
                    precosuco = 3;
                    nomeSuco = "Suco de Limão";
                    break;
                case 4:
                    precosuco = 3;
                    nomeSuco = "Suco de Manga";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida.");
                    return;
            }

            notaFiscal += nomeSuco + ": " + precosuco + " reais\n";
            total += precosuco;
            resposta = Integer.parseInt(JOptionPane.showInputDialog("\n Deseja escolher outro suco? \n Digite 1 - Para Sim ou 2 - Para Não."));
        } while (resposta == 1);
        
      notaFiscal += "Valor Total: " + total + " reais\n";
        JOptionPane.showMessageDialog(null, notaFiscal);
    }
}
