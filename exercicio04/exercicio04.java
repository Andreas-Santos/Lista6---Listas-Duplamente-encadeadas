// 4) Escreva um programa em JAVA que possibilite ao usuário incluir elementos
// em uma lista duplamente encadeada. Permita também ao usuário realizar
// uma busca por um valor inteiro na lista e informe se o valor está ou não na
// estrutura. Implemente e utilize um método que permita percorrer os
// elementos começando no último até chegar no primeiro (utilize o ant
// (anterior)) e mostre na tela os elementos visitados nessa ordem.

package exercicio04;

import javax.swing.JOptionPane;

public class exercicio04 {
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();
        int opcao;
        int valor;
        int valorBuscado;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Selecione a opção desejada:\n" +
                "1 - Inserir elemento na lista\n" +
                "2 - Checar se um elemento está na lista\n" +
                "3 - Mostrar lista de trás pra frente\n" +
                "0 - Encerrar programa"));

            switch (opcao) {
                case 1:
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Digite o valor que deseja incluir na lista:"));
                    ld.insereNo(new IntNoDuplo(valor));
                    break;

                case 2:
                    valorBuscado = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Digite o valor do elemento que deseja buscar na lista:"));
                    
                    if(ld.buscarPorValor(valorBuscado) != null) {
                        JOptionPane.showMessageDialog(
                            null,
                            "O valor buscado foi encontrado!");
                    }
                    else {
                        JOptionPane.showMessageDialog(
                            null,
                            "O valor buscado não foi encontrado!");
                    }
                    break;

                case 3:
                    ld.exibirListaAoContrario();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(
                        null,
                        "Programa encerrado!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(
                        null,
                        "O valor digitado não é válido, tente novamente!");
                    break;
            }
        }while(opcao != 0); 
    }
}
