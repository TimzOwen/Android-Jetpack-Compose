package inheritance

fun main(){

    // classes
//    val team1 = BaseClass()
//    val team2 = PrimaryClass()
//    val team3 = SecondaryClass()
//
//    team1.teamLead()
//    team2.teamLead()
//    team3.teamLead()

    // interfaces
    val lead1 = CommunityLeads()
    lead1.teamLead()
    lead1.tealLeader()
    lead1.newLeader()
}