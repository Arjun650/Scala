class Element(val content : String) { 
    def above(that : Element) : Element = 
        new Element(this.content + "\n" + that.content); 

    def show() : Unit = println(content)


}

def elem(text: String) : Element = new Element(text); 

object main{
    def main(args: Array[String]) : Unit = {
        val e1 = elem("hi"); 
        val e2 = elem("world"); 

        val top = e1.above(e2); 

        top.show(); 
    }
}