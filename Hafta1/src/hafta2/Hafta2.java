package hafta2;

public class Hafta2 {
    
    public static void main(String[] args){
        
        System.out.println("-------- \\t Örnekleri --------\n");    
        
        System.out.println("Adı:\tAhmet");
        System.out.println("Soyadı:\tCan");
        System.out.println("Doğum:\t2007");
        System.out.println("Yaş:\t18");
        
        
        System.out.println("\n------- Değişken tanımlamaları --------\n");
        
        int sayi1 = 5;   // değişken tanımlarken değer atadık
        
        int sayi2;
        sayi2 = 10;      // önce değişkeni tanımladık, sonra değer atadık
        
        int sayi3 = 20; 
        System.out.println("İlk değeri: " + sayi3);
        sayi3 = 30;
        System.out.println("Güncel değeri: " + sayi3);
        
        double fiyat = 7.5; 
        
        int sayi4 = 100, sayi5, sayi6 = 90;  // Aynı türde değişkenleri toplu tanımladık
        sayi5 = 80;
        
        final double pi = 3.1415;  // Değeri değişmesin istediğimizde final ile tanımlıyoruz
       
        
        System.out.println("\n---------- Farklı değişken türleri -------\n");
        
        long sayi7 = 6912349595600840089L; // değerin sonunda L var
        short gun = 120;
        byte yas = 111;  
        double piDegeri = 3.1415;
        float eDegeri = 2.17343f;     // değerin sonunda f var
        boolean ehliyetVarMi = true;  
        char harf = 'k';
        String isim = "Ahmet";
        System.out.println(isim);
        
        
        System.out.println("\n--------- char ve int türleri ------\n");
        
        char karakter = 65;
        System.out.println(karakter);
        int sayi8 = 'B';
        System.out.println(sayi8);
        
        
        System.out.println("\n--------- Tür dönüşümü (type casting) ------\n");
        
        byte sayi9 = 110;
        int yeniSayi1 = sayi9;  // gizli tür dönüşümü (implicit casting)
        
        int sayi10 = 110;
        byte yeniSayi2 = (byte)sayi10;  // açık tür dönüşümü (explicit casting)
        
        int fiyat2 = 10;
        double virgulluFiyat = fiyat2;   // int değişkeni double'a cast ediyoruz
        
        double kilo = 7.5;
        int tamKilo = (int)kilo;     // double değişkeni int'e cast ediyoruz
        System.out.println("Double'ı int'e dönüştürdük: "+ tamKilo);
        
        
        System.out.println("\n------- Operatörler ------\n");
        
        
        int sayi11 = 5;
        int sayi12 = 7;
        
        int toplam = sayi11 + sayi12;
        int fark = sayi11 - sayi12;
        int carpim = sayi11*sayi12;
        double bolum = (double)sayi11/sayi12; // int/int sonucu her zaman int çıkar
        int mod = sayi12%sayi11;
        
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        System.out.println("Bölüm: " + bolum);
        System.out.println("Mod: " + mod);
        
        
        int sayi = 5;
        sayi = sayi + 1;
        System.out.println("\nSayının yeni değeri: " + sayi);
        
        
        System.out.println("\n-------- Örnek Soru ----- \n");
       
        // Yükseklik ve taban uzunluğu değerleriyle 
        // bir üçgenin alanını hesaplayan Java
        // kodunu yazınız.
        
        int taban = 3;
        int yukseklik = 5;
        double alan = (taban*yukseklik)/2.0; // veya ((double)taban*yukseklik)/2;
        System.out.println("Üçgenin alanı: " + alan);
        
    }
}
