package clazz

import basic.Person
import java.io.File

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            println(person.name)
        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, true)
    }

}

fun main(args: Array<String>) {
    Payroll.calculateSalary() // 可以像工具类一样调用calculateSalary
}