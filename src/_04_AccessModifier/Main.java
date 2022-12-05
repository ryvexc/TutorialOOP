package _04_AccessModifier;

public class Main {
    public static void main(String[] args) {

        Orang orang1 = new Orang("Arif Kurniawan", 15);
        System.out.println("Public");
        orang1.tampilkan_public();
        System.out.println("===================================");
        System.out.println("Protected");
        orang1.tampilkan_protected();

//        tidak ada orang1.tampilkan_private() / tampilkan_private tidak tersedia
//        orang1.tampilkan_private();
    }
}
