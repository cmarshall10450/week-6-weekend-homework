package tests;

import instruments.Colour;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.WoodType;
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

}
