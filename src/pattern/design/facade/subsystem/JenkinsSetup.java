package pattern.design.facade.subsystem;

/**
 * Created by ykhdzr on 2/26/16.
 */
public class JenkinsSetup {

    public void jenkinsBuild() {
        System.out.println("Configuring Jenkins...");
    }

    public void jenkinsDestroy() {
        System.out.println("Deleting Jenkins configuration...");
    }
}
