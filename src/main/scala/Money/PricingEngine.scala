package Money

object PricingEngine {
  type Duration = Int
  type PricePerMinute = Money
  type DurationInMinutes = Duration
  type CalculatePrice = (PricePerMinute, DurationInMinutes) => Money

  def pricingEngine: CalculatePrice = (PricePerMinute, DurationInMinutes) => {
    PricePerMinute.multiplyAndRound(DurationInMinutes)
  }

  def durationInMinutes(duration: Int): Duration = duration
}
