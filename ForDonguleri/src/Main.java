
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * for (baslatma ; kosul ; artırma veya azaltma işlemleri) {
         * Döngü koşulumuz doğru olduğu sürece burası çalışacak.
         * 
         * }
         * 
         */
//        int i = 3;
//        int j = 10;
        // for (i = 20; i <= 500; i++){
        // System.out.println("i = "+i);
        // }

        // for(int i = 0; i<=5; i++){
        // System.out.println("i = "+i);
        // }
        // for(int i = 200; i>=5; i--){
        // System.out.println("i = "+i);
        // // }
        // for (; i < 5; i++) {
        //     System.out.println("Java Denemeler");
        // }
//        for (;i <= 10 || j >= 0; i++, j--){
//            System.out.println("i=" + i);
//            System.out.println("j=" + j);
//        }
//        for (;i <= 10 && j >= 0; i++, j--){
//            System.out.println("i=" + i);
//            System.out.println("j=" + j);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz: ");
        BigInteger faktoriyel = BigInteger.valueOf(1);
        double sayi = scanner.nextDouble();
        
        for (int i = 1; i <= sayi; i++) {
        	faktoriyel = faktoriyel.multiply(BigInteger.valueOf(i));
        	System.out.println("Faktoriyel = " + faktoriyel + " i = " +i);
        	
        	
        	
        }
        System.out.println("Faktoriyel = " + (faktoriyel));
    }
}