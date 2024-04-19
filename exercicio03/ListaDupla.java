package exercicio03;

import javax.swing.JOptionPane;

public class ListaDupla {
    private IntNoDuplo primeiro, ultimo;
    private int numero_nos;

    ListaDupla() {
        primeiro = ultimo = null;
        numero_nos = 0;
    }

    public void insereNo(IntNoDuplo novoNo) {
        novoNo.prox = null;
        novoNo.ant = ultimo;
        if (primeiro == null)
            primeiro = novoNo;
        if (ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
        numero_nos++;
    }

    public IntNoDuplo pegarNo(int indice) {
        IntNoDuplo temp_no = primeiro;
        for (int i = 0; (i < indice) && (temp_no != null); i++)
            temp_no = temp_no.prox;
        return temp_no;
    }

    public void incluiNo(IntNoDuplo novoNo, int indice) {
        IntNoDuplo temp_no = pegarNo(indice);
        novoNo.prox = temp_no;
        if (novoNo.prox != null) {
            novoNo.ant = temp_no.ant;
            novoNo.prox.ant = novoNo;
        } else {
            novoNo.ant = ultimo;
            ultimo = novoNo;
        }
        if (indice == 0)
            primeiro = novoNo;
        else
            novoNo.ant.prox = novoNo;
        numero_nos++;
    }

    public void excluiNo(int indice) {
        if (indice == 0) {
            primeiro = primeiro.prox;
            if (primeiro != null)
                primeiro.ant = null;
        } else {
            IntNoDuplo temp_no = pegarNo(indice);
            temp_no.ant.prox = temp_no.prox;
            if (temp_no != ultimo) {
                temp_no.prox.ant = temp_no.ant;
            } else {
                ultimo = temp_no;
            }
        }
        numero_nos--;
    }

    public void exibirLista() {
        String retornoLista = "";
        IntNoDuplo temp_no = pegarNo(0);
        int i = 1;

        while (temp_no != null) {
            retornoLista += i + "ª posição: " + temp_no.valor + "\n";
            temp_no = temp_no.prox;
            i++;
        }

        JOptionPane.showMessageDialog(null, retornoLista);
    }
}
