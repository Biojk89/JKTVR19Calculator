/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_kot;

import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class NewClass {

  private Boolean play = true;
    
  public void run() {
    System.out.println("Calculator");
    do {
      System.out.print("Enter first number: ");
      Scanner scanner = new Scanner(System.in);
      double number1 = scanner.nextDouble();
      System.out.print("Enter second number: ");
      double number2 = scanner.nextDouble();
      scanner.nextLine();
      System.out.print("Choose operation: (+ - * /): ");
      String znak = scanner.nextLine();
            
      switch (znak) {
        case "+":
          System.out.print("Result: ");
          System.out.println(number1 + number2);
          break;
        case "-":
          System.out.print("Result: ");
          System.out.println(number1 - number2);
          break;
        case "*":
          System.out.print("Result: ");
          System.out.println(number1 * number2);
          break;
        case "/":
          if (number1 == 0 || number2 == 0) {
            System.out.println("На ноль делить нельзя");
          } else {
            System.out.print("Result: ");
            System.out.println(number1 / number2);
          }
          break;
        default:
          System.out.println("Not correct operation");
          break;
      }
      System.out.println("Exit? y / n");
      String action = scanner.nextLine();
      if (action.equals("y")) {
        play = false;
      }
    } while (play);
    System.out.println("Program finished");
  }
}
