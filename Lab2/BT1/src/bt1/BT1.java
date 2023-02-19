package bt1;

import java.util.Scanner;

public class BT1 {

    public static void main(String[] arg) {
        {
            float a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap a=");
            System.out.println("nhap b=");
            a = sc.nextFloat();
            b = sc.nextFloat();
            if (a == 0) {
                if (b == 0) {
                    System.out.println("phuong trinh vo so nghiem");
                } else {
                    System.out.println(" phuong trinh vo nghiem ");
                }
            } else {
                float x = (float) -b / a;
                System.out.println("phuoeng trinh co nghiem la: " + x);
            }
        }
    }
}
