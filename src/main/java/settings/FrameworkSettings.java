package settings;

import static settings.ConfigReader.*;

public class FrameworkSettings {

    private static FrameworkSettings _instance;
    public static RunSettings runSettings = new RunSettings();
    public static TestUsersSettings testUsersSettings = new TestUsersSettings();

    static {
        if (_instance == null) {

            runSettings = InitSettings(runSettings);
            testUsersSettings = InitSettings(testUsersSettings);

            _instance = new FrameworkSettings();
        }
    }

}
