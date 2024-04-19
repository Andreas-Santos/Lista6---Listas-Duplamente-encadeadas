// 1) Escreva um programa em JAVA que leia números inteiros e armazene em
// uma LISTA DUPLAMENTE ENCADEADA. A entrada de dados deve ser
// interrompida quando o usuário informar o número zero ou esgotar a
// quantidade definida de elementos a serem armazenados na estrutura. Por
// último, imprima os elementos existentes na lista duplamente encadeada
// criada.

package exercicio01;

import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();
        int valor;

        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite o valor que deseja incluir na lista (ou digite 0 para finalizar a inserção de valores):"));
            
            if(valor == 0) {
                break;
            }

            ld.insereNo(new IntNoDuplo(valor));
        }while(valor != 0);

        ld.exibirLista();
    }
}