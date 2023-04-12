package openway;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Input Parameter : ");
        int input = sc.nextInt();  

        CalculationLogic calcLogic = new CalculationLogic(input, 1);
        System.out.println("The result of value calculation is : "+calcLogic.Calculating());
    }

}
