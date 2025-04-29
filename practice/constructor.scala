class subject(name: String, id: Int){

    def display() : Unit = {
        println(s"Name: $name"); 
        println(s"Id: id"); 
    }
}

object consturctor{
    def main(args: Array[String]) : Unit = {
        val a = new subject("Arjun", 22186); 
        a.display(); 

        new subject("Arjun2" , 22193).display(); 
    }
}