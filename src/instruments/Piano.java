package instruments;

public class Piano extends Instrument {

  private int numKeys;

  public Piano(
    Colour colour,
    InstrumentType type,
    int numKeys,
    double buyPrice,
    double sellPrice,
    String description,
    int stockCount
  ) {
    super(colour, type, buyPrice, sellPrice, description, stockCount);
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
