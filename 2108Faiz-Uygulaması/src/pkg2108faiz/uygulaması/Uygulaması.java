
package pkg2108faiz.uygulaması;

import java.util.Scanner;


public class Uygulaması {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz. Faiz Oranımız %6'dır...");
        
        int anapara;
        int vade;
        
        System.out.println("Yatırmak İstediğiniz Tutar : ");
        anapara=scanner.nextInt();
        System.out.println("Paranızı Kaç Yıl Vadeli Hesaba Yatırmak İstiyorsunuz ?");
        vade =scanner.nextInt();
        
        double toplampara = anapara;
        
        double faizorani = 0.06;
        
        for (int i = 1 ; i<= vade ; i++){
            
            toplampara= (toplampara * faizorani)+toplampara;
            
            System.out.println( i +  ".Yılın Sonunda Toplam Para : " + (int) toplampara);
            
            
        }
        
    }
    
}
