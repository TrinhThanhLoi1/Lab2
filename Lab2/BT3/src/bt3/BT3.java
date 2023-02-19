package bt3;

import java.util.Scanner;

public class BT3 {

    public static void main(String[] arg) {
        int sodien, tien;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien : ");
        sodien = sc.nextInt();

        int n;
        n = -1;
        while (n < 0) {

            if (sodien > 0) {

                if (sodien <= 50) {
                    tien = sodien * 1000;
                } else {
                    tien = 50 * 1000 + (sodien - 50) * 1200;
                }
                System.out.println("so tien tra la : " + tien);
                break;
            } else {
                System.out.println("nhap lai so dien");
                break;
            }

        }
    }
}
