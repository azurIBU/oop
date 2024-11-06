package w6;

import java.util.Random;

public class NightSky {
    double density;
    int width;
    int height;
    int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this(0.1);
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine () {
        Random rand = new Random();
        for (int i = 0; i < width; i++) {
            if (rand.nextDouble() < 0.5) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                this.starsInLastPrint++;
            }
        }
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }



}
