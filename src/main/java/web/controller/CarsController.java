package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "marka", required = false) String marka,
                            @RequestParam(value = "type", required = false) String type,
                            Model model) {
        model.addAttribute("carsParamerts", "Marka: " + marka + ", type: " + type);
        return "cars";
    }

    @GetMapping("/calc")
    public String printCalc(@RequestParam("a") double a,
                            @RequestParam("b") double b,
                            @RequestParam("action") String action,
                            Model model) {
        double result = 0.0;
        switch (action){
            case "multiply": result = a*b; break;
            case "division": result = a/b; break;
            case "addition": result = a+b; break;
            case "substraction": result=a-b; break;
        }
        model.addAttribute("result", "Result: " + result);
        return "calc";
    }
}
