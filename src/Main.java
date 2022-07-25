import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD,VND;
        int change;
        System.out.println("chuyển từ đơn vị nào?");
        change = scanner.nextInt();
        if (change == 1 ){
            System.out.println("nhập số tiền cần chuyển đổi (VND): ");
            VND = scanner.nextInt();
            System.out.println("số tiền cần chuyển đổi là: "+VND/23000+"USD");
        } if (change == 2){
            System.out.println("nhập số tiền chuyển đổi (USD): ");
            USD = scanner.nextInt();
            System.out.println("số tiền cần chuyển đổi là: "+USD*23000+"VND");
        } else {
            System.out.println("méo có");
        }
    }
}
