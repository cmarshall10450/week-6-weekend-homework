package instruments;

import behaviours.Playable;

public abstract class Instrument extends Item implements Playable{

  Colour colour;
  InstrumentType type;

  public Instrument(Colour colour, InstrumentType type, double buyPrice, double sellPrice) {
    super(buyPrice, sellPrice);
    this.colour = colour;
    this.type = type;
  }

  public Colour getColour() {
    return colour;
  }

  public InstrumentType getType() {
    return type;
  }
}
