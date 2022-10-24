package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int x=1; x<=sideLength; x++){
            for (int y=1; y<=sideLength; y++){
                if (x==(sideLength+1)/2 || y==(sideLength+1)/2){
                    System.out.print("8");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
