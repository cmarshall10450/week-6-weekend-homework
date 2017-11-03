package instruments;

import behaviours.Playable;
import shop.Item;
import shop.ItemType;

abstract class Instrument extends Item implements Playable {

  private Colour colour;
  private InstrumentType type;

  Instrument(Colour colour, InstrumentType type, double buyPrice, double sellPrice, String description) {
    super(buyPrice, sellPrice, description, ItemType.INSTRUMENT);
    this.colour = colour;
    this.type = type;
  }

  public Colour getColour() {
    return colour;
  }

  public InstrumentType getIntrumentType() {
    return type;
  }
}
