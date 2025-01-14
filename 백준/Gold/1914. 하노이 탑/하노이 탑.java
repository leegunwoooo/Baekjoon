import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N = 0;

    public static void main(String[] args) throws Exception {

        N = Integer.parseInt(br.readLine());

        System.out.println(BigInteger.TWO.pow(N).subtract(BigInteger.ONE));

        if (N <= 20) {
            hanoi(N, 1, 2, 3);
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void hanoi(int n, int from, int tmp, int to) throws IOException{

        if (n == 1) {
            bw.write(from + " " + to + "\n"); 
            return;
        }

        hanoi(n - 1, from, to, tmp);
        bw.write(from + " " + to + "\n");

        hanoi(n-1, tmp, from, to);
    }
}