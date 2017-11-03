package tests;

import instruments.*;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

  Shop shop;

  @Before
  public void before() {
    shop = new Shop();
  }

  @Test
  public void canAddItemsToShop() {
    Guitar guitar = new Guitar(Colour.BLUE, InstrumentType.STRING, 6, WoodType.MAPLE, 50, 100, "Guitar");
    shop.addItemToStock(guitar);

    assertEquals(1, shop.getStockCount());
  }

  @Test
  public void canRemoveItemFromShop() {
    Guitar guitar = new Guitar(Colour.BLUE, InstrumentType.STRING, 6, WoodType.MAPLE, 50, 100, "Guitar");
    shop.addItemToStock(guitar);
    assertEquals(1, shop.getStockCount());

    shop.removeItem(guitar);
    assertEquals(0, shop.getStockCount());
  }

  @Test
  public void canGetTotalPotentialProfit() {
    Guitar guitar = new Guitar(Colour.BLUE, InstrumentType.STRING, 6, WoodType.MAPLE, 50, 100, "Guitar");
    Trumpet trumpet = new Trumpet(Colour.YELLOW, InstrumentType.BRASS, 5, 100, 200, "Trumpet");
    Piano piano = new Piano(Colour.BLACK, InstrumentType.PERCUSSION, 64, 1000, 5000, "Piano");

    shop.addItemsToStock(guitar, trumpet, piano);

    assertEquals(4150, shop.getTotalPotentialProfit(), 0.01);
  }

}
