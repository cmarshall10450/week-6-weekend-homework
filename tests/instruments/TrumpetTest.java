package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.ItemType;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 03/11/2017.
 */
public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet(Colour.YELLOW, InstrumentType.BRASS, 5, 100, 200, "Trumpet");
  }

  @Test
  public void trumpetHasFiveValves() {
    assertEquals(5, trumpet.getNumValves());
  }

  @Test
  public void trumpetIsYellow() {
    assertEquals(Colour.YELLOW, trumpet.getColour());
  }

  @Test
  public void trumpetIsBrassInstrument() {
    assertEquals(InstrumentType.BRASS, trumpet.getIntrumentType());
  }

  @Test
  public void trumpetIsOfItemTypeInstrument() {
    assertEquals(ItemType.INSTRUMENT, trumpet.getItemType());
  }

  @Test
  public void trumpetCanBePlayed() {
    assertEquals("Brrrrp", trumpet.play());
  }

  @Test
  public void trumpetIsBoughtFor100() {
    assertEquals(100, trumpet.getBuyPrice(), 0.01);
  }

  @Test
  public void trumpetHasDescription() {
    assertEquals("Trumpet", trumpet.getDescription());
  }

  @Test
  public void canGetMarkupOfTrumpet() {
    assertEquals(100, trumpet.calculateMarkup(), 0.01);
  }

}
