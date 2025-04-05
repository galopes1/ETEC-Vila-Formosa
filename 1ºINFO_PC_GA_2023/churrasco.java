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
                            "1. Carne bovina (500g) - Disponível: " + carneBovinaDisponivel + " itens\n" +
                            "2. Tulipa (500g) - Disponível: " + tulipaDisponivel + " itens\n" +
                            "3. Linguiça de frango (500g) - Disponível: " + linguicaFrangoDisponivel + " itens\n" +
                            "4. Farofa (1kg) - Disponível: " + farofaDisponivel + " itens\n" +
                            "5. Refrigerante (1 litro) - Disponível: " + refrigeranteDisponivel + " itens"
            ));

            switch (primeiroItem) {
                case 1:
                    if (carneBovinaDisponivel > 0) {
                        carneBovinaDisponivel--;
                        relatorio += "- Carne bovina\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 2:
                    if (tulipaDisponivel > 0) {
                        tulipaDisponivel--;
                        relatorio += "- Tulipa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 3:
                    if (linguicaFrangoDisponivel > 0) {
                        linguicaFrangoDisponivel--;
                        relatorio += "- Linguiça de frango\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 4:
                    if (farofaDisponivel > 0) {
                        farofaDisponivel--;
                        relatorio += "- Farofa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 5:
                    if (refrigeranteDisponivel > 0) {
                        refrigeranteDisponivel--;
                        relatorio += "- Refrigerante\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha novamente.");
                    i--;
                    continue;
            }

            int segundoItem = Integer.parseInt(JOptionPane.showInputDialog(
                    "Amigo " + i + ", escolha o segundo item:\n" +
                            "1. Carne bovina (500g) - Disponível: " + carneBovinaDisponivel + " itens\n" +
                            "2. Tulipa (500g) - Disponível: " + tulipaDisponivel + " itens\n" +
                            "3. Linguiça de frango (500g) - Disponível: " + linguicaFrangoDisponivel + " itens\n" +
                            "4. Farofa (1kg) - Disponível: " + farofaDisponivel + " itens\n" +
                            "5. Refrigerante (1 litro) - Disponível: " + refrigeranteDisponivel + " itens"
            ));

            switch (segundoItem) {
                case 1:
                    if (carneBovinaDisponivel > 0) {
                        carneBovinaDisponivel--;
                        relatorio += "- Carne bovina\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 2:
                    if (tulipaDisponivel > 0) {
                        tulipaDisponivel--;
                        relatorio += "- Tulipa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 3:
                    if (linguicaFrangoDisponivel > 0) {
                        linguicaFrangoDisponivel--;
                        relatorio += "- Linguiça de frango\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 4:
                    if (farofaDisponivel > 0) {
                        farofaDisponivel--;
                        relatorio += "- Farofa\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                case 5:
                    if (refrigeranteDisponivel > 0) {
                        refrigeranteDisponivel--;
                        relatorio += "- Refrigerante\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção indisponível. Escolha novamente.");
                        i--;
                        continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha novamente.");
                    i--;
                    continue;
            }

            relatorio += "\n";
        }

        JOptionPane.showMessageDialog(null, "Relatório:\n\n" + relatorio);
    }
}
