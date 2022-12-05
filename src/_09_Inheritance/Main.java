package _09_Inheritance;

class OrangBiasa extends Orang {
    public OrangBiasa(String nama, int umur) {
        this.nama = nama;
        this.umur = String.valueOf(umur);
        this.nik = this.generateId();
    }

    public void display() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Umur = " + this.umur);
        System.out.println("NIK = " + this.nik);
        System.out.println("Gelar = Orang Biasa");
    }
}

class OrangGoblok extends Orang {
    public OrangGoblok(String nama, int umur) {
        this.nama = nama;
        this.umur = String.valueOf(umur);
        this.nik = this.generateId();
    }

    public void display() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Umur = " + this.umur);
        System.out.println("NIK = " + this.nik);
        System.out.println("Gelar = Orang Goblok");
    }
}

public class Main {
    public static void main(String[] args) {
        Orang orang = new Orang("Arif", 15);
        orang.display();
        System.out.println("=============================");

        Orang oranggoblok = new OrangGoblok("Ryve", 16);
        oranggoblok.display();
        System.out.println("=============================");

        Orang orangbiasa = new OrangBiasa("Arif", 15);
        orangbiasa.display();
        System.out.println("=============================");
    }
}
