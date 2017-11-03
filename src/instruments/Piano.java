package instruments;

public class Piano extends Instrument {

  int numKeys;

  public Piano(Colour colour, InstrumentType type, int numKeys, double buyPrice, double sellPrice) {
    super(colour, type, buyPrice, sellPrice);
    this.numKeys = numKeys;
  }

  public int getNumKeys() {
    return numKeys;
  }

  @Override
  public String play() {
    return "Plink plonk";
  }
}
