package _06_Static;

class KelasBiasa {
    String nama = "";

    public KelasBiasa(String nama) {
         this.nama = nama;
    }
}

class KelasStatis {
    public static String nama = "Ryve";

//    method dengan tipe statis hanya bisa diakses tanpa this.
    public static void helloworld() {
        System.out.println("Hello World");
    }
}

public class Main {
    public static void main(String[] args) {
        KelasBiasa kb = new KelasBiasa("Arif Kurniawan"); // harus menggunakan constructor
        System.out.println(kb.nama);

        System.out.println("============================");

//        sedangkan untuk kelas statis kita hanya bisa langsung mengakses
//        dan tidak ada constructor serta tidak bisa membuat objek baru
//        jadi harus nama class dan langsung isi di dalam kelas
        KelasStatis.helloworld();
        System.out.println(KelasStatis.nama);

//        bisa melakukan set kepada nama
        KelasStatis.nama = "Arif";
        System.out.println(KelasStatis.nama);
    }
}
