package ch.teko.prg.tag03.input;

public class Mensch {
    public String name;
    private int alter;

    public Mensch(String name, int alter) {
        // Konstruktorenverkettung mit this(...)
        this(name);
        this.alter = alter;
    }

    // Dieser private Konstruktor ist nur innerhalb des scopes/ Blocks von Mensch {...} aufrufbar
    private Mensch(String name) {
        this.name = name.toUpperCase();
    }

    public int getAlter() {
        return alter;
    }
}
