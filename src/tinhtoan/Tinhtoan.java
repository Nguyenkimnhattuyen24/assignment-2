
package tinhtoan;

import java.util.Scanner;

public class Tinhtoan {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap so nguyen thu nhat :");
           int a = scanner.nextInt();
           System.out.println("Nhap so nguyen thu hai :");
           int b = scanner.nextInt();
           
           int cong = a +b;
           int tru  = a -b;
           int nhan = a *b;
           int chia = a /b;
           int chialaydu = a%b;
           
           System.out.println("Cong :"+ cong );
           System.out.println("Tru :" +tru );
           System.out.println("Nhan :"+ nhan );
           System.out.println("Chia :" +chia);
           System.out.println("Chia lay du :" +chialaydu );
    }
    
}
