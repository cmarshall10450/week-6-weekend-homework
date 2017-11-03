package misc;

import org.junit.Before;
import org.junit.Test;
import shop.ItemType;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 03/11/2017.
 */
public class SheetMusicTest {

  SheetMusic sheetMusic;

  @Before
  public void before() {
    sheetMusic = new SheetMusic(100, 10, 15, "Sheet Music");
  }

  @Test
  public void sheetMusicIsOfItemTypeMisc() {
    assertEquals(ItemType.MISC, sheetMusic.getItemType());
  }

  @Test
  public void sheetMusicHas100Pages() {
    assertEquals(100, sheetMusic.getNumPages());
  }

}