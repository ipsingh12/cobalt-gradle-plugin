package com.inder.cobalt.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DetermineVersionTask extends DefaultTask {

    @TaskAction
    void executeAction() {

        run();

    }

    private void run()
    {

        def process =["/bin/bash","-c", "echo \"inder\" "].execute();
    }

}
