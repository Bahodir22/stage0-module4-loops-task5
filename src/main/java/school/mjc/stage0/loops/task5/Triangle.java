package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int x=1; x<=cathetusLength; x++){
            for (int y=1; y<=cathetusLength; y++){
                if (y==1 || x==cathetusLength || x==y){
                    System.out.print("8");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
