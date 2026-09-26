import java.util.Scanner;

public class prb38 {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Please enter the string: ");

        String str = ip.nextLine();

        int i = 0;
        int j = str.length() - 1;
        boolean removed = false;
        boolean flag = true;

        while (i < j) {

            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            }
            else {
                if (removed) {
                    flag = false;
                    break;
                }

                str = str.substring(0, i) + str.substring(i + 1);

                removed = true;

                i = 0;
                j = str.length() - 1;
            }
        }

        System.out.print(flag);

        ip.close();
    }
}