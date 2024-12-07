package com.spring.onlinejudgesandbox.security;

import java.security.Permission;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 禁用所有权限安全管理器
 */
public class DenySecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }


}
