class Element(val content: String){
    def above(that: Element) : Element = new Element(
        this.content + "\n" + that.content
    )

    def beside(that: Element) : Element = new Element(
        this.content + " " + that.content
    )

    def show() : Unit = println(content); 
}

object main{
    def main(args : Array[String]): Unit = {
        val a = new Element("dkj")
        a.show(); 
        val b = new Element("pkj"); 
        val c = a.above(b); 
        c.show(); 
        val d = a.beside(b); 
        d.show(); 
    }
}