package rocks.molarialessandro.coordinates

import rocks.molarialessandro.coordinates.converters.HSBAToRGBAConverter

case class HSBACoordinates(h: Int, s: Int, b: Int, a: Int) extends Coordinates {

  private val converterToRGBA: HSBAToRGBAConverter = new HSBAToRGBAConverter

  override def convertToHSBA: HSBACoordinates = this
  override def convertToRGBA: RGBACoordinates = converterToRGBA.convert(this)
}
