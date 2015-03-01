package rocks.molarialessandro.coordinates

trait Coordinates[TCoordinates <: Coordinates] {
  def convertToHSBA: HSBACoordinates
  def convertToRGBA: RGBACoordinates
}
