package com.github.gurbuzali.ideaindexstatistics.services

import com.intellij.openapi.project.Project
import com.github.gurbuzali.ideaindexstatistics.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
