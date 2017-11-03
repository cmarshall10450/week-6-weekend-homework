package tests;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

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
  public void pianoIsPercussionIntrument() {
    assertEquals(InstrumentType.PERCUSSION, piano.getType());
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

}
