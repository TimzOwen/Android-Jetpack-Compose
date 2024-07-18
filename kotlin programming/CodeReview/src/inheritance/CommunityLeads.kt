package inheritance

class CommunityLeads: SecondaryClass(),GdGCommunity,DevCommunity {

    override fun tealLeader() {
        println("New lead for GDG")
    }

    override fun teamLead() {
        println("New DecV leader Team")
    }


}