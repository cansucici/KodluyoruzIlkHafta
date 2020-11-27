package Q2;

/*  2- Bir araba nesnesi oluşturup bu arabaya ait özellikleri
 kurucu methodlar sayesinde tanımlayabildiğimiz bir sınıf yazınız.
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("10CC100", "red");
        Car car3 = new Car(100, "Audi/A4", "white");
        Car car4 = new Car("34ZC34", 240, "Volkwagen/Golf", "gri");
    }
}
