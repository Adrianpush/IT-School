package session15.homework.xml_to_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlToJsonConverter {
    public static void main(String[] args) throws Exception {
        // Create an XML mapper
        ObjectMapper xmlMapper = new XmlMapper();

        // XML content as a String (replace with your actual XML content)
        String xml = "<book><title>Java Programming</title><author>John Doe</author></book>";

        // Convert XML to JSON
        Book book = xmlMapper.readValue(xml, Book.class);
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(book);

        // Print the JSON
        System.out.println(json);
    }
}