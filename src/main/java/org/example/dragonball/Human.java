package org.example.dragonball;

public class Human extends Character {
    private String itens;
    private String gender;
    private String relationToASayajin;

    public Human(String name, int age, String gender, String itens, String relationToASayajin) {
        super(name, age);
        this.gender = gender;
        this.itens = itens;
        this.relationToASayajin = relationToASayajin;
    }
    public String introduce() {
        return "Hola, soy " + super.getName() + ". Soy un/a humano/a, y tengo " + super.getAge() +" años en DBZ! Soy " + this.gender + " y no salgo sín mi " + this.itens + ". Soy " + this.relationToASayajin +  " de un Sayajin!";
    }


    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationToASayajin() {
        return relationToASayajin;
    }

    public void setRelationToASayajin(String relationToASayajin) {
        this.relationToASayajin = relationToASayajin;
    }
}
