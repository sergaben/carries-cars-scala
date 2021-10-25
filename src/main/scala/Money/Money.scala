package Money

object Currency extends Enumeration {
  type Currency = Value

  val Euro = Value("EUR")
  val UnitedStatesDollar = Value("USD")
}


object Money {
  def EUR(amountInCents: Int): Money = {
    Money(amountInCents, Currency.Euro)
  }

  def USD(amountInCents: Int): Money = {
    Money(amountInCents, Currency.UnitedStatesDollar)
  }
}

case class Money(amountInCents: Int, currency: Currency.Value) {
  def equalTo(other: Money): Boolean = {
    other.amountInCents == this.amountInCents && other.currency == this.currency
  }

  def multiplyAndRound(by: Int): Money = {
    Money((this.amountInCents * by).round, this.currency)
  }
}

