
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public class Main  {
    public static void main(String [] args){
        System.out.println("Bienvenido a la calculadora POST-FIX");
        int option = 0;
        int option1 = 0;
        Scanner keyboard = new Scanner(System.in);
        while (option == 0){
            System.out.println("Por favor ingrese la opcion de Stack deseada:");
            System.out.println("1. Vector");
            System.out.println("2. ArrayList");
            System.out.println("3. Listas Enlazadas");
            try{
                option = Integer.parseInt(keyboard.nextLine());
		} catch (NumberFormatException e){
                    System.out.println();
		    System.out.println("Error: opcion fuera de rango");
		    System.out.println();
                    option = 0;
		}
            if (option != 1 || option != 2 || option != 3)
                option = 0;
        }
        
        if (option == 1){
            //STACK VECTOR
        }
        if (option == 2){
            //STACK ARRAY
        }
        while (option == 3){
            System.out.println("Por favor ingrese la opcion de Lista Enlazada deseada:");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Double Linked List");
            System.out.println("3. Circular Linked List");
            try{
                option1 = Integer.parseInt(keyboard.nextLine());
		} catch (NumberFormatException e){
                    System.out.println();
		    System.out.println("Error: opcion fuera de rango");
		    System.out.println();
                    option = 3;
		}
            option = 4;
            if (option1 != 1 || option1 != 2 || option1 != 3)
                option = 3;
        }
        if (option == 4){
            //StackList miPila = new StackList(option1);
        }
        if (option == 5){
            System.out.println();
            System.out.println("Gracias por usar la calculadora POST-FIX");
        }
    }
}
