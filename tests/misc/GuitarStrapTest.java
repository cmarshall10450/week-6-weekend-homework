package misc;

import org.junit.Before;
import org.junit.Test;
import shop.ItemType;

import static org.junit.Assert.assertEquals;

public class GuitarStrapTest {

  GuitarStrap guitarStrap;

  @Before
  public void before() {
    guitarStrap = new GuitarStrap(100, 20, 30, "Guitar Strap", 10);
  }

  @Test
  public void guitarStrapHasLengthOf100() {
    assertEquals(100, guitarStrap.getLength());
  }

  @Test
  public void guitarStrapIsOfItemTypeAccessory() {
    assertEquals(ItemType.ACCESSORY, guitarStrap.getItemType());
  }

}
