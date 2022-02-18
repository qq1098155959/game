package com.example.game.controller;


import com.example.game.service.IBsGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2022-02-08
 */
@RestController
@RequestMapping("/game")
public class BsGameController {
    @Autowired
    IBsGameService gameService;
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Integer id) {
        return gameService.getById(id);
    }
}
