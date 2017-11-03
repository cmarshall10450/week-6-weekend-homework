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

  public ArrayList<Sellable> getStock() {
    return stock;
  }

  public int getStockCount() {
    return stock.size();
  }

}
