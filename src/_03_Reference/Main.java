package _03_Reference;

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
}

public class Main {
    public static void main(String[] args) {

        Orang player1 = new Orang("Arif Kurniawan", 15);
        Orang player2 = player1;
        Orang player3 = new Orang("Ryvexc", 16);

        player1.tampilkan();
        player2.tampilkan();
        player3.tampilkan();
        System.out.println("==============================");
        System.out.println("Alamat Orang 1: " + player1.hashCode());
        System.out.println("Alamat Orang 2: " + player2.hashCode());
        System.out.println("Alamat Orang 3: " + player3.hashCode());
        System.out.println("==============================");

//        Mencoba mengganti player 2
        player2.nama = "Ryve";
//        player 1 akan terdampak
        player1.tampilkan();
//        sedangkan player 3 tidak terdampak
        player3.tampilkan();
    }
}
