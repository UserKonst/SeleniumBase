package settings;

import Exceptions.ConfigurationReadingException;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;

import java.io.File;
import java.io.IOException;

public class ConfigReader<T> {

    public static <T> T InitSettings(BaseSettings baseSettings) {
        JavaPropsMapper mapper = new JavaPropsMapper();
        try {

            baseSettings = mapper.readValue(new File(baseSettings.getFilePath()), baseSettings.getClass());

            return (T) baseSettings;

        } catch (IOException e) {
            System.out.println(e);
        }
        throw new ConfigurationReadingException(String.format("Unable to read config for '%s' class", baseSettings));
    }
}
