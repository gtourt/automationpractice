package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private Properties props;
    private final String configurationFilePath = "src/test/resources/configuration.properties";
    private final String stringFilePath = "src/test/resources/string.properties";

    public PropertiesReader() {
        FileInputStream inputStream, inputStream1;
        try {
            inputStream = new FileInputStream(stringFilePath);
            inputStream1 = new FileInputStream(configurationFilePath);
            props = new Properties();
            props.load(inputStream);
            props.load(inputStream1);
            inputStream.close();
            inputStream1.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties getProperties() {
        return this.props;
    }
}
