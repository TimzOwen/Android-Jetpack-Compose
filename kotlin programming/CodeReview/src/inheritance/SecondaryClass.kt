package inheritance

class SecondaryClass : BaseClass() {

    override fun teamLead() {
        super.teamLead()
        println("Secondary Class Lead")
    }
}