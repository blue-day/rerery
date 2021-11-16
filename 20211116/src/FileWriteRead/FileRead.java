package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	// 문자열 단위 읽기
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();	// 라인별로 읽어옴
			if(line == null) break;
			System.out.println(line);
		}
	}

}
