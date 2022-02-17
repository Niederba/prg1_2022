package ch.teko.prg.tag05.input.kontrollstrukturen.ifdemo;

public class Coronamassnahmen {

    /**
     * ueberpruefe ob Person ein gültiges Zertifikat oder eine negativen PCR-Test besitzt.
     *
     * @param p vom Klassentyp Person
     * @return boolean
     */
    public boolean ueberpruefestatus(Person p) {
        if (p.isCovidzertifikat() || p.isPcrtest()) {
            return true;
        } else {
            return false;
        }
    }
}
