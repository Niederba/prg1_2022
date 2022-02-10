package ch.teko.prg.tag03.solution.oop03_02.ue5;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.printf("Länge A %f, Länge B %f, Länge C %f%n", triangle.getLengthA(), triangle.getLengthB(), triangle.getLengthC());
        System.out.println("Fläche: " + triangle.calcArea());
    }
}
