package lambda

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found")
            return
        }
    }
    println("Alice is not found")
}

fun lookForAlice1(people: List<Person>) {
    people.forEach label@ {
        if (it.name == "Alice") return@label
    }
    println("Alice may be somewhere")
}

fun lookForAlice2(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach
    }
    println("Alice may be somewhere")
}

fun lookForAlice3(people: List<Person>) {
    people.forEach(fun(person) {
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    lookForAlice(people)
    lookForAlice1(people)
    lookForAlice2(people)
    lookForAlice3(people)
}
