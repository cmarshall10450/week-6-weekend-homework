package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.ItemType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar(Colour.BLUE, InstrumentType.STRING, 6, WoodType.MAPLE, 50, 100, "Guitar");
  }

  @Test
  public void guitarHasSixStrings() {
    assertEquals(6, guitar.getNumStrings());
  }

  @Test
  public void guitarIsMadeOFMaple() {
    assertEquals(WoodType.MAPLE, guitar.getWoodType());
  }

  @Test
  public void guitarIsBlue() {
    assertEquals(Colour.BLUE, guitar.getColour());
  }

  @Test
  public void guitarIsStringInstrument() {
    assertEquals(InstrumentType.STRING, guitar.getIntrumentType());
  }

  @Test
  public void guitarIsOfItemTypeInstrument() {
    assertEquals(ItemType.INSTRUMENT, guitar.getItemType());
  }

  @Test
  public void guitarCanBePlayed() {
    assertEquals("Thwang", guitar.play());
  }

  @Test
  public void guitarIsBoughtFor50() {
    assertEquals(50, guitar.getBuyPrice(), 0.01);
  }

  @Test
  public void guitarIsSoldFor100() {
    assertEquals(100, guitar.getSellPrice(), 0.01);
  }

  @Test
  public void guitarHasDescription() {
    assertEquals("Guitar", guitar.getDescription());
  }

  @Test
  public void canGetMarkupOfGuitar() {
    assertEquals(50, guitar.calculateMarkup(), 0.01);
  }

}
