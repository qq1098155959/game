package com.example.game;

import com.example.game.entity.BsGame;
import com.example.game.entity.User;
import com.example.game.mapper.BsGameMapper;
import com.example.game.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@MapperScan(basePackages = "com.example.game.mapper")
class GameApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BsGameMapper gameMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setId(1);
        user.setName("12");
        user.setPhone(123456);
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }

    @Test
    void testGameInsert() {
        BsGame game = new BsGame();
        game.setId(1);
        game.setContent("123");
        gameMapper.insert(game);
        assertThat(game.getId()).isNotNull();
    }

}
