package churrasco;
import javax.swing.JOptionPane;

public class churrasco {
    public static void main(String[] args) {
        int amigos = 7;
        int carneBovinaDisponivel = 4;
        int tulipaDisponivel = 2;
        int linguicaFrangoDisponivel = 2;
        int farofaDisponivel = 1;
        int refrigeranteDisponivel = 5;

        String relatorio = "";

        for (int i = 1; i <= amigos; i++) {
            relatorio += "Amigo " + i + ":\n";

            int primeiroItem = Integer.parseInt(JOptionPane.showInputDialog(
                    "Amigo " + i + ", escolha o primeiro item:\n" +
                            "1. Carne bovina (500g) - Dispon�vel: " + carneBovinaDisponivel + " itens\n" +
                            "2. Tulipa (500g) - Dispon�vel: " + tulipaDisponivel + " itens\n" +
                            "3. Lingui�a de frango (500g) - Dispon�vel: " + linguicaFrangoDisponivel + " itens\n" +
                            "4. Farofa (1kg) - Dispon�vel: " + farofaDisponivel + " itens\n" +
                            "5. Refrigerante (1 litro) - Dispon�vel: " + refrigeranteDisponivel + " itens"
            ));

            switch (primeiroItem) {
                case 1:
                    if (carneBovinaDisponivel > 0) {
                        carneBovinaDisponivel--;
                        relatorio += "- Carne bovina\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 2:
                    if (tulipaDisponivel > 0) {
                        tulipaDisponivel--;
                        relatorio += "- Tulipa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 3:
                    if (linguicaFrangoDisponivel > 0) {
                        linguicaFrangoDisponivel--;
                        relatorio += "- Lingui�a de frango\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 4:
                    if (farofaDisponivel > 0) {
                        farofaDisponivel--;
                        relatorio += "- Farofa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 5:
                    if (refrigeranteDisponivel > 0) {
                        refrigeranteDisponivel--;
                        relatorio += "- Refrigerante\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida. Escolha novamente.");
                    i--;
                    continue;
            }

            int segundoItem = Integer.parseInt(JOptionPane.showInputDialog(
                    "Amigo " + i + ", escolha o segundo item:\n" +
                            "1. Carne bovina (500g) - Dispon�vel: " + carneBovinaDisponivel + " itens\n" +
                            "2. Tulipa (500g) - Dispon�vel: " + tulipaDisponivel + " itens\n" +
                            "3. Lingui�a de frango (500g) - Dispon�vel: " + linguicaFrangoDisponivel + " itens\n" +
                            "4. Farofa (1kg) - Dispon�vel: " + farofaDisponivel + " itens\n" +
                            "5. Refrigerante (1 litro) - Dispon�vel: " + refrigeranteDisponivel + " itens"
            ));

            switch (segundoItem) {
                case 1:
                    if (carneBovinaDisponivel > 0) {
                        carneBovinaDisponivel--;
                        relatorio += "- Carne bovina\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 2:
                    if (tulipaDisponivel > 0) {
                        tulipaDisponivel--;
                        relatorio += "- Tulipa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 3:
                    if (linguicaFrangoDisponivel > 0) {
                        linguicaFrangoDisponivel--;
                        relatorio += "- Lingui�a de frango\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 4:
                    if (farofaDisponivel > 0) {
                        farofaDisponivel--;
                        relatorio += "- Farofa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 5:
                    if (refrigeranteDisponivel > 0) {
                        refrigeranteDisponivel--;
                        relatorio += "- Refrigerante\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Op��o indispon�vel. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida. Escolha novamente.");
                    i--;
                    continue;
            }

            relatorio += "\n";
        }

        JOptionPane.showMessageDialog(null, "Relat�rio:\n\n" + relatorio);
    }
}
