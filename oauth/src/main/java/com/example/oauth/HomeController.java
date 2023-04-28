package com.example.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final YouTube youTube;
    public HomeController(YouTube youTube) {
        this.youTube = youTube;
    }

    @GetMapping("/")
    String index(Model model){
        model.addAttribute("channelVideos",
                youTube.channelVideos("UC_x5XG1OV2P6uZZ5FSM9Ttw", 10, YouTube.Sort.VIEV_COUNT));
        return "index";
    }

}
