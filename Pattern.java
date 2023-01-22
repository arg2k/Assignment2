public class Pattern {
    public static void main(String[] args) {
        int lines = 3;
        for(int i=0;i<lines;i++){
            for (int j = 0; j < lines; j++) {
                if(j>=i) System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}