package com.example.demo.controller;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.GetMapping;import java.util.ArrayList;import java.util.List;@Controllerpublic class OneController {    @GetMapping("index")    public String index(Model model){        List<String> list = new ArrayList<>();        list.add("1");        list.add("2");        list.add("3");        list.add("4");        model.addAttribute("nums",list);        model.addAttribute("name","mzhipin");        return "index";    }}