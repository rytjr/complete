package cut;

import java.io.*;
import java.util.*;

public class cut {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[num1];
		
		String d = bf.readLine();
		StringTokenizer ss = new StringTokenizer(d);
		
		
		for(int i = 0; i < num1; i++) {
			arr[i] = Integer.parseInt(ss.nextToken());
		}
		
		for(int i =0; i < num1; i++) {
			for(int j = 0; j < num1; j++) {
				if(arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		bw.write(String.valueOf(arr[num1 - num2]));
		bw.flush();
		bw.close();
		
	}

}