
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int giris_hakki = 3;
    	
    	String sys_kullanici_adi ="Cem U";
    	String sys_parola = "12345";
    	System.out.println("Kullanici Girisi");
    	
    	while(true) {
    		System.out.println("Kullanici Adi");
    		String kullanici = scanner.nextLine();
    		System.out.println("Parola");
    		String parola = scanner.nextLine();
    		
    		
    		
    		if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
    			System.out.println("Hosgeldiniz " + kullanici);
    			break;
    		}
    		else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
    			System.out.println("Parolaniz Yanlis...");
    			giris_hakki -= 1;
    			    			
    		}
    		else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
    			System.out.println("Kullanici Adiniz Yanlis...");
    			giris_hakki -= 1;
    			    			
    		}
    		else {
    			System.out.println("Kullanici Adi ve Parolaniz Yanlis...");
    			giris_hakki -= 1;
    			    			
    		}
    		
    		System.out.println("Kalan Giris Hakki " + giris_hakki);
    		if (giris_hakki == 0) {
    			System.out.println("Giris Hakkiniz Bitti");
    		}
    	}
    	
    	
    }
}
    	
    	
    	
  
