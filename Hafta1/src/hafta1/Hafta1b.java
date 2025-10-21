
package hafta1;

public class Hafta1b {

    public static void main(String [] args){
        
        // comment: yorum satırı
        
        /* 
            block comment: birden fazla satırı yorum satırı yapmak için
        */
        
        // çift tırnaklar arasındaki \n satır atlatır (new line)
        System.out.print("Merhaba \ndünya\n");
        System.out.print("\nBugün hava güzel\n");
        
        // degişken : variable
        int yaricap = 15;  // integer (tamsayı)
        double pi = 3.1415; // double (ondalıklı sayı)
        
        System.out.println("Yaricapi " + yaricap + " olan dairenin: ");
        System.out.println("Alani: " + pi*yaricap*yaricap);
        System.out.println("Cevresi: " + 2*pi*yaricap);
               
    } 
}
