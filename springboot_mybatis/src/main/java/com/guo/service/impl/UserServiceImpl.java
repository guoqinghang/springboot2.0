package com.guo.service.impl;


import com.guo.domain.User;
import com.guo.mapper.UserMapper;
import com.guo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

	 @Resource
	 private UserMapper userMapper;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int addAccount() {
		User user = new User();
		user.setAge(88);
		user.setCreateTime(new Date());
		user.setName("测试事务啦加入事务");
		user.setPhone("10010101010");
		userMapper.insert(user);
		int i = 19/0;

		return 0;
	}

	@Override
	public int add(User user) {
		userMapper.insert(user);
		int id = user.getId();
		return id;
	}
	





}
