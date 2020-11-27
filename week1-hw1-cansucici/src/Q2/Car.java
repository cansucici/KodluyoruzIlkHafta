package Q2;

public class Car {

    public String plaka;
    public int hız;
    public String model;
    public String renk;

    public Car() {

    }

    public Car(String plaka) {
        this.plaka = plaka;
    }

    public Car(String plaka, String renk) {
        this.plaka = plaka;
        this.renk = renk;
    }

    public Car(int hız, String model, String renk) {
        this.hız = hız;
        this.model = model;
        this.renk = renk;
    }

    public Car(String plaka, int hız, String model, String renk) {
        this.plaka = plaka;
        this.hız = hız;
        this.model = model;
        this.renk = renk;
    }
}
