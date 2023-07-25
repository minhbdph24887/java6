/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4_4_java6.servive;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.bai4_4_java6.bean.Student;
import com.mycompany.bai4_4_java6.bean.StudentMap;
import com.mycompany.bai4_4_java6.requiest.Requiest;

/**
 *
 * @author minhb
 */
public class StudentService {

    ObjectMapper mapper = new ObjectMapper();

    public StudentMap getAll() {
        JsonNode resp = Requiest.get("/students");
        return mapper.convertValue(resp, StudentMap.class);
    }

    public Student findByKey(String key) {
        JsonNode resp = Requiest.get("/students/" + key);
        return mapper.convertValue(resp, Student.class);
    }

    public String create(Student data) {
        JsonNode resp = Requiest.post("/students", data);
        return resp.get("name").asText();
    }

    public Student update(String key, Student data) {
        JsonNode resp = Requiest.put("/students/" + key, data);
        return mapper.convertValue(resp, Student.class);
    }

    public void delete(String key) {
        Requiest.delete("/students/" + key);
    }
}
