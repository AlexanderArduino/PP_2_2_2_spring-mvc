package web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;

@Controller
@RequestMapping()
public class CarsContoller {

    private final CarsDAO carsDAO;

    @Autowired
    public CarsContoller(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping("cars")
    public String getCarsByCount(@RequestParam("count") int count,
                                 Model model){
        // Получим все машины из DAO и передадим их на представление
        model.addAttribute("carsByCount", carsDAO.getCarsByCount(count));
        model.addAttribute("count", count);
        return "cars";
    }
}
