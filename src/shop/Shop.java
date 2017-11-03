package shop;

import behaviours.Sellable;

import java.util.ArrayList;

public class Shop {

  private ArrayList<Sellable> stock;

  public Shop() {
    this.stock = new ArrayList<>();
  }

  public void addItemToStock(Sellable item) {
    stock.add(item);
  }

  public void addItemsToStock(Sellable... items) {
    for (Sellable item : items) {
      addItemToStock(item);
    }
  }

  public void removeItem(Sellable item) {
    stock.remove(item);
  }

  public ArrayList<Sellable> getStock() {
    return stock;
  }

  public int getStockCount() {
    return stock.size();
  }

  public double getTotalPotentialProfit() {
    double potentialProfit = 0;
    for (Sellable item : stock) {
      potentialProfit += item.calculateMarkup();
    }

    return potentialProfit;
  }

}
