import java.util.Scanner;

/**
 *
 * @author RodolfoC
 */
public class Factory {

    public Factory() {
    }
    
    public AbstractStack fabStack(){
        
        Scanner scan = new Scanner(System.in);
	int choice = 0;
        System.out.println("Ingrese 1 para vector, y 2 para Array: \n");
        choice = scan.nextInt();    
        Object pila;
        pila = new Object();

        switch(choice){
            case 1:
                System.out.println("Vector");
                StackVector obj = new StackVector();
                pila = obj;
                break;
            case 2:
                System.out.println("Array");
                StackArray obja = new StackArray();
                pila = obja;
                break;        
        }
            return (AbstractStack) pila;
    }

}
