package instruments;

public class Guitar extends Instrument {

  private int numStrings;
  private WoodType woodType;

  public Guitar(
    Colour colour,
    InstrumentType type,
    int numStrings,
    WoodType woodType,
    double buyPrice,
    double sellPrice,
    String description
  ) {
    super(colour, type, buyPrice, sellPrice, description);
    this.numStrings = numStrings;
    this.woodType = woodType;
  }

  public int getNumStrings() {
    return numStrings;
  }

  public WoodType getWoodType() {
    return woodType;
  }

  @Override
  public String play() {
    return "Thwang";
  }
}
