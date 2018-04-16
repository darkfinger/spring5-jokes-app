package guru.springframework.joke.controller;

import guru.springframework.joke.service.ChuckQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private ChuckQuoteService chuckQuoteService;

    public JokeController(ChuckQuoteService chuckQuoteService) {
        this.chuckQuoteService = chuckQuoteService;
    }

    @RequestMapping({"/", ""})
    public String getTheQuote(Model m){
        m.addAttribute("joke",chuckQuoteService.printAQuote());
        return "chucknorris";
    }
}
