package com.lens.json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class SimpleJsonApp {
    public static void main(String[] args)  throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        /*Cat cat = objectMapper.readValue(new File("data/sample.json"),Cat.class);
        System.out.println(cat.getName() + " : " + cat.getAge());

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Cat cat1 = new Cat();
        cat1.setName("Smiegel");
        cat1.setAge(15);

        objectMapper.writeValue(new File("data/output.json"),cat1);*/

        Student theStudent = objectMapper.readValue(new File("data/student-lite.json"),Student.class);
        System.out.println(theStudent);
        System.out.println();
        Student studentFull = objectMapper.readValue(new File("data/student.json"),Student.class);
        System.out.println(studentFull);
    }
}
