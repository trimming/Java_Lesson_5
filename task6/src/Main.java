import java.util.*;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Huawei", "MateBook_D16", 1.85, 8, 512, 15.6);
        Laptop laptop2 = new Laptop("MSI", "GF76_Katana", 2.6, 16, 1000, 17.6);
        Laptop laptop3 = new Laptop("Samsung", "Book3", 1.46, 32, 512, 13.6);
        Laptop laptop4 = new Laptop("Asus", "TUF_DASH", 2, 16, 512, 14.4);
        Laptop laptop5 = new Laptop("Apple", "MacBook", 1.51, 8, 256, 15.3);
        ArrayList<Laptop> laptopsList = new ArrayList<>();
        laptopsList.add(laptop1);
        laptopsList.add(laptop2);
        laptopsList.add(laptop3);
        laptopsList.add(laptop4);
        laptopsList.add(laptop5);
        for (var o: laptopsList) {
            System.out.println(o);
        }
        var paramsMap = createdLaptopsParamsMap();
        choicesParam(paramsMap, laptopsList);
//        System.out.println(filterSet);
    }
    public static HashMap<Integer, String> createdLaptopsParamsMap() {
        HashMap<Integer, String> pm = new HashMap<>();
        pm.put(1, "weight");
        pm.put(2, "RAM");
        pm.put(3, "SSD");
        pm.put(4, "diagonal");
        return pm;
    }
    public static void choicesParam(HashMap<Integer, String> map, ArrayList<Laptop> arrayList){
        System.out.println("Введите цифру соответствующую критерию поиска: ");
        for (var o: map.entrySet()) {
            System.out.printf("%d - %s\n", o.getKey(), o.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        int numParam = scanner.nextInt();
        for (var o: map.entrySet()) {
            if(o.getKey() == numParam){
                filteredSetLaptops(map.get(numParam), arrayList);
            }
        }
        scanner.close();
    }
    public static void filteredSetLaptops(String param, ArrayList<Laptop> arrayList){
        System.out.println("Введите минимальное значение для поиска по критерию '" + param + "':");
        Scanner scannerValue = new Scanner(System.in);
        double minValue = scannerValue.nextDouble();
        switch (param){
            case("weight"):
                arrayList.sort(Comparator.comparing(Laptop -> Laptop.getWeight()));
                for (var o: arrayList) {
                    if(o.getWeight() >= minValue){
                        System.out.println(o);
                    }
                }
                break;
            case("RAM"):
               arrayList.sort(Comparator.comparing(Laptop -> Laptop.getRAM()));
                for (var o: arrayList) {
                    if(o.getRAM() >= minValue){
                        System.out.println(o);
                    }
                }
                break;
            case("SSD"):
                arrayList.sort(Comparator.comparing(Laptop -> Laptop.getSSD()));
                for (var o: arrayList) {
                    if(o.getSSD() >= minValue){
                        System.out.println(o);
                    }
                }
                break;
            case("diagonal"):
                arrayList.sort(Comparator.comparing(Laptop ->Laptop.getDiagonal()));
                for(var o: arrayList){
                    if(o.getDiagonal() >= minValue){
                        System.out.println(o);
                    }
                }
                break;
            default:
                break;
        }
        scannerValue.close();
    }
}