package com.example.YatzyGame.web;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


// Filer som er importert fra andre mapper
import com.example.YatzyGame.terning.Terning;
import com.example.YatzyGame.web.tester.TerningTest;

@RestController
public class HelloWorld {
    
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }


    @GetMapping("/terning")
    public String terning(){
        TerningTest test = new TerningTest();
        test.trillTerninger(); 
        return test.getResultat();
    }
    
}

