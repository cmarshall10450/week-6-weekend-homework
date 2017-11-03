package instruments;

public class Trumpet extends Instrument {

  private int numValves;

  public Trumpet(
    Colour colour,
    InstrumentType type,
    int numValves,
    double buyPrice,
    double sellPrice,
    String description
  ) {
    super(colour, type, buyPrice, sellPrice, description);
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
