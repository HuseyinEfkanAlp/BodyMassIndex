import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double weight,height,bodyIndex;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your weight : ");
        weight = scn.nextDouble();
        System.out.print("Please enter your height : ");
        height = scn.nextDouble();
        bodyIndex = weight/(height*height);
        System.out.println("Your body mass index is "+bodyIndex);
    }
}
