package _04_AccessModifier_BedaPackage;

import _04_AccessModifier.Orang;

public class Main {
    public static void main(String[] args) {
        Orang orang1 = new Orang("Arif Kurniawan", 15);
        System.out.println("Public");
        orang1.tampilkan_public();

//        tidak ada orang1.tampilkan_protected() / tampilkan_protected tidak tersedia
//        orang1.tampilkan_protected();
    }
}
