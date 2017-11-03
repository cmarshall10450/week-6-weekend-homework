package tests;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 03/11/2017.
 */
public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet(Colour.YELLOW, InstrumentType.BRASS, 5, 100, 200);
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
    assertEquals(InstrumentType.BRASS, trumpet.getType());
  }

}
