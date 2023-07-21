
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
    
        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Armstrong Sayisi bulmak icin bir sayi giriniz...");
    	int sayi = scanner.nextInt();
    	System.out.println("Basamak Sayisi");
    	int basamaksayisi = scanner.nextInt();
    	
    	int gecici_sayi = sayi;
    	int toplam = 0;
    	
    	do {
    		int basamak_degeri = gecici_sayi %10;
    		gecici_sayi /= 10;
    		
    		toplam +=Math.pow(basamak_degeri,basamaksayisi);
    	}
       while (gecici_sayi > 0);
    	if (sayi == toplam)
    		
    		System.out.println("Bu sayi bir armstrong sayisidir....");
    	else {
    		System.out.println("Bu sayi bir armstrong sayisi degildir.");
    	}
    	
    	
    	
        
        
    }
}
