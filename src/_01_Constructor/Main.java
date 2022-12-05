package _01_Constructor;

class Orang {
    String nama;
    int umur;

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

public class Main {
    public static void main(String[] args) {

        Orang player1 = new Orang("Arif Kurniawan", 15);
        System.out.println(player1.nama);
        System.out.println(player1.umur);

        Orang player2 = new Orang("Ryve", 16);
        System.out.println(player2.nama);
        System.out.println(player2.umur);
    }
}
