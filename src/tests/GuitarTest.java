package tests;

import instruments.Guitar;
import instruments.WoodType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar(6, WoodType.MAPLE);
  }

  @Test
  public void guitarHasSixStrings() {
    assertEquals(6, guitar.getNumStrings());
  }

}
