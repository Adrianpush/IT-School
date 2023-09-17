package session15.homework.xml_to_json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;


public class XmlToJsonConverter {
    public static void main(String[] args) {
        convertXmlToJson("src/session15/homework/xml_to_json/books.xml",
                "src/session15/homework/xml_to_json/books.json");
    }

    public static void convertXmlToJson(String xmlFilePath, String jsonFilePath) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode rootNode = xmlMapper.readTree(new File(xmlFilePath));
            ObjectMapper jsonMapper = new ObjectMapper();
            jsonMapper.writeValue(new File(jsonFilePath), rootNode);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}