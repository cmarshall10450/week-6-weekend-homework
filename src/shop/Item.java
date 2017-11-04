package shop;

import behaviours.Sellable;

public abstract class Item implements Sellable {

  private double buyPrice;
  private double sellPrice;
  private String description;
  private ItemType itemType;
  private int stockCount;
  private int numSold;

  public Item(double buyPrice, double sellPrice, String description, ItemType type, int stockCount) {
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.description = description;
    this.itemType = type;
    this.stockCount = stockCount;
    this.numSold = 0;
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

  public int getStockCount() {
    return stockCount;
  }

  public int getNumSold() {
    return numSold;
  }

  public void increaseStockCount(int amount) {
    this.stockCount += amount;
  }

  public void reduceStockCount(int amount) {
    this.stockCount -= amount;
  }

  public void increaseNumSold() {
    this.numSold++;
  }

  @Override
  public double calculateMarkup() {
    return sellPrice - buyPrice;
  }

}
