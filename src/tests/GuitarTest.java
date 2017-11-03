package tests;

import instruments.Colour;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.WoodType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar(Colour.BLUE, InstrumentType.STRING, 6, WoodType.MAPLE);
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
    assertEquals(InstrumentType.STRING, guitar.getType());
  }

}
