package FileWriteRead;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	// 문자열을 byte타입으로 저장
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("out.txt");
		output.write("1 번째입니다.\n".getBytes());
		output.write("2 번째입니다.\n".getBytes());
		for(int i = 1; i <= 10; i++) {
			String data = i+ "번째입니다.\n";
			output.write(data.getBytes());
		}
		output.close();

	}

}
