
package mayıntarlası;
import java.util.*;
public class MayınTarlası {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int puan =0;
        
        System.out.println("Mayın Tarlası Oyunu:");
        System.out.print("Lütfen satır uzunluğu giriniz:");
        int row = input.nextInt();
        
        while(row<=1){
            System.out.println("Lütfen 1'den büyük bir sayı giriniz.");
        }
        
        System.out.print("Lütfen sütun uzunluğunu giriniz:");
        int column = input.nextInt();
        
        while(column<=1){
            System.out.println("Lütfen 1'den büyük bir sayı giriniz.");
        }
       
        int mayinSayisi =0; 
        int zero = 0; 
        
        while(true) {
        System.out.println("Lütfen %20 ile %80 arasında bir zorluk seviyesi giriniz:");
        int zorluk = input.nextInt();
        
        
        if(zorluk==20){
            mayinSayisi = (row*column)/4;
            zero = (row*column) - mayinSayisi;
            break;
        }
        else if(zorluk>20 && zorluk<80){
            mayinSayisi = 2*(row*column)/4;
            zero =2*(row*column)/4 - mayinSayisi;
            break;
        }
        else if(zorluk==80){
            mayinSayisi = 3*(row*column)/4;
             zero = 3*(row*column)/4 - mayinSayisi;
            break;
        }
        else if (zorluk>80) {
            System.out.println("Lütfen geçerli bir değer girin.");
            
        }
        
        }
        
        String[][] YıldızDizi = new String[row][column];
        int[][] RandomDizi = new int[row][column];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                YıldızDizi[i][j] = "* ";
            }
        }
        
    
        if(mayinSayisi ==0){
            mayinSayisi =1;
        } 
        
        for(int i=0; i<mayinSayisi ; i++){
            while(true){
                int randomSatir = random.nextInt(row);
                int randomSütun = random.nextInt(column);
          
            }
        }
        
        while(zero != 0){ 
            for (int i=0; i<row; i++)
            {
                for(int j=0; j<column ;j++){
                    System.out.print(YıldızDizi[i][j]);
                }
                System.out.println();
            }
            System.out.println("Lütfen oynamak istediğiniz satır değerini seçiniz:");
            int satirOyun = input.nextInt();
            System.out.println("Lütfen oynamak istediğiniz sütun değerini giriniz:");
            int sütunOyun = input.nextInt();
            
            while(YıldızDizi[satirOyun][sütunOyun] == "0 ")
            {
                
                    System.out.println("Lütfen daha önce girmediğiniz bir konumu  giriniz.");
                    System.out.println("Lütfen oynamak istediğiniz satır değerini seçiniz:");
                    satirOyun = input.nextInt();
                    System.out.println("Lütfen oynamak istediğiniz sütun değerini giriniz:");
                    sütunOyun = input.nextInt();
                
            } 
            
            if(RandomDizi[satirOyun][sütunOyun] ==1)
            {
                System.out.println("MAYINA BASTINIZ. OYUN BİTTİ.");
                YıldızDizi[satirOyun][sütunOyun] ="1 ";
                break;
            }
            else 
            {
                YıldızDizi[satirOyun][sütunOyun] ="0 ";
                zero--; 
                puan += 5;
            }
            
        }
        System.out.println();
        System.out.println("Toplam puan:" + puan );
        
           for (int i=0; i<row; i++){
                for(int j=0; j<column ;j++){
                    System.out.print(RandomDizi[i][j] + " ");
                }
                System.out.println();
            }

    
    }
    
 
   
}
    

