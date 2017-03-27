package serwerapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by RENT on 2017-03-25.
 */
public class SerwerApi {
    public SerwerApi(String serverUrl) {
        this.serverUrl = serverUrl;
        setMapper();
    }

    public static void main(String[] args) throws UnirestException {
        program();
        JsonNode weatherJson=Unirest.get("http://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=a1fb2306e8575f67c23fc8f23062f7e1").asJson().getBody();
        String desc=weatherJson.getObject().getJSONArray("weather").optJSONObject(0).getString("description");
        System.out.println(desc);









}

    public static void setMapper() {
        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        });
    }


    String serverUrl;

    public String editUser(String id, Customer customer) throws UnirestException {
        String odp = Unirest.put(serverUrl + "/" + id).header("Content-type", "application/json").body(customer).asString().getBody();
        return odp;
    }

    public void addUser(Customer customer) throws UnirestException {

        Unirest.post(serverUrl)
                .header("Content-Type", "application/json")
                .body(customer).asString().getBody();
    }

    public Customer[] getCustomers() throws UnirestException {
        Customer[] customer = Unirest.get(serverUrl).asObject(Customer[].class).getBody();
        return customer;
    }

    public String removeUser(String id) throws UnirestException {

        String serverOut = Unirest.delete(serverUrl + "/" + id).asString().getBody();
        return serverOut;
    }


    public static  void program() throws UnirestException {
        SerwerApi serwerApi = new SerwerApi("http://46.101.150.244:8080/api/v1/customers");
        Customer customer = new Customer("Kein", "Saam", "1987", 1.8, "3333");


        printMenu();


        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            int option = input.nextInt();
            switch (option) {
                case 1:
                    serwerApi.addUser(customer);
                    break;
                case 2:
                    Customer[] customers = serwerApi.getCustomers();
                    Arrays.stream(customers).forEach(x -> System.out.println(x.toString()));
                    break;
                case 3:
                    System.out.println(serwerApi.removeUser("3333"));
                    break;
                case 4:
                    Customer customer1 = new Customer("Jack", "Sparow", "1790", 1.78, "3333");
                    System.out.println(serwerApi.editUser("3333", customer1));
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("wybierz z menu");
            }
        }
    }
    public static void printMenu() {
        System.out.println("*************LISTA POLECEN*******************");
        System.out.println("1   -   DODAJ");
        System.out.println("2   -   WYPISZ");
        System.out.println("3   -   USUN");
        System.out.println("4   -   EDYTUJ");
        System.out.println("5   -   KONIEC");
        System.out.println();
    }
}
