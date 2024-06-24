package Baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon30087 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map < String, String > map = new HashMap<>();
        map.put("Algorithm","204");
        map.put("DataAnalysis","207");
        map.put("ArtificialIntelligence","302");
        map.put("CyberSecurity","B101");
        map.put("Network","303");
        map.put("Startup","501");
        map.put("TestStrategy","105");

        int a = s.nextInt();

        for (int i = 0; i <a ; i++) {
            String b = s.next();
            System.out.println(map.get(b));
        }
    }
}
