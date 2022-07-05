package com.yinrj.redisspringbootstarter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性类，实现配置文件中配置的Redis连接参数
 * @author yinrongjie
 * @version 1.0
 * @date 2022/7/4
 * @description
 */
@ConfigurationProperties(prefix = "own.redisson")
@Data
public class RedissonProperties {
    private String host = "localhost";
    private String password;
    private int port = 6379;
    private int timeout;
    private boolean ssl;
}
