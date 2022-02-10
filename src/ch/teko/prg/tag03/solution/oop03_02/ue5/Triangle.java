package ch.teko.prg.tag03.solution.oop03_02.ue5;

public class Triangle {
    private String color;
    private int xPosition;
    private int yPosition;
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(String color, int xPosition, int yPosition, double lengthA, double lengthB, double lengthC) {
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    // in der Aufgabenstellung nicht verlangt, Konstruktorenverkettung mit this(...)
    public Triangle(String color) {
        this(color, (int) (Math.random() * 50), (int) (Math.random() * 50), (Math.random() * 100), (Math.random() * 100), (Math.random() * 100));
    }

    // in der Aufgabenstellung nicht verlangt, Konstruktorenverkettung mit this(...)
    public Triangle() {
        this("Grün");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    // if - else-if - else Abfrage nicht verlangt. Wird benötigt, um ungültige Eingaben abzufangen
    public double calcArea() {
        if (!(lengthA >= 0) || !(lengthB >= 0) || !(lengthC >= 0)) {
            System.out.println("Einer der Werte " + lengthA + ", " + lengthB + " oder " + lengthC + " ist ungültig");
        } else if (!(lengthA + lengthB > lengthC) || !(lengthB + lengthC > lengthA) || !(lengthC + lengthA > lengthB)) {
            System.out.println("ungültiges Dreieck!");
        } else { //Seitenlänge s
            double s = (this.lengthA + this.lengthB + this.lengthC) / 2;
            return Math.sqrt(s * (s - this.lengthA) * (s - this.lengthB) * (s - this.lengthC));
        }
        return 0.0;
    }
}

