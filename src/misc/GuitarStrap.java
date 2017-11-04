package misc;

import shop.Item;
import shop.ItemType;

public class GuitarStrap extends Item {

  private int length;

  public GuitarStrap(int length, double buyPrice, double sellPrice, String description, int stockCount) {
    super(buyPrice, sellPrice, description, ItemType.ACCESSORY, stockCount);
    this.length = length;
  }

  public int getLength() {
    return length;
  }
}
