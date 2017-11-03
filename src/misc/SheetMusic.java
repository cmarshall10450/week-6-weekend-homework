package misc;

import instruments.Item;

public class SheetMusic extends Item {

  int numPages;

  public SheetMusic(int numPages, double buyPrice, double sellPrice, String description) {
    super(buyPrice, sellPrice, description);
    this.numPages = numPages;
  }
}
