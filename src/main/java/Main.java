import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\myhap\\IdeaProjects\\tests\\src\\main\\resources\\fileTest.json";
        JSONObject jsonObject = JSONUtil.parseJSONFile(filename);
        System.out.println(jsonObject.get("test"));
    }
}
