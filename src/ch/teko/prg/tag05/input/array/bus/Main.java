package ch.teko.prg.tag05.input.array.bus;

public class Main {
    public static void main(String[] args) {

        // Neues Bus Objekt. Mit dem Parameter 2 wird die Anzahl Sitzplaetze mitgegeben
        Bus postauto = new Bus(2);

        Person p1 = new Person("Meier", "Peter");
        postauto.setSitzPlatz(0, p1);

        Person p2 = new Person("Muster", "Hans");
        postauto.setSitzPlatz(1, p2);

        for (int i = 0; i < postauto.getSitzPlaetze().length; i++) {
            System.out.printf("Sitzplatz: %d, Vorname: %s, Nachname: %s%n", i, postauto.getSitzPlaetze()[i].getVorName(), postauto.getSitzPlaetze()[i].getName());
        }
    }
}
