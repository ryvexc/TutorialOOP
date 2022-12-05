package _04_AccessModifier;

public class Orang {
    String nama;
    int umur;

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkan_public() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }

    private void tampilkan_private() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }

    protected void tampilkan_protected() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }
}
