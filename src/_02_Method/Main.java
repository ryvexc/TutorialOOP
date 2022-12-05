package _02_Method;

class Orang {
    String nama;
    int umur;

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }

    public void tampilkanUmur() {
        System.out.println("Umur: " + this.umur);
    }

    public void tampilkanNama() {
        System.out.println("Nama: " + this.nama);
    }
}

public class Main {
    public static void main(String[] args) {

        Orang player1 = new Orang("Arif Kurniawan", 15);
        player1.tampilkan();
        player1.tampilkanNama();

        System.out.println("===========================");

        Orang player2 = new Orang("Ryve", 16);
        player2.tampilkan();
        player2.tampilkanUmur();

    }
}
