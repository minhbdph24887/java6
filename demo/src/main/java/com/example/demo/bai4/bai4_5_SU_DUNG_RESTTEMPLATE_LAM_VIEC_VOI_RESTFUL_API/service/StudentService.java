package com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.service;

import com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.bean.Student;
import com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.bean.StudentMap;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://poly-java-6-7209b-default-rtdb.firebaseio.com/students.json";

    private String getUrl(String key) {
        return url.replace(".json", "/" + key + ".json");
    }

    public StudentMap getAll() {
        return restTemplate.getForObject(url, StudentMap.class);
    }

    public Student findByKey(String key) {
        return restTemplate.getForObject(getUrl(key), Student.class);
    }

    public String create(Student student) {
        HttpEntity<Student> httpEntity = new HttpEntity<>(student);
        JsonNode jsonNode = restTemplate.postForObject(url, httpEntity, JsonNode.class);
        return jsonNode.get("name").asText();
    }

    public Student update(String key, Student student) {
        HttpEntity<Student> httpEntity = new HttpEntity<>(student);
        restTemplate.put(getUrl(key), httpEntity);
        return student;
    }

    public void delete(String key) {
        restTemplate.delete(getUrl(key));
    }
}
