package rocks.molarialessandro

import rocks.molarialessandro.coordinates.Coordinates

class Color(coordinates: Coordinates) {

  def asHSBA = coordinates.convertToHSBA
  def asRGBA = coordinates.convertToRGBA

}
