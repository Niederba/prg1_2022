package ch.teko.prg.tag05.input.kontrollstrukturen.ifdemo;

public class Main {
    public static void main(String[] args) {
        // Personen möchten ins Resaturant
        Person p1 = new Person("Meier", false, false);
        Person p2 = new Person("Heinz", false, true);

        // Massnahmenkontrolle am Eingang
        Coronamassnahmen c = new Coronamassnahmen();
        System.out.println("Darf eintreten: " + c.ueberpruefestatus(p1));
        System.out.println("Darf eintreten: " + c.ueberpruefestatus(p2));
    }
}
