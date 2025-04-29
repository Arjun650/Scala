class Room (roomNumber: Int, capacity: Int) {
    def features() : Unit = {
        print("Room Number: " + roomNumber + "\nCapacity: " + capacity)
    }
}
class  DeluxRoom(roomNumber: Int, capacity: Int, seaView: Boolean) extends Room(roomNumber, capacity) {
    override def features() : Unit = {
        super.features()
        print("\nSea View : " + seaView)
        print("\n")
        print("\n")
    }
}

class  SuiteRoom(roomNumber: Int, capacity: Int, balcony: Int) extends Room(roomNumber, capacity) {
    override def features() : Unit = {
        super.features()
        print("\nNumber of Balconies : " + balcony)
        print("\n")
        print("\n")
    }
}

object Ques3 {
    def main(args: Array[String]): Unit = {
        val room1 = new DeluxRoom(101, 4, true)
        val room2 = new SuiteRoom(110, 10, 2)

        room1.features()
        room2.features()


    }
}