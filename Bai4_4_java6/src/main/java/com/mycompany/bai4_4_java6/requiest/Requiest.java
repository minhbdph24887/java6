/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4_4_java6.requiest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author minhb
 */
public class Requiest {

    private static ObjectMapper mapper = new ObjectMapper();

    public static JsonNode get(String path) {
        return requiest("GET", path, null);
    }

    public static JsonNode post(String path, Object data) {
        return requiest("POST", path, data);
    }

    public static JsonNode put(String path, Object data) {
        return requiest("PUT", path, data);
    }

    public static void delete(String path) {
        requiest("DELETE", path, null);
    }

    private static JsonNode requiest(String method, String path, Object data) {
        try {
            // 1. REQUIEST
            String url = "https://poly-java-6-7209b-default-rtdb.firebaseio.com" + path + ".json"; // lay duong dan
            URL url1 = new URL(url); // tao ham URL trong java
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection(); // mo cong ket noi
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestMethod(method);

            // 1.1 DATA(POST & PUT only)
            if (method.equalsIgnoreCase("POST") || method.equalsIgnoreCase("PUT")) {
                connection.setDoOutput(true);
                mapper.writeValue(connection.getOutputStream(), data);
            }

            // 2. RESPONSE
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                return mapper.readTree(connection.getInputStream());
            }
            connection.disconnect();
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
