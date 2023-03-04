package com.example.YatzyGame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.YatzyGame.terning.TerningTabell;

@RestController
public class YatzyController {





    @GetMapping("/hello")
    public String hello() {
    return "Hello, world!";
}


    @GetMapping("/trill-terninger")
    public String trillTerninger() {
        TerningTabell tabell = new TerningTabell(5);
        tabell.trillAlle();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tabell.getAntallTerninger(); i++) {
            int terningVerdi = tabell.getTerning(i).getVerdi();
            String terningBilde = "images/"+terningVerdi+".png";

            sb.append("<img src=\"").append(terningBilde).append("\" alt=\"").append(terningBilde).append("\">");
        }
        return sb.toString();
    }


    
    

}
