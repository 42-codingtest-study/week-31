import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class boj_11656 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList list = new ArrayList(str.length());

        for (int i = 0; i < str.length(); i++) {
            list.add(new String(str.substring(i)));
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
