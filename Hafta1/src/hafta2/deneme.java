
package hafta2;

public class deneme {
      
public static void main(String[] args) {
    
    
 
    
    // SORU 2) Üç tamsayının toplamını bulan ve konsola yazdıran JAVA programını yazınız.

    int tamSayi1 = 8;
    int tamSayi2 = 19;
    int tamSayi3 = -25;
    
    // System.out.println'i sadece çıktı vermek için kullanalım, işlemi öncesinde yapalım
    System.out.println("Cevap = " + (tamSayi1 + tamSayi2 + tamSayi3));
    


    // SORU 8) Faturanın KDV’li toplam tutarı ve faturanın KDV tutarı bilgilerini kullanarak,
    // KDV oranının yüzde kaç olduğunu hesaplayan ve konsola yazdıran JAVA programını yazınız.
    // Örneğin; KDV’li toplam tutar = 150, KDV tutarı = 30 için, KDV oranı %25 bulunmaldır.

    int toplam = 150;
    int KDV = 30;
    double KDVorani = ((double)toplam - KDV)/KDV;  // HESAPTA HATA VAR
    
    System.out.println("KDV oranı: %" + KDVorani);
   
    
    

    // SORU 18) Bir ürünün kilogram fiyatı ve satın alınan gramaj bilgilerine göre toplam
    // maliyetini hesaplayıp konsola yazdıran JAVA programını yazınız.

    int kgFiyat = 139;      // Kilogram fiyatı
    double gramaj = 4.6;    // Gramaj miktarı
    double toplam2 = kgFiyat*gramaj;    // Hesap hatalı
    
    System.out.println("Toplam: " + toplam2 );
    
 
    // SORU 24) İki basamaklı bir sayının rakamlarını terse çeviren JAVA programını yazınız.
    // Örneğin; sayı = 15 için program sonunda sayı = 51 olmalıdır.
    
    int sayi = 85;
    int ceviri1 = sayi/10;
    int ceviri2 = sayi%10;
    int ters = (ceviri2*10) + ceviri1;

    System.out.println("Yeni Sayınız: " + ters); // Örnekte sayının değeri değişiyor
 
  
    /*  
    SORU 29) Şu anki toplam nüfus ve yıllık nüfus artış yüzdesi bilgilerine göre 3 yıllık nüfus
    projeksiyonu yapan programı yazınız.
    Örneğin; şu anki toplam nüfus 80000000 ve yıllık nüfus artışı %5 ise;
    - Gelecek yıl nüfus 84000000, bir sonraki yıl 88200000, bir sonraki yıl 92610000 olmalıdır
    */
    
    long nufus1 = 80000000L;
    long nufus2 = nufus1 + (nufus1*5/100L);  // Nüfus artış oranı da değişken olmalı
     System.out.println("1 Yıl Sonraki Nüfus: " + nufus2);
    long nufus3 = nufus2 + (nufus2*5/100L);
     System.out.println("2 Yıl Sonraki Nüfus: " + nufus3);
    long nufus4 = nufus3 + (nufus3*5/100L);
    System.out.println("3 Yıl Sonraki Nüfus: " + nufus4);
 
    
    }
}
