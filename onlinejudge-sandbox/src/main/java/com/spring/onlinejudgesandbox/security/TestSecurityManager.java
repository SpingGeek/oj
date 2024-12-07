package com.spring.onlinejudgesandbox.security;

import cn.hutool.core.io.FileUtil;
import java.nio.charset.Charset;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 测试安全管理器
 */
public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }

}
