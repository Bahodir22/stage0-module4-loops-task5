package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int x=1; x<=height; x++){
            for (int y=1; y<=height; y++){
                if (y==1 || y==height || x==y || x+y==height+1){
                    System.out.print("8");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
