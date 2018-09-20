/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmethods;

/**
 *
 * @author evrob0095
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double squareRoot = 16;
        int power = 3;
        int sine = 15;
        int myNumberRounded;
        double myNumber=15.4;
        double pi = Math.PI;
        myNumberRounded = (int) Math.round(myNumber);
        System.out.println("15.4 rounded is " + myNumberRounded);
        System.out.println("Square root of 16 = " + Math.sqrt(squareRoot) + "\n3 to the power of 5 is " + Math.pow(power,5) + "\nThe sin of 15 is " + Math.sin(sine));
    }
    
}
