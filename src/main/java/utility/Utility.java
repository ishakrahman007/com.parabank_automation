package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class Utility {

    public static String currentDir = System.getProperty("user.dir");

    public static Properties loadProperties(){
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(currentDir+ File.separator+"config.properties");
            properties.load(fis);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String decode(String key){
        byte[] decodedBytes = Base64.getDecoder().decode(key);
        return new String(decodedBytes);
    }



    // Remove the following lines of code after you've finished encoding
    public static void main(String[] args) {
        String originalInput = "";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode("");
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }

}
