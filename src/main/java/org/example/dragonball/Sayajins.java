package org.example.dragonball;
import org.example.dragonball.Character;

public class Sayajins extends Character{
    private String bornWithTail;
    private String hairColor;
    private int transformationsSsj;

    public Sayajins(String name, int age, String bornWithTail, String hairColor, int transformationsSsj) {
        super(name, age);
        this.bornWithTail = bornWithTail;
        this.hairColor = hairColor;
        this.transformationsSsj = transformationsSsj;
    }

    public String introduce() {
        return "Hola, soy " + super.getName() + ". Soy un Sayajin! Yo tengo " + super.getAge() + " años en el segundo dragon ball (Z) :P La verdad es que: " + bornWithTail + " tengo una cauda, y el color de mi pelo es " + hairColor + ". Puedo transformarme " + transformationsSsj + "x en SSJ!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornWithTail() {
        return bornWithTail;
    }

    public void setBornWithTail(String bornWithTail) {
        this.bornWithTail = bornWithTail;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getTransformationsSsj() {
        return transformationsSsj;
    }

    public void setTransformationsSsj(int transformationsSsj) {
        this.transformationsSsj = transformationsSsj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
