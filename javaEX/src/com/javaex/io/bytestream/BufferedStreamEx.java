package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_buffered_copy.jpg";

	public static void main(String[] args) {
		// main stream
		InputStream is = null;
		OutputStream os = null;
		
		//	보조 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			
			//	버퍼를 생성
			byte[] data = new byte[1024];	//	1KB
			int size = 0;	//	버퍼는 데이터의 길이
			
			System.out.println("복사 시작");
			while((size = bis.read(data)) != -1) {
				System.out.println(size + "바이트 복사했습니다.");
				bos.write(data);
			}
			System.out.println("복사 완료");
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				bos.close();
			}catch(Exception e) {
				
			}
		}

	}

}
