package misc;

import shop.Item;
import shop.ItemType;

public class GuitarStrap extends Item {

  private int length;

  public GuitarStrap(int length, double buyPrice, double sellPrice, String description) {
    super(buyPrice, sellPrice, description, ItemType.ACCESSORY);
    this.length = length;
  }

  public int getLength() {
    return length;
  }
}
