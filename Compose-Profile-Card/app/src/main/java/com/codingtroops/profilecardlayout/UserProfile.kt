package com.codingtroops.profilecardlayout

data class UserProfile(val userName: String, val onlineStatus: Boolean, val drawableId: Int){

    companion object{
        val userProfileList = arrayListOf(
            UserProfile( userName = "Timz Owen", onlineStatus = true, drawableId = R.drawable.profile_picture),
            UserProfile( userName = "James Bond", onlineStatus = false, drawableId = R.drawable.profile_one),
            UserProfile( userName = "Julie Kemmy", onlineStatus = true, drawableId = R.drawable.profile_two),
            UserProfile( userName = "Mark Otieno", onlineStatus = false, drawableId = R.drawable.profile_three)
        )
    }

}