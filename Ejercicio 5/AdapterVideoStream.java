package ejercicio5;

public class AdapterVideoStream extends Media {

	private VideoStream videoS;

	public String play() {
		return super.play() + this.videoS.reproduce();
	}
}
