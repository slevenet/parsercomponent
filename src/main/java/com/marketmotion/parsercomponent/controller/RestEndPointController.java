package com.marketmotion.parsercomponent.controller;

import com.marketmotion.parsercomponent.parser.VolatParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("parsercomponent")
public class RestEndPointController {

    @Autowired
    VolatParser volatParser;

    @GetMapping("volatTable")
    public Map<String,String> getVolatTable() throws IOException {
        return volatParser.parse();
    }
}
