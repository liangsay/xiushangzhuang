package org.xsz.testmybatis;

import com.alibaba.fastjson.JSON;
import com.xsz.model.UserEntity;
import com.xsz.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
/**
 * Created by liujinliang on 2017/8/7.
 */
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UserService userService = null;

    @Test
    public void test1() {
        UserEntity userEntity = userService.getUserById(1);
        logger.info(JSON.toJSONString(userEntity));
//        System.out.println(userEntity.getUserName());
    }
}
