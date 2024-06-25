package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BfReaderEx {
	
	public static void main(String[] args) {
		
		//빠른입력
//		System.out.print("입력하세요>");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//System.in : 상대방에게 받는다.
//		String str = br.readLine(); //한 줄 받기
//		System.out.println(str);
		
		BufferedReader br = null;
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";
		try {
			
			br=new BufferedReader(new FileReader(path));
			
			//한줄씩 읽기
			String str;
			while((str=br.readLine())!=null){ //읽을게 없으면 null
				System.out.println(str);
				
			}
			 
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
