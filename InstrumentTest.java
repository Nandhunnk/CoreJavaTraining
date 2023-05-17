
public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guitar guitar = new Guitar();
		guitar.tuneStrings();
		guitar.pluck();
		Cello cello =new Cello();
				cello.bow();
		

	}

}

abstract class MusicalInstrument
{
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	void tuneStrings() {
		System.out.println("Tuning the tuning the Guitar");
	}
}

class Guitar extends StringBasedMusicalInstrument
{
	void tuneStrings() {
		System.out.println("Tuning the Guitar");
	}

	void play() {
		System.out.println("Playing the Guitar");
	}

	void pluck() {
		System.out.println("Plucking the Guitar");
	}
}

class Cello extends Guitar
{
	void tuneStrings() {
		System.out.println("Tuning the Cello");
	}

	void play() {
		System.out.println("Playing the Cello");
	}

	void bow() {
		System.out.println("Bowing the Cello");
	}
}
