// public class App {
//     public static void main(String[] args) {
//         int[] array;
//         array = new int[5];

//         // int[] array = new int[5]; //mempermudah
//         int[] array = { 0, 1, 2, 3, 4, 5 };
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i]);
//         }
//     }
// }


// public class App {
    //     public static void main(String[] args) {
        //         // deklarasi Array
        //         String[] namaHero = new String[2];
//         namaHero[0] = "alucard";
//         namaHero[1] = "miya";
//         namaHero[2] = "saber"; // ga bisa karena outofBounds

//         List<String> namaHero = new ArrayList<>();
//         namaHero.add("alucard");
//         namaHero.add("miya");
//         namaHero.add("saber");
//         namaHero.add("chou");
//         namaHero.remove("alucard");

//         for (int i = 0; i < namaHero.size(); i++) {
    //             System.out.println(namaHero.get(i));
    //         }
    //     }
    // }
    
    // import java.util.ArrayList;
    // import java.util.List;

    // public class App {
        //     public static void main(String[] args) {
            //         List<String> namaHero = new ArrayList<>();
//         namaHero.add("alucard");
//         namaHero.add("miya");
//         namaHero.add("saber");
//         namaHero.add("chou");
//         namaHero.remove("alucard");

//         for (String hero : namaHero) {
//             System.out.println(hero);
//         }
//     }
// }

// import java.util.HashSet;
// import java.util.Set;

// public class App {
//     public static void main(String[] args) {
//         Set<String> namaHero = new HashSet<>();
//         namaHero.add("alucard");
//         namaHero.add("miya");
//         namaHero.add("saber");
//         namaHero.add("chou");
//         namaHero.add("chou");
//         namaHero.remove("alucard");
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> namaHero = new HashMap<>();
        namaHero.put("alucard", 1000);
        namaHero.put("miya", 500);
        namaHero.put("saber", 500);

        // System.out.println(namaHero.get("alucard"));

        for  (String nama : namaHero.keySet()) {
            System.out.println(nama);
        }
        for  (Integer health : namaHero.values()) {
            System.out.println(health);
        }
        for (Map.Entry<String, Integer> data : namaHero.entrySet()) {
            System.out.println("Hero: " + data.getKey() + ", Health: " + data.getValue());
        }
    }
}