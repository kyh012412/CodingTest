import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        bw.write(a[n-1]-a[0]+"");

        br.close();
        bw.close();
    }
}