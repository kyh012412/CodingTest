
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	static int n;
	static int arr[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i:arr) {
			sb.append(i).append("\n");
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
}