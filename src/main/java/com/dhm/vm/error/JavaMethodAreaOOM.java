package com.dhm.vm.error;

import com.dhm.vm.error.jdkproxy.JDKDynamicProxy;
import com.dhm.vm.error.jdkproxy.RealSubject;
import com.dhm.vm.error.jdkproxy.Subject;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 方法区异常(已验证)
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 11:41
 *
 * JDK 1.8中 PermSize 和 MaxPermSize 已经无效
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args) {
        while (true) {
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(OOMObject.class);
//            enhancer.setUseCache(false);
//            enhancer.setCallback(new MethodInterceptor() {
//                @Override
//                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                    return methodProxy.invoke(o,objects);
//                }
//            });
//            enhancer.create();
            Subject subject = new JDKDynamicProxy(new RealSubject()).getProxy();
        }
    }

    static class OOMObject{}

}