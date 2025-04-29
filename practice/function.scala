class func{
    def add(a: Int, b: Int) : Int = {
        return a + b; 
    }
}

object main{
    def main(args: Array[String]): Unit = {
        var a = func(); 
        var b = a.add(2, 3); 
        println(b); 
    }
}