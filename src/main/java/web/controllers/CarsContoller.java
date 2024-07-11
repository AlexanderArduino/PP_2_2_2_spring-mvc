package web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping()
public class CarsContoller {

    private final CarService carService;

    @Autowired
    public CarsContoller(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("cars")
    public String getCarsByCount(@RequestParam(value = "count", required = false) Integer count,
                                 Model model){

        // Получим все машины из DAO и передадим их на представление
        model.addAttribute("carsByCount", carService.getCarsByCount(count));
        model.addAttribute("count", count);
        return "cars";
    }
}
