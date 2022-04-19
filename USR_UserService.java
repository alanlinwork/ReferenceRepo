package com.mytest.user.service;

import com.mytest.user.VO.Dept;
import com.mytest.user.VO.ResponseTemplateVO;
import com.mytest.user.entity.User;
import com.mytest.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser method of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment  of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        log.info("AFTER findByUserId- userId:" + userId);
        Dept dept = restTemplate.getForObject(
               //"http://localhost:9001/depts/" + user.getDepartmentId(),
                "http://DEPT-SERVICE/depts/" + user.getDepartmentId(),
                Dept.class);
        vo.setUser(user);
        vo.setDept(dept);
        return vo;
    }
}
