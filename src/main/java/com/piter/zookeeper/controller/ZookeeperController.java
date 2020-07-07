package com.piter.zookeeper.controller;

import com.piter.zookeeper.utils.ZkApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ZookeeperController {

    @Autowired
    private ZkApi zkApi;

    @GetMapping(value = "createNode")
    public boolean createNode(String path, String data) {
        log.debug("ZookeeperController create node {},{}", path, data);
        return zkApi.createNode(path, data);
    }

}
