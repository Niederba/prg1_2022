package ch.teko.prg.tag04.input.ifdemo;

public class Ticketautomat {
    private int basePrice;

    public Ticketautomat(int basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice(Person p) {
        double price = this.basePrice;
        int alter = p.getAlter();

        if (alter < 18) {
            price += 1;
        }
        else if (alter < 65) {
            price += 2;
        }
        else {
            price -=1;
        }
        return price;
    }
}
