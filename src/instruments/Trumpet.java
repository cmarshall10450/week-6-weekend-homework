package instruments;

/**
 * Created by chris on 03/11/2017.
 */
public class Trumpet extends Instrument {

  int numValves;

  public Trumpet(Colour colour, InstrumentType type, int numValves) {
    super(colour, type);
    this.numValves = numValves;
  }

  public int getNumValves() {
    return numValves;
  }
}
