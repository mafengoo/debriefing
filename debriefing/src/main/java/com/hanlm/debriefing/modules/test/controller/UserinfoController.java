package com.hanlm.debriefing.modules.test.controller;


import com.hanlm.debriefing.modules.test.entity.Userinfo;
import com.hanlm.debriefing.modules.test.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author maf
 * @since 2020-01-12
 */
@RestController
@RequestMapping("/test/userinfo")
public class UserinfoController {

    @Autowired
    private IUserinfoService iUserinfoService;

    @RequestMapping(value = "/test")
    public String test() {
        Userinfo userinfo = iUserinfoService.getById("1");
        return userinfo.getRealname();
    }
}
