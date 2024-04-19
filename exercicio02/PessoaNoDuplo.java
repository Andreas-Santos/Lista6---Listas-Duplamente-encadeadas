package exercicio02;

public class PessoaNoDuplo {
    Pessoa p;
    PessoaNoDuplo prox;
    PessoaNoDuplo ant;
 
    PessoaNoDuplo (Pessoa p){
        this.p = p;
        prox = ant = null;
    }
}
