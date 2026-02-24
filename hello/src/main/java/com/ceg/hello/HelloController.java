package com.ceg.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/heroes")
public class HelloController {

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/bidding")
    public String bidding(@RequestParam(value = "name", defaultValue = " my master") String name) {
        return "What is thy bidding " + name + "?";
    }

    @GetMapping("/foo")
    public Hero hero(
            @RequestParam(value = "heroName", defaultValue = " Fooman", required = true) String heroName,
            @RequestParam(value = "firstName", defaultValue = " Joe", required = true) String firstName,
            @RequestParam(value = "lastName", defaultValue = " Hero", required = true) String lastName,
            @RequestParam(value = "team", defaultValue = " Unaffiliated", required = false) String team,
            @RequestParam(value = "publisher", defaultValue = " Unaffiliated", required = false) String publisher,
            @RequestParam(value = "city", defaultValue = " Unaffiliated", required = false) String city) {
        return new Hero(heroName, firstName, lastName, team, publisher, city);
    }

    @GetMapping("/")
    public String hello() {
        return "What is thy bidding my master?";
    }

    @GetMapping("/superman")
    public String superman() {
        return "Up up and away!";
    }

    @GetMapping("/batman")
    public String batman() {
        return "I'm Batman";
    }

    @GetMapping("/wonderwoman")
    public String wonderwoman() {
        return "Don't need no man.";
    }

}

record Hero(String heroName, String firstName, String lastName, String team, String publisher, String city) {
}
