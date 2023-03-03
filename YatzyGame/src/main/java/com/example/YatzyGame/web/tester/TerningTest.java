package com.example.YatzyGame.web.tester;

import org.springframework.web.bind.annotation.RestController;
//import com.example.YatzyGame.terning.Terning;
import com.example.YatzyGame.terning.TerningTabell;


@RestController
public class TerningTest {

    
    private TerningTabell terninger;

    public TerningTest() {
        this.terninger = new TerningTabell(5);
    }

    public void trillTerninger() {
        this.terninger.trillAlle(); // fra TerningTabell
    }
    /*
    public void trillEnTerning(int index) {
        this.terninger.trillEn(index);
    }
     */

    public String getResultat() {
        return this.terninger.toString();
    }

    /*
    public List<Terning> terningTest() {
        List<Terning> terninger = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            Terning t = new Terning();
            t.trill();
            terninger.add(t);
        }
        return terninger;
    }
     */



}