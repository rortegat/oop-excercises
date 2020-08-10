import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        char symbol;
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter symbol: ");
        symbol = scanner.next().charAt(0);
        System.out.print("Enter size: ");
        size = scanner.nextInt();

        for (int x=0; x<size; x++){
            System.out.println(String.valueOf(symbol).repeat(x+1));
        }

        for (int i=1; i<size; i += 2){
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }

}
