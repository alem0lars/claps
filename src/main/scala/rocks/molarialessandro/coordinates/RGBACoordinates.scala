package rocks.molarialessandro.coordinates

import rocks.molarialessandro.coordinates.converters.RGBAToHSBAConverter

case class RGBACoordinates(r: Int, g: Int, b: Int, a: Int) extends Coordinates {

  private val converterToHSBA: RGBAToHSBAConverter = new RGBAToHSBAConverter

  override def convertToHSBA: HSBACoordinates = converterToHSBA.convert(this)
  override def convertToRGBA: RGBACoordinates = this
}
