package rocks.molarialessandro.coordinates.converters

import rocks.molarialessandro.coordinates.Coordinates

trait Converter[TInputCoordinates <: Coordinates,
                TOutputCoordinates <: Coordinates] {
  def convert(coordinates: TInputCoordinates) : TOutputCoordinates
}
