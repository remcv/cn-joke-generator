package remcv.com.github.cnjokegenerator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import remcv.com.github.cnjokegenerator.services.JokeService;

@Controller
public class JokeController 
{
    // fields
    private JokeService jokeService;

    // constructor
    @Autowired
    public JokeController(JokeService jokeService)
    {
        this.jokeService = jokeService;
    }

    // methods
    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());

        return "chuckNorris";
    }
}
