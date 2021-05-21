import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total = 1, xFact=1, yFact=1, zFact=1;
        System.out.print("Hangi sayının: ");
        int x = in.nextInt();

        System.out.print("Kaçlı kombinasyonu: ");
        int y = in.nextInt();
        int z = x-y;
        for (int i = 1; i <= x; i++) {
            xFact *= i;
        }
        for (int i =1; i<=y; i++){
            yFact*=i;
        }
        for (int i =1; i<=z; i++){
            zFact*=i;
        }
        System.out.println(xFact/(yFact*zFact));
    }
}
