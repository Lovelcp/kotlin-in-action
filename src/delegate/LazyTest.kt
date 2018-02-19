package delegate

class Email {}

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf()
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun main(args: Array<String>) {

}