import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Huawei", "MateBook_D16", 1.85, 16, 512, 15.6);
        Laptop laptop2 = new Laptop("MSI", "GF76_Katana", 2.6, 16, 1000, 17.6);
        Laptop laptop3 = new Laptop("Samsung", "Book3", 1.46, 16, 512, 13.6);
        Laptop laptop4 = new Laptop("Asus", "TUF_DASH", 2, 16, 512, 14.4);
        Laptop laptop5 = new Laptop("Apple", "MacBook", 1.51, 16, 256, 15.3);
        HashSet<Laptop> laptopsSet = new HashSet<>();
        laptopsSet.add(laptop1);
        laptopsSet.add(laptop2);
        laptopsSet.add(laptop3);
        laptopsSet.add(laptop4);
        laptopsSet.add(laptop5);
        System.out.println(laptopsSet);
    }
    public static void filteredLaptopsSet() {

    }
}