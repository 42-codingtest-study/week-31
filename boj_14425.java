import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class boj_14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (list.contains(input))
                cnt++;
        }
        System.out.println(cnt);
    }
}
