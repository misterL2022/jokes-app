package guru.springFramework.jokesApp.jokesApp.controllers;

import guru.springFramework.jokesApp.jokesApp.services.JokesService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(@Qualifier("jokesServiceImpl") JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model)
    {
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }

}
