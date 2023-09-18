package com.gsm.finance.core.service.impl;

import com.gsm.finance.core.pojo.entity.UserAccount;
import com.gsm.finance.core.mapper.UserAccountMapper;
import com.gsm.finance.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author gsm
 * @since 2023-09-18
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
