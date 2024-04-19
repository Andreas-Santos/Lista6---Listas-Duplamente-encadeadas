// 3) Escreva um programa em JAVA que crie e preencha uma fila e remova os
// elementos da fila e coloque na lista duplamente encadeada e na sequência
// imprima os elementos existentes na lista. Crie um método na classe
// ListaDupla que realize corretamente a exibição dos elementos da lista por
// meio de uma caixa de diálogo (JOptionPane).

package exercicio03;

import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {
        Fila f = new Fila(5);
        ListaDupla ld = new ListaDupla();
        int valor;

        while(!f.cheia()) {
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite o valor que deseja incluir na fila:"));
            f.enfileirar(valor);
        }

        JOptionPane.showMessageDialog(
            null,
            "Passando todos os elementos da fila para a lista!");

        while (!f.vazia()) {
            ld.insereNo(new IntNoDuplo(Integer.parseInt(f.desenfileirar())));
        }

        ld.exibirLista();
    }
}
