class Book (val title : String, val author : String, val price: Double) {
    def details() : Unit = {
        print("Title: " + title + "\nAuthor: " + author + "\nPrice: Rs." + price)
    }
}
class FictionBook(title: String, author: String, price: Double, val genre : String) extends Book(title, author, price) {
    override def details() : Unit = {
        super.details() 
        println("\nGenre: " + genre)
        println("\n")
    }
}

class NonFictionBook(title: String, author: String, price: Double, val subject : String) extends Book(title, author, price) {
    override def details() : Unit = {
        super.details() 
        println("\nSubject: " + subject)
        println("\n")
    }
}

class Library {
    var books : List[Book] = List()

    def addBooks(book : Book) : Unit = {
        books = books :+ book
    }

    def showBooks() : Unit = {
        for (book <- books) {
            book.details()
        }
    } 

    def totalCost() : Double = {
        var total = 0.0
        for(book <- books) {
            total += book.price
        }
        total
    }
}

object  Ques1 {
    def main(args: Array[String]): Unit = {
        val lib = new Library()

        val book1 = new FictionBook("1984", "George Orwell", 300, "Dystopian")
        val book2 = new NonFictionBook("Sapiens", "Yuval Harari", 500, "History")

        lib.addBooks(book1)
        lib.addBooks(book2)

        println("Books in the library: ")
        lib.showBooks()

        val total = lib.totalCost()
        println("The total cost of the books is Rs." + total)
    }
}