package com.thetestingacademy.ex_22092024.jsonpath;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;


public class JSONPath02 {
    //  POST - Create -> Verify the Response
    public static void main(String[] args) {
        String response = "{\n" +
                "    \"firstName\": \"John\",\n" +
                "    \"lastName\": \"doe\",\n" +
                "    \"age\": 26,\n" +
                "    \"address\": {\n" +
                "        \"streetAddress\": \"naist street\",\n" +
                "        \"city\": \"Nara\",\n" +
                "        \"postalCode\": \"630-0192\"\n" +
                "    },\n" +
                "    \"phoneNumbers\": [\n" +
                "        {\n" +
                "            \"type\": \"iPhone\",\n" +
                "            \"number\": \"0123-4567-8888\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"home\",\n" +
                "            \"number\": \"0123-4567-8910\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        JsonPath jsonPath = JsonPath.from(response);
        System.out.println(jsonPath.getString("firstName"));

        System.out.println(jsonPath.getString("phoneNumbers[1].type"));

        Assert.assertEquals(jsonPath.getString("firstName"),"Pramod");
        assertThat(jsonPath.getString("firstName")).isNotNull().isNotEmpty().isEqualTo("John");










    }


}
