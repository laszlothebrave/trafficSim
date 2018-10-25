package Traffic;

import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class RoadsInitialization {
    public void init(){
        InputStream fis = null;
        try {
            fis = new FileInputStream("file.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JsonReader reader = Json.createReader(fis);

        JsonObject personObject = reader.readObject();

        reader.close();
        System.out.println("Name   : " + personObject.getString("name"));
        System.out.println("Age    : " + personObject.getInt("age"));
        System.out.println("Married: " + personObject.getBoolean("isMarried"));

        JsonObject addressObject = personObject.getJsonObject("address");
        System.out.println("Address: ");
        System.out.println(addressObject.getString("street"));
        System.out.println(addressObject.getString("zipCode"));

        System.out.println("Phone  : ");
        JsonArray phoneNumbersArray = personObject.getJsonArray("phoneNumbers");

        for (JsonValue jsonValue : phoneNumbersArray) {
            System.out.println(jsonValue.toString());
        }
    }
}
