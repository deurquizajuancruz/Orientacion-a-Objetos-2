package ejercicio5;

public class VideoFile extends Media {

	public String play() {
		return super.play() + "Audio";
	}
}
