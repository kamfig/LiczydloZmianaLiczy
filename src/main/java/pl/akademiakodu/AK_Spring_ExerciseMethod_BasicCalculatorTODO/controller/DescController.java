package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.controller;

/**
 * Import section
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

@Controller
public class DescController {

    /**
     * Method responsible to get description template
     * @return template with image containing description of exercise
     */
    @GetMapping("/desc")
    public String descGet(){
        return "desc";
    }


   // @ResponseBody // nie szuka html - wyswietla metode javy
    @GetMapping("/random")
    public String getRandom(ModelMap map){
       Set<Integer> lotto = new TreeSet<>();
       Random random = new Random();

       while(lotto.size() !=6){
           lotto.add(random.nextInt(49)+1); // przesuniecie przedziałyu liczy nie od 0 a od 1
       }
            map.put("lotto",lotto);


        return "random"; // bez @responseBody - szuka pliku random.html. który powinien byc w katalogu templates
    }

}
