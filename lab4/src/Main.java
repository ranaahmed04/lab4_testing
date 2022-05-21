import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            CoffeeMachine coffee = new CoffeeMachine();
            coffee.start();
            Scanner scanner = new Scanner(System.in);
            System.out.println(" please choose from the list what you want : ");
            int x = scanner.nextInt();
            while (x!=6){
                coffee.Select(x);
                coffee.start();
                x= scanner.nextInt();
            }
            coffee.Select(x);
        }
    }

