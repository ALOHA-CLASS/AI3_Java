package Day07.Ex02_다중상속;

public interface RemoteControl {
	
	int MAX_VOLUME = 300;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	default void setMute(boolean mute) {
		if( mute ) {
			System.out.println("음소거 설정되었습니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolume(10);
		}
	}
	static void changeBattery() {
		System.out.println("배터리 교체");
	}
}
