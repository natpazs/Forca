import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao jogo da forca! Você terá 6 chances de acertar um animal. \n Boa Sorte!");
        Classe animal = new Classe();
        int x = 1;
        while (x == 1) {
            String animaal = animal.sortear();
            StringBuilder animalEscondico = new StringBuilder();
            int tentativasRestantes = 6;

            int pergunta = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer: \n 1 - Jogar \n 2- Sair"));
            if (pergunta == 1) {
                for (int a = 0; a < animaal.length(); a++) {
                    animalEscondico.append("_ ");
                }

                JOptionPane.showMessageDialog(null,"A palavra é: "+ animalEscondico + "\n " + tentativasRestantes);
                while (tentativasRestantes > 0) {


                    String valUsuario = JOptionPane.showInputDialog("Qual seu chute:");
                    String caixaAlta = valUsuario.toUpperCase();

                    char letraTentativa = caixaAlta.charAt(0);
                    boolean letraEncontrada = false;

                    for (int i = 0; i < animaal.length(); i++) {
                        if (animaal.charAt(i) == letraTentativa) {
                            animalEscondico.setCharAt(i, letraTentativa);
                            letraEncontrada = true;
                        }
                    }

                    if (!letraEncontrada) {
                        JOptionPane.showMessageDialog(null, "A letra " + letraTentativa + " não está na palavra");
                        tentativasRestantes--;
                    }

                    if (animalEscondico.toString().equals(animaal) || tentativasRestantes == 0) {
                        x = 0;
                    }

                }
            }
            else if(pergunta == 2){
                x = 0;
            }
            else {
                JOptionPane.showMessageDialog(null,"Valor invalido");
            }
            if(tentativasRestantes == 0) {
                JOptionPane.showMessageDialog(null, "Você perdeu! \n A palavra era"+ animaal);
            }

        }
    }
}