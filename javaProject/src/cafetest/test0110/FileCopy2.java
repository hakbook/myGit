package cafetest.test0110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) throws IOException {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				int ch = System.in.read();
				if(ch == 13) break;
				os.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
		
		String file1 = "C:\\test\\abc.txt";
		String file2 = "C:\\test\\abcCopy.txt";
		
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str = reader.readLine();
				if(str == null) break; {
					writer.write(str+"\r\n");
				}
				System.out.println("파일 복사가 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		BufferedReader reader3 = new BufferedReader(new FileReader("C:\\test\\abcCopy.txt"));
		   String str1;
	        while ((str1 = reader3.readLine()) != null) {
	            System.out.println(str1);
	        }
	}
}
