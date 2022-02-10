package ch.teko.prg.tag03.solution.oop03_01.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("Rectangle 1", 5, 5, 2.0, 3.0);
        System.out.println(rec1.getName());
        System.out.println(rec1.getxPosition());
        System.out.println(rec1.getyPosition());
        rec1.printCalculatedArea();

        System.out.println("-------------");

        Rectangle rec2 = new Rectangle("Rectangle 2", 2, 2);
        System.out.println(rec2.getName());
        System.out.println(rec2.getLaenge());
        rec2.setLaenge(20.0);
        System.out.println(rec2.getBreite());
        rec2.setBreite(10.0);
        rec2.printCalculatedArea();
    }
}
