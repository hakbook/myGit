package cafetest.test0110;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) throws IOException {
		String str = null;
		
		BufferedReader reader3 = new BufferedReader(new FileReader("C:\\test\\rand2.txt"));
		   String str1;
	        while ((str1 = reader3.readLine()) != null) {
	            System.out.println(str1);
	        }
		try {
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand2.txt", "rw");
			file.seek(10);
			file.write("park\"".getBytes());
			while (file.getFilePointer() < file.length()) {
				str = file.readLine();
				str = new String(str.getBytes("8859_1"),"utf-8");
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
		
		BufferedReader reader4 = new BufferedReader(new FileReader("C:\\test\\rand2.txt"));
		String str2;
		while ((str2 = reader4.readLine()) != null) {
			System.out.println(str2);
		}
	}
}
