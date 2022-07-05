package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ageOfMan;
        int temperature;
        generateRandomAgeTemperature( ageOfMan = 1, temperature= 1);
    generateRandomAgeTemperature( ageOfMan = 1, temperature = 1);
    generateRandomAgeTemperature( ageOfMan = 1, temperature = 1);
    generateRandomAgeTemperature( ageOfMan = 1, temperature = 1);
    generateRandomAgeTemperature( ageOfMan = 1, temperature = 1);
    }

    public static int generateRandomAgeOne(){
     int ageOfMan = (int) (Math.random()* 70);
        System.out.println("random age equal" + ageOfMan);
        return ageOfMan;
    }
    public static int generateRandomAgeTemperature (int ageOfMan, int temperature){
        Scanner enterAgeOfMan, enterTemperature,  enterNumber;
        enterNumber = new Scanner(System.in);
        System.out.println("Type number 1 , if you want to put age and temperature by yourself. type number2 , if you want it to be random");
         int number = enterNumber.nextInt();
         switch (number) {

             case 1 :
                 enterAgeOfMan = new Scanner(System.in);
                 System.out.println("type age of man:");
                 ageOfMan = enterAgeOfMan.nextInt();
                 enterTemperature = new Scanner(System.in);
                 System.out.println("type temperature on a street:" );
                 temperature = enterTemperature.nextInt();
                 break;
             case 2 :
                 ageOfMan = generateRandomAgeOne();
                 enterTemperature = new Scanner(System.in);
                 System.out.println("type temperature on a street:");
                 temperature = enterTemperature.nextInt();
                 System.out.println("random age equal = " + ageOfMan + ". temperature equal = "+ temperature + ".");
                 break;
             default:
                 System.out.println(" you typed wrong. TRY AGAIN.");
                 int resultRandomAgeTemperature = generateRandomAgeTemperature( ageOfMan = 1, temperature = 1);
                 break;



         }
         if (ageOfMan > 20 && ageOfMan < 45 && temperature > -20 && temperature < 30) System.out.println("you could go for a walk");
         else if (ageOfMan < 20 && temperature > 0 && temperature < 28) System.out.println("you could go for a walk");
         else if (ageOfMan > 45 && temperature > -10 && temperature < 25) System.out.println("you could go for a walk");
         else System.out.println(" STAY AT HOME");
         return ageOfMan + temperature;}

}
