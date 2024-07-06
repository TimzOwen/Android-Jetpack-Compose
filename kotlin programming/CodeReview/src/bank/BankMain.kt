package bank

fun main() {

    val owenAccount = BankAccount("owen",200.50)
    owenAccount.deposit(400.50)
    owenAccount.withdraw(150.50)
    owenAccount.deposit(300.50)
    owenAccount.withdraw(800.50)
    owenAccount.withdraw(2000.50)
    println(owenAccount.displayTransactionHistory())

}