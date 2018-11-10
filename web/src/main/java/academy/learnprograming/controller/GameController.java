package academy.learnprograming.controller;

import academy.learnprograming.service.GameService;
import academy.learnprograming.util.AttributeNames;
import academy.learnprograming.util.GameMappings;
import academy.learnprograming.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    @GetMapping(GameMappings.PLAY)
    public String play(Model model){
        model.addAttribute(AttributeNames.MAIN_MESSAGE,gameService.getMainMessage());
        model.addAttribute(AttributeNames.RESULT_MESSAGE,gameService.getResultMessage());
        log.info("model= {}", model);
        if (gameService.isGameOver()) {
            return ViewNames.GAME_OVER;
        }
        return ViewNames.PLAY;
    }
}
