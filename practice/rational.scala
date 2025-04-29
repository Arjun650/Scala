class Rational(n: Int, d: Int){
    require(d != 0); 
    val numer : Int = n 
    val denom : Int = d

    override def toString = numer +  "/" +  denom

    def add(that: Rational) : Rational = new Rational(
        numer * that.denom + that.numer * denom , denom * that.denom
    )
}

object main{
    def main(args: Array[String]): Unit = {
        var a = new Rational(1, 2); 
        var b = new Rational(3, 3); 
        println(a)
        println(a.add(b)); 
    }
}