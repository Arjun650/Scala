class Subject{
    var id : Int = 10; 
    var sub : String = "abcde"; 

    def display() : Unit = {
        println("Id: " +id); 
        println("Subject: "+sub); 
    }
}

object firstClass{
    def main(args: Array[String]) : Unit = {
        var a = new Subject(); 
        // println(a.id); 
        // println(a.sub); 
        a.display(); 
    }
}