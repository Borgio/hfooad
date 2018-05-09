package chapter04.dogDoors.Sam;

public class Bark {

  private String sound;

  public Bark(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  public boolean equals(Object bark) {
    if (bark instanceof chapter04.dogDoors.Sam.Bark) {
      chapter04.dogDoors.Sam.Bark otherBark = (chapter04.dogDoors.Sam.Bark)bark;
      if (this.sound.equalsIgnoreCase(otherBark.sound)) {
        return true;
      }
    }
    return false;
  }
}
