package com.timzowen.gridapp.data

import com.timzowen.gridapp.R
import com.timzowen.gridapp.model.Topic

class TopicDataSource {

    fun loadCourseTopics(): List<Topic>{
        return listOf(
            Topic(R.drawable.architecture,101,R.string.architecture),
            Topic(R.drawable.automotive,101,R.string.automotive),
            Topic(R.drawable.biology,101,R.string.biology),
            Topic(R.drawable.business,101,R.string.business),
            Topic(R.drawable.crafts,101,R.string.crafts),
            Topic(R.drawable.culinary,101,R.string.culinary),
            Topic(R.drawable.design,101,R.string.design),
            Topic(R.drawable.drawing,101,R.string.drawing),
            Topic(R.drawable.ecology,101,R.string.ecology),
            Topic(R.drawable.engineering,101,R.string.engineering),
            Topic(R.drawable.fashion,101,R.string.fashion),
            Topic(R.drawable.film,101,R.string.film),
            Topic(R.drawable.finance,101,R.string.finance),
            Topic(R.drawable.gaming,101,R.string.gaming),
            Topic(R.drawable.geology,101,R.string.geology),
            Topic(R.drawable.history,101,R.string.history),
            Topic(R.drawable.journalism,101,R.string.journalism),
            Topic(R.drawable.law,101,R.string.law),
            Topic(R.drawable.lifestyle,101,R.string.lifestyle),
            Topic(R.drawable.music,101,R.string.music),
            Topic(R.drawable.painting,101,R.string.painting),
            Topic(R.drawable.photography,101,R.string.photography),
            Topic(R.drawable.physics,101,R.string.physics),
            Topic(R.drawable.tech,101,R.string.tech)
        )
    }
}