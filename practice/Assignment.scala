object Assignment{
    def main(args: Array[String]): Unit = {
        var a = 10; 
        a += 10; 
        println("a += 10 " + a); 
        a -= 10; 
        println("a -= 10 " + a);
        a *= 10;  
        println("a *= 10 " + a);
        a /= 10;  
        println("a /= 10 " + a); 

       val name = scala.io.StdIn.readLine("Enter your name: ")
        println(s"Hello, $name!")

    }
}