package _05_Encapsulation;

class Orang {
    String nama;

    public Orang() {}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}


public class Main {
    public static void main(String[] args) {

        Orang orang = new Orang();
        System.out.println(orang.getNama()); // kosong

//        kita harus set untuk mengatur nama
        orang.setNama("Arif Kurniawan");
        System.out.println(orang.getNama()); // ada

        String nama_orang = orang.getNama(); // ditampung kedalam variabel
        System.out.println("Nama orang: " + nama_orang);
    }
}
