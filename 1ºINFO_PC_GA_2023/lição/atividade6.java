package oi;
import javax.swing.JOptionPane;

public class atividade6 {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog(null, "Digite o peso (em kg):");
        double peso = Double.parseDouble(pesoStr);

        String alturaStr = JOptionPane.showInputDialog(null, "Digite a altura (em metros):");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.0) {
            classificacao = "Magreza";
        } else if (imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        String mensagem = "O IMC é: " + imc + "\nClassificação: " + classificacao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
