package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Patricia", 4603);
        Pessoa pessoa2 = new Pessoa("Maria", 4603);

        if (pessoa1.equals(pessoa2)) {
            System.out.println("Patricia igual a Maria");
        } else {
            System.out.println("Patricia diferente de Maria");
        }
    }
}

//Questão 04: O resultado foi que a pessoa1 é diferente da pessoa2
//Questão 06: Ao atribuir um novo contrato o equals, a pessoa1 passou a ser igual a pessoa2 pois ambas
//possuem o mesmo número de RG.
