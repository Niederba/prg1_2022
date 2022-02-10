package ch.teko.prg.tag04.input.loopdemo;

public class Whiledemo {
    public static void main(String[] args) throws InterruptedException {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Endlosschleife --> Programm abbrechen :)
        int i = 0;
        while (true) {
            System.out.println(i * i);
            Thread.sleep(1000);
            i++;
        }
    }
}
