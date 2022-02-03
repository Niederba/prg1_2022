package ch.teko.prg.tag03.input;

public class demoStatic {
    // static attribute
    public static int counter;

    public demoStatic() {
    }

    public static String getSomething() {
        counter++;
        return "Hello World!";
    }
}
