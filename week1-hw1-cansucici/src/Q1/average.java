package Q1;
 /*1- 0 ile 2000 arasında 3,5,7 ve 53’e bölünebilen sayıların
 ağırlıklı ortalamasını bulan bir uygulama yazınız.
*/

public class average {

    public static void main(String[] args) {
        int total = 0;
        int z = 0;
        for (int i = 0; i <= 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) && (i % 53 == 0)) {
                total = total + i;
                z++;
            }
        }
        int ort = total / z;
        System.out.println("0 ile 2000 arasında 3,5,7 ve 53’e bölünebilen sayıların ağırlıklı ortalaması :" + " " + ort);
    }
}

