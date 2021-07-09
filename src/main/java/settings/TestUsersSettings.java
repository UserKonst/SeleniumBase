package settings;

public class TestUsersSettings extends BaseSettings {

    public String userName;

    @Override
    public String getFilePath() {
        return GetFilePath("test_users.properties");
    }
}
