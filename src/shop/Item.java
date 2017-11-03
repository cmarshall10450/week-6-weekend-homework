package shop;

import behaviours.Sellable;

public abstract class Item implements Sellable {

  private double buyPrice;
  private double sellPrice;
  private String description;
  private ItemType itemType;

  public Item(double buyPrice, double sellPrice, String description, ItemType type) {
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.description = description;
    this.itemType = type;
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

  public ItemType getItemType() {
    return itemType;
  }

  @Override
  public double calculateMarkup() {
    return sellPrice - buyPrice;
  }

}
