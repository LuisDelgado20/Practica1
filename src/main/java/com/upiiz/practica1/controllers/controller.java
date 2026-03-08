package com.upiiz.practica1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/index")
    public String index(){return "index";}
    @GetMapping("/audio")
    public String audio(){return "audio";}
    @GetMapping("/dl")
    public String dl(){return "dl";}
    @GetMapping("/dt")
    public String dt(){return "dt";}
    @GetMapping("/em")
    public String em(){return "em";}
    @GetMapping("/form")
    public String form(){return "form";}
    @GetMapping("/h1")
    public String h1(){return "h1";}
    @GetMapping("/h2")
    public String h2(){return "h2";}
    @GetMapping("/h3")
    public String h3(){return "h3";}
    @GetMapping("/img")
    public String img(){return "img";}
    @GetMapping("/input")
    public String input(){return "input";}
    @GetMapping("/label")
    public String label(){return "label";}
    @GetMapping("/li")
    public String li(){return "li";}
    @GetMapping("/ol")
    public String ol(){return "ol";}
    @GetMapping("/p")
    public String p(){return "p";}
    @GetMapping("/strong")
    public String strong(){return "strong";}
    @GetMapping("/table")
    public String table(){return "table";}
    @GetMapping("tbody")
    public String tbody(){return "tbody";}
    @GetMapping("/td")
    public String td(){return "td";}
    @GetMapping("/tr")
    public String tr(){return "tr";}
    @GetMapping("/video")
    public String video(){return "video";}
    @GetMapping("/header")
    public String header(){return "header";}
    @GetMapping("/article")
    public String article(){return "article";}
    @GetMapping("/body")
    public String body(){return "body";}
    @GetMapping("/main")
    public String main(){return "main";}
}
