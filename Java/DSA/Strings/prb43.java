import java.util.HashMap;
import java.util.Scanner;

public class prb43 {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Please enter the string-1: ");
        String str = ip.nextLine();

        System.out.print("Please enter the string-2: ");
        String p = ip.nextLine();

        HashMap<Character, Integer> pattern = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {

            char character = p.charAt(i);

            pattern.put(character,
                    pattern.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i <= str.length() - p.length(); i++) {

            HashMap<Character, Integer> window = new HashMap<>();

            for (int j = 0; j < p.length(); j++) {

                char character = str.charAt(i + j);

                window.put(character,
                        window.getOrDefault(character, 0) + 1);
            }

            if (window.equals(pattern)) {
                System.out.print(i + " ");
            }
        }

        ip.close();
    }
}