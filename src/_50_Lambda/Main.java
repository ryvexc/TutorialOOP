package _50_Lambda;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> halo = nama -> {
            System.out.println("Halo " + nama + "!");
        };
        halo.accept("Daud");
    }
}
