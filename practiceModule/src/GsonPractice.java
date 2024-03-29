import com.google.gson.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GsonPractice {
    public static void main(String[] args) {

        // getJsonValueToString();

        // convertObjectToJson();

        convertMapToJson();

//        convertJsonToMap();

//        prettyPrinting();

    }

    private static void getJsonValueToString() {
        Gson gson = new Gson();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "anna");
        jsonObject.addProperty("id", 1);

        // jsonObject 타입을 String으로 변환시킴 -> 디비 저장에 용이할 수 있음
        String jsonStr = gson.toJson(jsonObject);
    }

    /**
     * Gson을 이용하여 객체를 json 형태로 string 변환
     */
    public static void convertObjectToJson() {
        Gson gson = new Gson();
        UserDto dto = new UserDto(1, "noah");

        String toJson = gson.toJson(dto);

        System.out.println("toJson = " + toJson);
    }

    public static void convertMapToJson() {
        Gson gson = new Gson();

        Map<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "noah");

        String toJson = gson.toJson(map);
        System.out.println("toJson = " + toJson);

        JsonObject jsonObject = new JsonObject();
        JsonPrimitive name = jsonObject.getAsJsonPrimitive("name");
        System.out.println("name = " + name);
    }

    public static void convertJsonToMap() {
        String jsonStr = "{\"name\":\"noah\",\"id\":\"1\"}";

        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(jsonStr, Map.class);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
    }

    public static void prettyPrinting() {
        UserDto dto = new UserDto(1, "noah");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String toJson = gson.toJson(dto);
        System.out.println("toJson = " + toJson);
    }

    public static void jsonPrimitive() {
        String jsonStr = "{ name : noah }";
        JsonParser parser = new JsonParser();

    }

    public static void jsonStringParse() {

    }
}
