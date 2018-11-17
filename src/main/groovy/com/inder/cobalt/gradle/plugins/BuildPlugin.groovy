package com.inder.cobalt.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.inder.cobalt.gradle.tasks.*

class BuildPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        def determineVersionTask =project.tasks.create('determineVersion',DetermineVersionTask)

    }


}