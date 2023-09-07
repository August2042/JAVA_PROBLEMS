package oopsJava;

// Define the Playable interface with two abstract methods: play and stop
interface Playable {
	void play();

	void stop();
}

// Implement the Playable interface with the AudioPlayer class
class AudioPlayer implements Playable {
	public void play() {
		System.out.println("Audio is playing ....");
	}

	public void stop() {
		System.out.println("Audio is stopping ....");
	}
}

// Implement the Playable interface with the VideoPlayer class
class VideoPlayer implements Playable {
	public void play() {
		System.out.println("Video is playing ....");
	}

	public void stop() {
		System.out.println("Video is stopping ....");
	}
}

// Main class to demonstrate interface and class implementations
public class LMS_Q3 {
	public static void main(String[] args) {
		// Create an object of the VideoPlayer class
		VideoPlayer obj1 = new VideoPlayer();
		obj1.play();
		obj1.stop();
		System.out.println(); // Print an empty line for separation
		// Create an object of the AudioPlayer class
		AudioPlayer obj2 = new AudioPlayer();
		obj2.play();
		obj2.stop();
	}
}
