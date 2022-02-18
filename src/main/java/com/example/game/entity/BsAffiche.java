package com.example.game.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bs_affiche")
public class BsAffiche implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 1：游戏公共 2：平台公告
     */
    private Integer status;


}
