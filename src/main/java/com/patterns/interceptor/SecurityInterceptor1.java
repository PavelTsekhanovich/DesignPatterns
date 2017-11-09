package com.patterns.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

//@Interceptor
public class SecurityInterceptor1 {
    @AroundInvoke
    public Object doSecurityCheck(InvocationContext context) throws Exception {
        // Do some security checks!
        Logger.getLogger("SecurityLog").info(
                context.getMethod().getName() + "is accessed!");
        return context.proceed();
    }
}
