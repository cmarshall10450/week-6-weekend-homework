package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.ItemType;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 03/11/2017.
 */
public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano(Colour.BLACK, InstrumentType.PERCUSSION, 64, 1000, 5000, "Piano");
  }

  @Test
  public void pianoHasSIxtyFourKeys() {
    assertEquals(64, piano.getNumKeys());
  }

  @Test
  public void pianoIsBlack() {
    assertEquals(Colour.BLACK, piano.getColour());
  }

  @Test
  public void pianoIsPercussionInstrument() {
    assertEquals(InstrumentType.PERCUSSION, piano.getIntrumentType());
  }

  @Test
  public void pianoIsOfItemTypeInstrument() {
    assertEquals(ItemType.INSTRUMENT, piano.getItemType());
  }

  @Test
  public void pianoCanBePlayed() {
    assertEquals("Plink plonk", piano.play());
  }

  @Test
  public void pianoIsBoughtFor1000() {
    assertEquals(1000, piano.getBuyPrice(), 0.01);
  }

  @Test
  public void pianoIsSoldFor5000() {
    assertEquals(5000, piano.getSellPrice(), 0.01);
  }

  @Test
  public void pianoHasDescription() {
    assertEquals("Piano", piano.getDescription());
  }

  @Test
  public void canGetMarkupOfPiano() {
    assertEquals(4000, piano.calculateMarkup(), 0.01);
  }

}
