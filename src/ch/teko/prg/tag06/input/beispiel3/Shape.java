package ch.teko.prg.tag06.input.beispiel3;

public class Shape {
    public String color;

    public Shape() {
        this("Blue");
    }

    public Shape(String color) {
        this.color = color;
    }

    public void printSmth() {
        System.out.println(this.color);
    }
}
