import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] countNum = new char[256];
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            countNum[input.charAt(i)]++;
            sum += (int)(input.charAt(i));
        }
        if (countNum['0'] == 0) {
//            System.out.println("not zero");
            System.out.println("-1");
            return;
        }
        else if (sum % 3 != 0) {
//            System.out.println("not 3");
            System.out.println("-1");
            return;
        }
//        System.out.println("OK");
        for (int i = 9; i >= 0; i--) {
            while (countNum[i + '0'] != 0) {
                sb.append(i);
                countNum[i + '0']--;
            }
        }
        System.out.println(sb);
    }
}
