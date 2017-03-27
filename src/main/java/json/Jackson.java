package json;

import Mapy.Point;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-22.
 */
public class Jackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        List<Point> list = new ArrayList<>();
        list.add(new Point(12, 44));
        list.add(new Point(9, 77));
        list.add(new Point(1, 0));

        Place nova = new Place("grunwald", "wroclaw", list);
        String placJson = objectMapper.writeValueAsString(nova);
        System.out.println(placJson);


        String placeAsJson = "{\n" +
                "  \"name\" : \"grunwald\",\n" +
                "  \"city\" : \"wroclaw\",\n" +
                "  \"points\" : [ {\n" +
                "    \"x\" : 12,\n" +
                "    \"y\" : 44\n" +
                "  }, {\n" +
                "    \"x\" : 9,\n" +
                "    \"y\" : 77\n" +
                "  }, {\n" +
                "    \"x\" : 1,\n" +
                "    \"y\" : 0\n" +
                "  } ]\n" +
                "}\n";


        ObjectMapper objectMapper1 = new ObjectMapper();

        String jsonString = "{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":\"ABC\"}";
        PersonSon personSon = objectMapper1.readValue(jsonString, PersonSon.class);

        String jsonString2 = "{\n" +
                "\"coord\": {\n" +
                "\"lon\": 139,\n" +
                "\"lat\": 35\n" +
                "},\n" +
                "\"weather\": [\n" +
                "{\n" +
                "\"id\": 800,\n" +
                "\"main\": \"Clear\",\n" +
                "\"description\": \"clear sky\",\n" +
                "\"icon\": \"01n\"\n" +
                "}\n" +
                "]}";


        String jsonString3 = "{\n" +
                "    \"base\": \"USD\",\n" +
                "    \"date\": \"2017-01-23\",\n" +
                "    \"rates\": {\n" +
                "        \"AUD\": 1.3212,\n" +
                "        \"BGN\": 1.8253,\n" +
                "        \"BRL\": 3.1613,\n" +
                "        \"CAD\": 1.3314,\n" +
                "        \"CHF\": 1.0011,\n" +
                "        \"CNY\": 6.8536,\n" +
                "        \"CZK\": 25.224,\n" +
                "        \"DKK\": 6.94,\n" +
                "        \"GBP\": 0.80399,\n" +
                "        \"HKD\": 7.7577,\n" +
                "        \"HRK\": 7.0049,\n" +
                "        \"HUF\": 289.15,\n" +
                "        \"IDR\": 13364,\n" +
                "        \"ILS\": 3.7997,\n" +
                "        \"INR\": 68.16,\n" +
                "        \"JPY\": 113.6,\n" +
                "        \"KRW\": 1168.2,\n" +
                "        \"MXN\": 21.413,\n" +
                "        \"MYR\": 4.438,\n" +
                "        \"NOK\": 8.3938,\n" +
                "        \"NZD\": 1.3899,\n" +
                "        \"PHP\": 49.943,\n" +
                "        \"PLN\": 4.0802,\n" +
                "        \"RON\": 4.1977,\n" +
                "        \"RUB\": 59.531,\n" +
                "        \"SEK\": 8.8766,\n" +
                "        \"SGD\": 1.4213,\n" +
                "        \"THB\": 35.3,\n" +
                "        \"TRY\": 3.7867,\n" +
                "        \"ZAR\": 13.557,\n" +
                "        \"EUR\": 0.93327\n" +
                "    }\n" +
                "}";
        ObjectMapper objectMapper3 = new ObjectMapper();
        Currency currency = objectMapper3.readValue(jsonString3, Currency.class);


        String jsonString4="{\n" +
                "  \"coord\": {\n" +
                "    \"lon\": 139,\n" +
                "    \"lat\": 35\n" +
                "  },\n" +
                "  \"weather\": [\n" +
                "    {\n" +
                "      \"id\": 800,\n" +
                "      \"main\": \"Clear\",\n" +
                "      \"description\": \"clear sky\",\n" +
                "      \"icon\": \"01n\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"base\": \"stations\",\n" +
                "  \"main\": {\n" +
                "    \"temp\": 285.232,\n" +
                "    \"pressure\": 1019.46,\n" +
                "    \"humidity\": 100,\n" +
                "    \"temp_min\": 285.232,\n" +
                "    \"temp_max\": 285.232,\n" +
                "    \"sea_level\": 1029.27,\n" +
                "    \"grnd_level\": 1019.46\n" +
                "  },\n" +
                "  \"wind\": {\n" +
                "    \"speed\": 4.11,\n" +
                "    \"deg\": 101.501\n" +
                "  },\n" +
                "  \"clouds\": {\n" +
                "    \"all\": 0\n" +
                "  },\n" +
                "  \"dt\": 1490199093,\n" +
                "  \"sys\": {\n" +
                "    \"message\": 0.0029,\n" +
                "    \"country\": \"JP\",\n" +
                "    \"sunrise\": 1490129062,\n" +
                "    \"sunset\": 1490173055\n" +
                "  },\n" +
                "  \"id\": 1851632,\n" +
                "  \"name\": \"Shuzenji\",\n" +
                "  \"cod\": 200\n" +
                "}";

        ObjectMapper objectMapper4=new ObjectMapper();
        Something some=objectMapper4.readValue(jsonString4,Something.class);
        some.getWeather().stream().forEach(x-> System.out.println(x.getDescription()));

    }
}
