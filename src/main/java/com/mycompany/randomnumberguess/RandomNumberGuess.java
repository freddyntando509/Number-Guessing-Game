/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberguess;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class RandomNumberGuess {

    public static void main(String[] args) {
        Random obj = new Random();  //instance of a random class
        
        int secretNumber = obj.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0; //to track attempts
        int maxAttempts = 3;
        
        while (userGuess != secretNumber){
            userGuess = Integer.parseInt(
                    JOptionPane.showInputDialog("hey! Guess a between"+ "1 and 100"));
            
            if (userGuess > secretNumber){
                JOptionPane.showMessageDialog(null, "Your guess is too high!");
            }else if (userGuess < secretNumber){
                JOptionPane.showMessageDialog(null, "Your guess is too low!");
            }else{
               JOptionPane.showMessageDialog(null,"Congrats!" "You win! in" + attempts); 
            }
        }
            
        }         
}
