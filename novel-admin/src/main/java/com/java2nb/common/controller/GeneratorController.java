package com.java2nb.common.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java2nb.common.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/common/generator")
@Controller
public class GeneratorController {
    String prefix = "common/generator";
    @Autowired
    GeneratorService generatorService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping()
    String generator() {
        return prefix + "/list";
    }



}
