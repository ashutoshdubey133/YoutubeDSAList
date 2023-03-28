package dev.ashutosh.pepcodingjavadsa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JavaPepcodingDSAController {

    @GetMapping("/level1DSA")
    public String getLevel1HomePage(Model model){
        List videoList = new ArrayList<String>(List.of("Introduction to Java Foundation", "How To Print Output in Java", "How to Print Z - Question", "How To Print Output Z - Solution Video"));

        model.addAttribute("vidList",videoList);
        return "videoList";
    }
}
