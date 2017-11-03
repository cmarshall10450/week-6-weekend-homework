package instruments;

/**
 * Created by chris on 03/11/2017.
 */
public class Guitar extends Instrument {

  int numStrings;
  WoodType woodType;

  public Guitar(Colour colour, InstrumentType type, int numStrings, WoodType woodType) {
    super(colour, type);
    this.numStrings = numStrings;
    this.woodType = woodType;
  }

  public int getNumStrings() {
    return numStrings;
  }

  public WoodType getWoodType() {
    return woodType;
  }
}
