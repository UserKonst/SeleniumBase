package settings;

public class RunSettings extends BaseSettings {

    public String googlePageUrl;

    @Override
    public String getFilePath() {
        return GetFilePath("run_settings.properties");
    }
}

