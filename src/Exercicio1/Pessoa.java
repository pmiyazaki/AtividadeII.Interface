package Exercicio1;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer RG;


    public Pessoa(String nome, Integer RG){
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRG() {
        return RG;
    }

    public void setRG(Integer RG) {
        this.RG = RG;
    }

    @Override
    public boolean equals (Object obj){
        if(this == obj) {
            return true;
        } if ((obj == null) || this.getClass() != obj.getClass()){
            return false;
        }
        Pessoa pessoa = (Pessoa)obj;
        return pessoa.getRG().equals(this.getRG());

    }

}