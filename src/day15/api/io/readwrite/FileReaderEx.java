package day15.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderEx {
	
	public static void main(String[] args) {
		/*
		 * 문자 기반으로 읽어들이는 클래스 FileReader 클래스 입니다.
		 * 2바이트 단위여서 문자 읽기에 적합합니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello2.txt";
		
		Reader rd = null;
		
		try {
			rd=new FileReader(path);
			//한글자씩 읽기
//			while(true) {
//			int word=rd.read();
//			if(word == -1) {
//				break;
//			}
//		
//			System.out.print((char)word);
//			}
			
			//char 배열로 읽기
			char[]arr = new char[100];
			int length =rd.read(arr);//길이 반환
			System.out.println(Arrays.toString(arr));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rd.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
