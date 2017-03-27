package rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import json.Currency;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by RENT on 2017-03-23.
 */
public class UnirestTest {
    public static void main(String[] args) throws UnirestException {

        String body = Unirest.get("http://46.101.150.244:8080/hi").asString().getBody();
        String body2 = Unirest.get("http://46.101.150.244:8080/helloPathParam/Andrzej").asString().getBody();
        String body3 = Unirest.get("http://46.101.150.244:8080/helloRequestParam?name=Andrzej").asString().getBody();
        String customers = Unirest.get("http://46.101.150.244:8080/customers").asString().getBody();


        System.out.println(body);
        System.out.println(body2);
        System.out.println(body3);
        System.out.println(customers);


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
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        Customer customer = Unirest.get("http://46.101.150.244:8080/customers/anna").asObject(Customer.class).getBody();
        System.out.println(customer.toString());
        Customer customer1=new Customer();
        customer1.setBirthYear("1995");
        customer1.setFirstName("Adam");
        customer1.setLastName("Kowal");
        customer1.setHeight("1.84");
        customer1.setId(UUID.randomUUID().toString());

        String responce=Unirest.post("http://46.101.150.244:8080/api/v1/customers")
                .header("Content-Type","application/json")
                .body(customer1).asString().getBody();
        System.out.println(responce);
    }
}
