package com.github.weoking.agilityreduxideaplugin.services

import com.intellij.openapi.project.Project
import com.github.weoking.agilityreduxideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
