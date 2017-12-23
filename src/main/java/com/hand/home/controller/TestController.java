package com.hand.home.controller;

import java.util.List;
import java.util.Map;

import com.hand.home.dao.StudentDao;
import com.hand.home.pojo.Student;

import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class TestController {
    private StudentDao studentDao;
    private Gson gson = new Gson();

    @Autowired
    public TestController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @RequestMapping(value = "/admin.do")
    @ResponseBody
    public String testSpring() {

        Logger logger  = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.error("error level");
        logger.fatal("fatal level");

        return "My Admin String";
    }


    @RequestMapping(value = "/test.do", produces="application/json; charset=UTF-8")
    @ResponseBody
    public String testDB(HttpServletRequest request, HttpServletResponse response) {
        String jsonData = "{'name':'安红','age':29}";
        Student student = gson.fromJson(jsonData, Student.class);
        studentDao.insert(student);
        return gson.toJson(student);

    }
}
