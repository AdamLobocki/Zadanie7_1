import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];
        int i = 0;
        System.out.println("Podaj 5 imion:");

        while (i<5){
            name[i] = scanner.nextLine();
            i++;
        }
        i = 4;
        while (i>=0){
            System.out.println("Cześć " + name[i]);
            i--;
        }

    }
}
