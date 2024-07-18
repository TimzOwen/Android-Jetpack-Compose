package inheritance

open class SecondaryClass : BaseClass() {

    override fun teamLead() {
        super.teamLead()
        println("Secondary Class Lead")
    }
}