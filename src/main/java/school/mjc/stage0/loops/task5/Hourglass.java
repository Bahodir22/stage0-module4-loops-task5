package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int x,y,z;
        for (x = 1; x <= height; x++) {
            for (z = 1; z < x; z++)
                System.out.print(" ");
            for (y = x; y <= height; y++)
                System.out.print("8");

            System.out.println();

        }
        for (x = height - 1; x >= 1; x--) {
            for ( z = 1; z < x; z++)
                System.out.print(" ");
            for ( y = x; y <= height; y++)
                System.out.print("8");

            System.out.println();

        }
    }
}
