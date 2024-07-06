package bank

class BankAccount(var bankAccHolder: String, var bankBalance: Double) {
    private var transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        bankBalance += amount
        transactionHistory.add("$bankAccHolder deposited $$amount . current balance $bankBalance")
    }

    fun withdraw(amount: Double) {
        if (amount <= bankBalance){
            bankBalance -= amount
            transactionHistory.add("$bankAccHolder withdrew $$amount . current balance $bankBalance")
        }else println("$amount is more than your $$bankBalance balance.. top up")
    }

    fun displayTransactionHistory(){
        println("Transaction History for: $bankAccHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }
}