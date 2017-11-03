package instruments;

import behaviours.Sellable;

/**
 * Created by chris on 03/11/2017.
 */
public abstract class Item implements Sellable {

  double buyPrice;
  double sellPrice;
  String description;

  public Item(double buyPrice, double sellPrice, String description) {
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.description = description;
  }

  public double getBuyPrice() {
    return buyPrice;
  }

  public double getSellPrice() {
    return sellPrice;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public double calculateMarkup() {
    return sellPrice - buyPrice;
  }

}
