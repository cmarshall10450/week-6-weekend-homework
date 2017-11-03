package instruments;

import behaviours.Sellable;

/**
 * Created by chris on 03/11/2017.
 */
public abstract class Item implements Sellable {

  double buyPrice;
  double sellPrice;

  public Item(double buyPrice, double sellPrice) {
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public double getBuyPrice() {
    return buyPrice;
  }

  public double getSellPrice() {
    return sellPrice;
  }

  @Override
  public double calculateMarkup() {
    return sellPrice - buyPrice;
  }
}
