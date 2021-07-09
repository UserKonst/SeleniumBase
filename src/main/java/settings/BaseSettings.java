package settings;

public abstract class BaseSettings {

    private static String basePath = ".\\src\\main\\resources\\";

    public abstract String getFilePath();

    protected String GetFilePath(String fileName) {
        return basePath + fileName;
    }


}
