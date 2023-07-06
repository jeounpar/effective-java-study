package item06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Item06Main {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		System.out.println(sum);
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime);
		System.out.println("시간차이(ms) : " + secDiffTime);
	}

	static String firstLineOfFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}

	static String firstLineOfFile2(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}
}
