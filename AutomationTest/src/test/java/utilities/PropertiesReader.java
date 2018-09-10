package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private Properties props;
    private final String stringFilePath = "src/test/resources/string.properties";

    public PropertiesReader() {
        FileInputStream inputStream, inputStream1;
        try {
            inputStream = new FileInputStream(stringFilePath);
            props = new Properties();
            props.load(inputStream);
            inputStream.close();
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
