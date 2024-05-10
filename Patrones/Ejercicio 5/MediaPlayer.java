package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> media;

	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}

	public void play() {
		this.media.forEach(m -> m.play());
	}

	public void addMedia(Media m) {
		this.media.add(m);
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}
}
