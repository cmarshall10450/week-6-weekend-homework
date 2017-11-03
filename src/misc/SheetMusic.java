package misc;

import shop.Item;
import shop.ItemType;

public class SheetMusic extends Item {

  private int numPages;

  public SheetMusic(int numPages, double buyPrice, double sellPrice, String description) {
    super(buyPrice, sellPrice, description, ItemType.MISC);
    this.numPages = numPages;
  }
}
