import java.io.*;

public class boj_1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char flag = str.charAt(0);
        int cnt = 0;

        for (int i = 1; i < str.length(); i++) {
            if (flag != str.charAt(i)) {
                flag = str.charAt(i);
                cnt++;
            }
        }
        if (cnt % 2 != 0)
            cnt++;
        System.out.println(cnt/2);
    }

}
