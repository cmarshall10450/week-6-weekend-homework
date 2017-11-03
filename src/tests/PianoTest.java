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
    piano = new Piano(Colour.BLUE, InstrumentType.PERCUSSION, 64);
  }

  @Test
  public void pianoHasSIxtyFourKeys() {
    assertEquals(64, piano.getNumKeys());
  }

}
