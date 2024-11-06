package w6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> nicks = new HashMap<>();
        nicks.put("matti", "mage");
        nicks.put("mikael", "mixu");
        nicks.put("arto", "arppa");

        System.out.println(nicks.get("mikael"));
    }
}
