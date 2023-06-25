import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        public class boj_2754 {

            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = br.readLine();
                double grade = 0;

                if (str.charAt(0) == 'A')
                    grade = 4;
                else if (str.charAt(0) == 'B')
                    grade = 3;
                else if (str.charAt(0) == 'C')
                    grade = 2;
                else if (str.charAt(0) == 'D')
                    grade = 1;
                else if (str.charAt(0) == 'F') {
                    System.out.println("0.0");
                    return ;
                }

                if (str.charAt(1) == '+')
                    grade += 0.3;
                else if (str.charAt(1) == '-')
                    grade -= 0.3;

                System.out.println(grade);
            }
    }

