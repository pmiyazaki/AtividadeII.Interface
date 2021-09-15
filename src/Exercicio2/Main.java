package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Coca coca1 = new Coca (500, 8.0);
        Coca coca2 = new Coca (500, 9.0);

        if(coca1.equals(coca2)) {
            System.out.println("Coca1 é igual a coca2");
        } else {
            System.out.println("Coca1 é diferente de coca2");
        }
    }
}

//Questão 04: A coca1 é diferente da coca2.
//Questão 06: Após modificar o contrato de equals em Coca, coca1 passa a ser igual a coca2, pois no
//contrato passa-se que se os tamanhos das cocas forem iguais elas serão consideradas iguais.