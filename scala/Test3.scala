// extending java interfaces.

class Dog extends Animal with Waggling with Running {
    def speak { println ("speaking......") }
    def wag { println ("Waggling .......") }
    def running { println ("Running .......") }
}

object Test3 {
    def main (args: Array[String]): Unit = {
	var dog = new Dog()
	dog.speak
	dog.wag
	dog.running
    }
}
