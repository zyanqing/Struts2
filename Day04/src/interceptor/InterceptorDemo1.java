package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义的拦截器一
 * @author jt
 *
 */
public class InterceptorDemo1 extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception{

         System.out.println("InterceptorDemo1执行了......");

         String obj = actionInvocation.invoke();

        System.out.println("InterceptorDemo1执行结束了......");

        return obj;
    }
}
