//package com.xzt.project.controller;
//
//import com.xzt.project.entity.Student;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//
//@RestController
//public class HelloWorld {
//    @RequestMapping(value="/hello",method= RequestMethod.GET)
//    public Student sayHello(){
//
//        LocalDate birthtime = LocalDate.of(1998,12,10);
//
//        Student student = new Student();
//        student.setName("阿里巴巴爸爸");
//        student.setAge(21);
//        student.setBirthday(birthtime);
//        student.setAssets(BigDecimal.valueOf(200.50));
//
//        List<Object> objectList = new ArrayList<>();
//        Map<String, String> stringHashMap = new HashMap<>();
//        stringHashMap.put("str","str");
//        objectList.add(null);
//        objectList.add(stringHashMap);
//
//        student.setObjectList(objectList);
//
//        return student;
//    }
//}
