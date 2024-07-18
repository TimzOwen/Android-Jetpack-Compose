package inheritance

fun main(){

    val team1 = BaseClass()
    val team2 = PrimaryClass()
    val team3 = SecondaryClass()

    team1.teamLead()
    team2.teamLead()
    team3.teamLead()
}