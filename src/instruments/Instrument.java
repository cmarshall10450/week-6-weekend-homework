package instruments;

/**
 * Created by chris on 03/11/2017.
 */
public class Instrument {

  Colour colour;
  InstrumentType type;

  public Instrument(Colour colour, InstrumentType type) {
    this.colour = colour;
    this.type = type;
  }

  public Colour getColour() {
    return colour;
  }
}
