package com.zhou.Shiro;

import com.zhou.Service.AccountService;
import com.zhou.pojo.Account;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的realm
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private AccountService accountService;
    /**
     * 授权
     * @param principalCollection
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权");
        return null;
    }

    /**
     * 认证，实现认证：1.获取当前用户Subject-->2.通过当前用户拿到session-->3.封装当前用户 到UsernamePasswordToken
     * @param authenticationToken
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证：");
        String name ="admin";
        String password = "123456";

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken; //将上面的参数authenticationToken转换token ，即controller中的UsernamePasswordToken
        if (!token.getUsername().equals(name)) //用户名这里判段
        {
            return null;
        }
        //密码认证。shiro做
        return new SimpleAuthenticationInfo("",password,"");
        //从数据库中拿：
        //Account account = accountService.findByUsername(token.getUsername());
        //if(account != null){

            // return new SimpleAuthenticationInfo(account,account.getPassword(),getName());
        //}

    }
}