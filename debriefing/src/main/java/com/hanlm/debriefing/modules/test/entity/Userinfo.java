package com.hanlm.debriefing.modules.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author maf
 * @since 2020-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("USERINFO")
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableField("ID")
    private String id;

    /**
     * 用户名
     */
    @TableField("USERNAME")
    private String username;

    /**
     * 真实名称
     */
    @TableField("REALNAME")
    private String realname;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 创建时间
     */
    @TableField("CREATETIME")
    private LocalDateTime createtime;

    /**
     * 是否有效
     */
    @TableField("ISFLAG")
    private String isflag;


}
