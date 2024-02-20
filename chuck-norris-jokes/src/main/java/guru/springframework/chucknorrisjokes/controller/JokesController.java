package guru.springframework.chucknorrisjokes.controller;

import guru.springframework.chucknorrisjokes.service.JokeService;
import guru.springframework.chucknorrisjokes.service.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JokesController {

    private final JokeServiceImpl jokeService;

    public JokesController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/joke")
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
