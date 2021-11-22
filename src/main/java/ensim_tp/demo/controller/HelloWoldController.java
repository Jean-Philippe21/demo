package ensim_tp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWoldController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "NomUtilisateur", required = false, defaultValue="World") String
                           NomUtilisateur, Model model){
        model.addAttribute("NomUtilisateur",NomUtilisateur);

        return  "greeting";
    }


}
