package misc;

import shop.Item;
import shop.ItemType;

public class SheetMusic extends Item {

  private int numPages;

  public SheetMusic(int numPages, double buyPrice, double sellPrice, String description, int stockCount) {
    super(buyPrice, sellPrice, description, ItemType.MISC, stockCount);
    this.numPages = numPages;
  }

  public int getNumPages() {
    return numPages;
  }
}
