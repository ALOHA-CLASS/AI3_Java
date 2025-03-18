package Day07.Ex02_다중상속;

public interface Microphone {
	
	int inputVolumeMax = 50; 	// 음성인식최대볼륨
	int inputVolumeMin = 0;		// 음성인식최소볼륨
	
	// 음성 인식
	String receiveVoice(String voice);
}
