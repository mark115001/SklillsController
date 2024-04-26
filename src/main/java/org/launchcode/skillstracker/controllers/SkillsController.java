package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String helloForm() {
        return "<h1>Hello, World!</h1>" +
                "" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "" +
                "<ol>" +
                "<h2>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</h2>" +
                "</ol?";
    }
}