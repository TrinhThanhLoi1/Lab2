package bt4;

import java.util.Scanner;

public class BT4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chon chuc nang : [1- 4]");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Giai PTB1");
                    break;
                case 2:
                    System.out.println("Giai PTB2");
                    break;
                case 3:
                    System.out.println("Tinh Tien Dien");
                    break;
                default:
                    System.out.println("Ket Thuc");
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
