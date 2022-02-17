package ch.teko.prg.tag05.input.kontrollstrukturen.ifdemo;

public class Person {
    private String name;
    // besitzt ein gueltiges Covidzertifikat
    private boolean covidzertifikat;
    // besitzt einen negativen PCR-Test
    private boolean pcrtest;

    public Person(String name, boolean covidzertifikat, boolean pcrtest) {
        this.name = name;
        this.covidzertifikat = covidzertifikat;
        this.pcrtest = pcrtest;
    }

    public String getName() {
        return name;
    }

    public boolean isCovidzertifikat() {
        return covidzertifikat;
    }

    public boolean isPcrtest() {
        return pcrtest;
    }
}
