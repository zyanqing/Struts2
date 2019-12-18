package interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorDemo2 extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        System.out.println("InterceptorDemo2执行了......");

        String obj = actionInvocation.invoke();

         System.out.println("InterceptorDemo2执行结束了......");

        return null;
    }
}






