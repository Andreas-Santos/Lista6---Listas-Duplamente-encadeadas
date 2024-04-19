// 2) Escreva um programa em JAVA que receba o nome e a idade de um
// conjunto de 10 pessoas em uma LISTA DUPLAMENTE ENCADEADA. Por
// último, imprima os elementos existentes na lista duplamente encadeada
// criada.

package exercicio02;

import javax.swing.JOptionPane;


public class exercicio02 {
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();
        int idade;
        String nome;

        for(int i = 1; i <= 10; i ++) {
            nome = JOptionPane.showInputDialog(
                null,
                "Informe o nome da "+ i + "ª pessoa:");
            
            idade = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Informe o idade da "+ i + "ª pessoa:"));

            ld.insereNo(new PessoaNoDuplo(new Pessoa(nome, idade)));
        }

        ld.exibirLista();
    }
}
