import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

              /* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
               * anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
               * informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
               *  pertence ou não a sequência.
               */


            List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0, 1));
            boolean flag = false;

            while (!flag) {
                System.out.println("Enter an int number (type '0' to exit): ");
                int num = sc.nextInt();

                if (num == 0){
                    flag = true;
                }
                else if (num == fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2)) {
                    System.out.println("This number is the next number of fibonacci sequency");
                    fibonacci.add(num);
                } else {
                    System.out.println("This number do not belongs to fibonacci sequency, try again later.");
                }
            }

            //Escreva um programa que inverta os caracteres de um string.

            String string = "reverse string";

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = string.length() - 1; i >= 0; i--) {
                stringBuilder.append(string.charAt(i));
            }
            System.out.println(stringBuilder.toString());


    }
}