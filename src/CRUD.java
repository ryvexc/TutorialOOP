import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
    private static ArrayList<String> data = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            showMenu();
            responInput();
            System.out.println();
        }
    }

    public static void responInput() {
        System.out.print("Masukkan input: ");
        int input = Integer.parseInt(scanner.nextLine());
        if(input == 1) tambah();
        else if(input == 2) readData();
        else if(input == 3) updateData();
        else if(input == 4) hapusData();
        else if(input == 5) System.exit(0);
        else System.out.println("Input Salah!");
    }

    public static void showMenu() {
        String[] menu = new String[]{"Tambah", "Read", "Update", "Hapus", "Exit"};
        for (int i = 0; i < menu.length; i++)
            System.out.println(i + 1 +". "+ menu[i]);
    }

    public static void readData() {
        System.out.println(data);
    }

    public static void tambah() {
        System.out.print("Masukkan Buah: ");
        data.add(scanner.nextLine());
        System.out.println("Data telah ditambahkan!");
    }

    public static void hapusData() {
        System.out.print("Masukkan Index: ");
        int index = Integer.parseInt(scanner.nextLine());
        data.remove(index);
        System.out.println("Data telah dihapus!");
    }

    public static void updateData() {
        System.out.print("Masukkkan index: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Masukkan buah baru: ");
        String buah_baru = scanner.nextLine();
        data.remove(index);
        data.add(index, buah_baru);
        System.out.println("Data telah diubah!");
    }
}
