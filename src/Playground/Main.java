package Playground;

class Orang {
    String nama;

    public Orang() {}

    public void setNama(String nama) {
        this.nama = nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Orang orang = new Orang();
        System.out.println(orang.nama);

        orang.setNama("Arif");
        System.out.println(orang.nama);
    }

}
