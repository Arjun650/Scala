class calculateDiscount {
    def discountClaculator(price: Double, percent : Double) : Double = {
        def calDiscount(price: Double, per: Double) : Double = {
           return price - (price * percent/100)
        }
        return calDiscount(price, percent)
    }
}

object Ques2 {
    def main(args: Array[String]): Unit = {
        val o1 = new calculateDiscount()

        var price = 1000
        val percentOff = o1.discountClaculator(price, 10)

        print("Price after discount is Rs." + percentOff)
    }
}