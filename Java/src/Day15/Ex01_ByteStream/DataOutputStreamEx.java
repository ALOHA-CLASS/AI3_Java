package Day15.Ex01_ByteStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
	
	public static void main(String[] args) {
		// 파일 경로
		String filePath = "sample.dat";
		
		try (
			// FileOutputStream 객체를 이용하여, Byte 단위로 데이터 출력
			FileOutputStream fos = new FileOutputStream(filePath);
			// BufferedOutputStream 객체를 사용하여, 데이터 출력 성능 향상
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			// DataOutputStream 객체로 기본 데이터 타입을 출력
			DataOutputStream dos = new DataOutputStream(bos);
		) {
			dos.writeInt(3000);
			dos.writeDouble(12.45);
			dos.writeBoolean(false);
			System.out.println("sample.dat 파일을 출력하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
