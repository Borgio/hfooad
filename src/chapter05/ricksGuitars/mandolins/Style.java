package chapter05.ricksGuitars.mandolins;

public enum Style {

  A, F;

  public String toString() {
    switch(this) {
      case A:   return "A style";
      case F:   return "F style";
      default:  return "Unspecified";
    }
  }
}
