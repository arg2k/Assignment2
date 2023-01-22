import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float length, breadth;
        Scanner sc = new Scanner(System.in);
        length  = sc.nextFloat();
        breadth = sc.nextFloat();
        System.out.println("Area is "+(length*breadth));
	   sc.close();
    }
}