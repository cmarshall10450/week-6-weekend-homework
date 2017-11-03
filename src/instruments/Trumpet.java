package instruments;

public class Trumpet extends Instrument {

  int numValves;

  public Trumpet(Colour colour, InstrumentType type, int numValves, double buyPrice, double sellPrice) {
    super(colour, type, buyPrice, sellPrice);
    this.numValves = numValves;
  }

  public int getNumValves() {
    return numValves;
  }

  @Override
  public String play() {
    return "Brrrrp";
  }
}
