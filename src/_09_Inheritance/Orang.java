package _09_Inheritance;

import java.util.Random;

public class Orang {
    String nama, nik, umur;
    public Orang() {}

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = String.valueOf(umur);
        this.nik = this.generateId();
    }

    public void display() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Umur = " + this.umur);
        System.out.println("NIK = " + this.nik);
    }

    public String generateId() {
        String rd_id = "";
        for(int i=0; i<9; i++) {
            rd_id += String.valueOf((char) new Random().nextInt(25) + 65);
        }
        return rd_id;
    }
}
