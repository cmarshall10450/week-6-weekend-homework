package instruments;

/**
 * Created by chris on 03/11/2017.
 */
public class Guitar {

  int numStrings;
  WoodType woodType;

  public Guitar(int numStrings, WoodType woodType) {
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
