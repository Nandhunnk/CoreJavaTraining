
public class AirInstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flute flute = new Flute();
		flute.blowAir();
		flute.play();
		Saxophone sax =new Saxophone();
		sax.blow();
		sax.blowAir();
		sax.play();
	}

}


abstract class AirMusicalInstrument
{
	abstract void play();
}

abstract class AirBasedMusicalInstrument extends AirMusicalInstrument
{
	void blowAir() {
		System.out.println("Blowing the air");
	}
}

class Flute extends AirBasedMusicalInstrument
{
	void blowAir() {
		System.out.println("Blowing the Air on Flute");
	}

	void play() {
		System.out.println("Playing the Flute");
	}

}

class Saxophone extends Flute
{
	void blowAir() {
		System.out.println("Test Blowing the Saxophone");
	}

	void play() {
		System.out.println("Playing the Saxophone");
	}

	void blow() {
		System.out.println("Blowing the Air on Saxophone");
	}
}
