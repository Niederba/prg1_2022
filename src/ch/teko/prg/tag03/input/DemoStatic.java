package ch.teko.prg.tag03.input;

public class DemoStatic {
    // static attribute
    public static int counter;

    public DemoStatic() {
    }

    public static String getSomething() {
        counter++;
        return "Hello World!";
    }
}
