class Contacts(var empName: String, var empNum: Int, var empShift: Int) {

    fun printAll() {
        println(empName.toString() + "\n" + "Employee Number:"+ empNum + "\n" + "Shift:" + empShift)
    }
}


fun main(args: Array<String>) {


    val person1 = Contacts("John", 14, 1)
    val person2 = Contacts("Sue", 7, 2)
    val person3 = Contacts("Greg", 3, 2)

    person1.printAll()
    println("\n")
    person2.printAll()
    println("\n")
    person3.printAll()

}