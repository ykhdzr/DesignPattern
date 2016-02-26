package pattern.design.facade;

import pattern.design.facade.subsystem.FabricSetup;
import pattern.design.facade.subsystem.GitSetup;
import pattern.design.facade.subsystem.JenkinsSetup;

/**
 * Created by ykhdzr on 2/26/16.
 */
public class ProjectSetupFacade {
    FabricSetup fabricSetup;
    GitSetup gitSetup;
    JenkinsSetup jenkinsSetup;

    public ProjectSetupFacade(FabricSetup fabricSetup, GitSetup gitSetup, JenkinsSetup jenkinsSetup) {
        this.fabricSetup = fabricSetup;
        this.gitSetup = gitSetup;
        this.jenkinsSetup = jenkinsSetup;
    }

    public void projectUp() {
        fabricSetup.fabricCreate();
        gitSetup.gitInit();
        jenkinsSetup.jenkinsBuild();
    }

    public void projectShutdown() {
        fabricSetup.fabricDelete();
        gitSetup.gitDelete();
        jenkinsSetup.jenkinsDestroy();
    }
}
