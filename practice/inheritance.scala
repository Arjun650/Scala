class Element(val name: String){
    def action(): Unit = {
        println(s"$name has an unknown effect"); 
    }
}

class Fire(name: String) extends Element(name){
    override def action(): Unit = {
        println(s"$name burns brightly"); 
    }
}

class Water(name: String) extends Element(name){
    override def action(): Unit = {
        println(s"$name flows smoothly"); 
    }
}

object main{
    def main(args: Array[String]): Unit ={
        val fire = new Fire("Flame"); 
        val water = new Water("Water"); 

        fire.action(); 
        water.action(); 
    }
}