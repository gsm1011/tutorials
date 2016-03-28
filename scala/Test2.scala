abstract class Animal {
    def speak 
}

trait WagglingTail {
    def startTail { println("starting tail. ") }
    def stopTail { println("stoping tail. ") } 
}

trait FourLeggedAnimal {
    def walk
    def run 
}

class Dog extends Animal with WagglingTail with FourLeggedAnimal {
    def speak {
	println ("Dogs can spark......")
    }
    def walk {
	println ("Dogs are walking......")
    }
    def run {
	println ("Dogs run fast......")
    }
    override def startTail {
	println("Dog waggling tail.......")
    }
}

object Test2 {
    def main(args: Array[String]): Unit = {
	var dog = new Dog
	dog.run
	dog.walk
	dog.startTail
	dog.stopTail
    }
}
