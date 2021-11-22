package ensim_tp.demo.controller;

import ensim_tp.demo.model.AddressRepository;
import ensim_tp.demo.model.Cities;
import ensim_tp.demo.model.GPSdata;
import ensim_tp.demo.model.ReponseMeteoConcept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Controller
public class Meteo {

    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/meteo")
    public String RecupAdress(@RequestParam(name = "address",required = true) String address,Model model){

        System.out.println("La donnees entreer : "+address);

        RestTemplate restTemplate = new RestTemplate();

        GPSdata data = new GPSdata();

        String url = "https://api-adresse.data.gouv.fr/search/?q="+address+"&type=housenumber&autocomplete=1";

        String url_2 = "https://api.meteo-concept.com/api/location/cities?token=0f7c8223b4ada26e94d673018dd6f417bb9b883c7440488688c5bd1dc9f7eb69&search=Paris";

        String url_3 = "https://api.meteo-concept.com/api/forecast/daily?token=f7c8223b4ada26e94d673018dd6f417bb9b883c7440488688c5bd1dc9f7eb69&insee=35238";

        data = restTemplate.getForObject(url,data.getClass());

        Cities data_2 = new Cities();

        data_2 = restTemplate.getForObject(url_2,data_2.getClass());


        JSONObject jsonObject = new JSONObject(data);


        model.addAttribute("data",jsonObject.toString());

        jsonObject = new JSONObject(data_2);

        model.addAttribute("data_2",jsonObject.toString());

        String commentaire= new String("--------------------Maintenant, j'affiche les informations de localisation de Paris de puis l'api Meteo-Concept-------------------");

        model.addAttribute("comment",commentaire);

        //String commentaire2= new String("--------------------Maintenant, j'affiche le temps qu'il fait a RENNES -------------------");

        //ReponseMeteoConcept reponse = new ReponseMeteoConcept();

        //reponse = restTemplate.getForObject(url_3,reponse.getClass());

        //JSONObject jsonObject3 = new JSONObject(reponse);
        //model.addAttribute("commente2",commentaire2);

        //model.addAttribute("response",jsonObject3);


        return "meteo";
    }
}
