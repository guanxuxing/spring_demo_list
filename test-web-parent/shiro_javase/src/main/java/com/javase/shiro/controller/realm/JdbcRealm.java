package com.javase.shiro.controller.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/7.
 */
public class JdbcRealm extends AuthorizingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        SimpleAuthenticationInfo info = null;
        String userName = "gxx";
        String passWord = "abc123";
        String realName = this.getName();
        try {
            info = new SimpleAuthenticationInfo(userName, passWord, realName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = null;
        Set<String> roles = new HashSet<String>();
        roles.add("admin");
        roles.add("user");
        info = new SimpleAuthorizationInfo(roles);
        return info;
    }
}
