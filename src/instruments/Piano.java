package instruments;

/**
 * Created by chris on 03/11/2017.
 */
public class Piano extends Instrument {

  int numKeys;

  public Piano(Colour colour, InstrumentType type, int numKeys) {
    super(colour, type);
    this.numKeys = numKeys;
  }

  public int getNumKeys() {
    return numKeys;
  }
}
