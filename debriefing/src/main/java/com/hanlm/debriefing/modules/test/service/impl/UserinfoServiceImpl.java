package com.hanlm.debriefing.modules.test.service.impl;

import com.hanlm.debriefing.modules.test.entity.Userinfo;
import com.hanlm.debriefing.modules.test.mapper.UserinfoMapper;
import com.hanlm.debriefing.modules.test.service.IUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author maf
 * @since 2020-01-12
 */
@Service
@Transactional
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {

}
