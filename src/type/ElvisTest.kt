package type

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}