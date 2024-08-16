package com.timzowen.gridapp.data

import com.timzowen.gridapp.R
import com.timzowen.gridapp.model.Topic

class TopicDataSource {

    fun loadCourseTopics(): List<Topic>{
        return listOf(
            Topic(R.drawable.architecture,101,R.string.architecture),
            Topic(R.drawable.automotive,200,R.string.automotive),
            Topic(R.drawable.biology,345,R.string.biology),
            Topic(R.drawable.business,400,R.string.business),
            Topic(R.drawable.crafts,443,R.string.crafts),
            Topic(R.drawable.culinary,345,R.string.culinary),
            Topic(R.drawable.design,222,R.string.design),
            Topic(R.drawable.drawing,232,R.string.drawing),
            Topic(R.drawable.ecology,123,R.string.ecology),
            Topic(R.drawable.engineering,876,R.string.engineering),
            Topic(R.drawable.fashion,321,R.string.fashion),
            Topic(R.drawable.film,233,R.string.film),
            Topic(R.drawable.finance,333,R.string.finance),
            Topic(R.drawable.gaming,232,R.string.gaming),
            Topic(R.drawable.geology,654,R.string.geology),
            Topic(R.drawable.history,678,R.string.history),
            Topic(R.drawable.journalism,101,R.string.journalism),
            Topic(R.drawable.law,765,R.string.law),
            Topic(R.drawable.lifestyle,101,R.string.lifestyle),
            Topic(R.drawable.music,555,R.string.music),
            Topic(R.drawable.painting,433,R.string.painting),
            Topic(R.drawable.photography,454,R.string.photography),
            Topic(R.drawable.physics,101,R.string.physics),
            Topic(R.drawable.tech,909,R.string.tech),
            Topic(R.drawable.geology,343,R.string.geology),
            Topic(R.drawable.history,987,R.string.history),
            Topic(R.drawable.journalism,765,R.string.journalism),
            Topic(R.drawable.law,543,R.string.law),
            Topic(R.drawable.lifestyle,101,R.string.lifestyle),
            Topic(R.drawable.music,345,R.string.music),
            Topic(R.drawable.painting,101,R.string.painting),
            Topic(R.drawable.photography,567,R.string.photography),
            Topic(R.drawable.physics,101,R.string.physics),
            Topic(R.drawable.tech,890,R.string.tech)
        )
    }
}