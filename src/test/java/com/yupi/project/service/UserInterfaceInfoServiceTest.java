package com.yupi.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author ccc
 * @create 2023-12-14 18:20
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount(){
        userInterfaceInfoService.invokeCount(1L,1L);

    }
}
