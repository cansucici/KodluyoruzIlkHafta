package Q4;

import java.util.Scanner;

/*   4- Kullanıcıdan alınan ondalıklı bir sayının ondalık kısmına göre
aşağı ve yukarı doğru yuvarlama işlemi yapacak bir program yazınız.
  - aşağı veya yukarı yuvalarlanacağını kullanıcıdan bir bilgi olarak alınız.

 * */
public class Main {
    public static void main(String[] args) {
        double ondaliklisayi;
        Scanner x = new Scanner(System.in);
        System.out.println("lütfen ondalıklı bir sayı giriniz.Örneğin 5,06 gibi");;

        ondaliklisayi = x.nextDouble();
        System.out.println("Girmiş olduğunuz ondaliklı sayiyi yukarıya yuvarlamak için 1'e , aşağı yuvarlamak için 2'ye basınız");

        Scanner where = new Scanner(System.in);
        int sayi=where.nextInt();
        if(sayi==1) {
            //ceil ile yukarı  yuvarlama
            System.out.println("yukarıya yuvarlanmış hali :"+ Math.ceil(ondaliklisayi));
        }
        else if(sayi==2) {
            //floor ile aşağı yönlü yuvarlama
            System.out.println("aşağıya yuvarlanmış hali :"+ Math.floor(ondaliklisayi));
        }
        else {
            System.out.println("1 veya 2 dışında bir rakama bastınız!");
        }
    }

}
