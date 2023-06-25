import java.io.*;

public class boj_10820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        char target;

        while ((input = br.readLine()) != null) {
            int[] res = new int[4];
            for (int i = 0; i < input.length(); i++) {
                target = input.charAt(i);
                if ('a' <= target && target <= 'z')
                    res[0]++;
                else if ('A' <= target && target <= 'Z')
                    res[1]++;
                else if ('0' <= target && target <= '9')
                    res[2]++;
                else if (target == ' ')
                    res[3]++;

            }
            sb.append(res[0]).append(" ").append(res[1]).append(" ").append(res[2]).append(" ").append(res[3]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
