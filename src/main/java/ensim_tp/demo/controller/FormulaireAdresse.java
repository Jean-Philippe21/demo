package ensim_tp.demo.controller;

import ensim_tp.demo.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormulaireAdresse {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/formulaire")
    public String Formulaire(Model model){


        return "formulaireAdresse";
    }


}
