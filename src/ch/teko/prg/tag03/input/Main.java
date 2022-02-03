package ch.teko.prg.tag03.input;

public class Main {
    public static void main(String[] args) {
        // Demo Schlüsselwort static
        System.out.println(demoStatic.getSomething());
        System.out.println(demoStatic.counter);
        System.out.println(demoStatic.getSomething());
        System.out.println(demoStatic.counter);

        // Demo Thema Sichtbarkeit
        Mensch m1 = new Mensch("peter", 66);
        System.out.println(m1.getAlter());
    }
}
