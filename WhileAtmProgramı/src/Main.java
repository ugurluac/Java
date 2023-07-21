import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.
        
        İşlemler 
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q
        
        */
    	
    	Scanner scanner = new Scanner (System.in);
    	int bakiye = 1000;
    	String islemler = "1. Islem : Bakiye Öğrenme\n"
    						+"2. Islem : Para Cekme\n"
    						+"3. Islem : Para Yatirma \n"
    						+"Cikis Icin q'a basin";
    	
    	System.out.println("**************");
    	System.out.println(islemler);
    	System.out.println("**************");
    	
    	while(true) {
    		System.out.println("Islem Seciniz: ");
    		String islem = scanner.nextLine();
    		if (islem.equals("q")){
    			
    			System.out.println("Programdan Cikiliyor.....");
    			break;
    			
    		}
    		
    		else if(islem.equals("1")){
    			System.out.println(bakiye);
    			
    			
    		}
    		else if(islem.equals("2")){
    			System.out.println("Cekmek istediginiz tutar : ");
    			int tutar = scanner.nextInt();
    			scanner.nextLine();
    			
    			while(bakiye - tutar < 0 ) {
    				
    				System.out.println("Yeterli Bakiye Yok. Bakiyeniz : " + (bakiye) +"\nTekrar deneyiniz...");
    				System.out.println("Cekmek istediginiz tutar : ");
        			tutar = scanner.nextInt();
        			scanner.nextLine();
    				
    			}
    			
    			
    			if (bakiye - tutar >0 ){
    				bakiye -= tutar;
    				System.out.println("Kalan bakiyeniz : " + bakiye);
    			}
    			
    			
    		}
    		else if(islem.equals("3")){
    			System.out.println("Yatirmak istediginiz tutar : ");
    			int tutar = scanner.nextInt();
    			scanner.nextLine();
    			bakiye += tutar;
    			System.out.println("Yeni Bakiyeniz" + bakiye);
    			
	
    		}
    		else {
    			System.out.println("Gecersiz Islem...");
    		}
    		
    		}
    	
    	
    }
}
