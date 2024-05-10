package ejercicio5;

public class AdapterVideoStream extends Media {

	private VideoStream videoS;

	public void play() {
		this.videoS.reproduce();
	}
}
