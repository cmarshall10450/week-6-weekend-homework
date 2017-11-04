package shop;

import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

  Shop shop;
  Guitar guitar;
  Trumpet trumpet;
  Piano piano;

  @Before
  public void before() {
    shop = new Shop();
    guitar = new Guitar(Colour.BLUE, InstrumentType.STRING, 6, WoodType.MAPLE, 50, 100, "Guitar", 10);
    trumpet = new Trumpet(Colour.YELLOW, InstrumentType.BRASS, 5, 100, 200, "Trumpet", 10);
    piano = new Piano(Colour.BLACK, InstrumentType.PERCUSSION, 64, 1000, 5000, "Piano", 10);
  }

  @Test
  public void canAddItemsToShop() {
    shop.addItemToStock(guitar);
    assertEquals(1, shop.getStockCount());
  }

  @Test
  public void canRemoveItemFromShop() {
    shop.addItemToStock(guitar);
    assertEquals(1, shop.getStockCount());

    shop.removeItem(guitar);
    assertEquals(0, shop.getStockCount());
  }

  @Test
  public void canGetTotalPotentialProfit() {
    shop.addItemsToStock(guitar, trumpet, piano);

    assertEquals(4150, shop.getTotalPotentialProfit(), 0.01);
  }

}
