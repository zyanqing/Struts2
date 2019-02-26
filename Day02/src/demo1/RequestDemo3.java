package demo1;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;


/**
 * 访问Servlet的API的方式三：接口注入的方式
 *
 * @author jt
 */

public class RequestDemo3 extends ActionSupport implements ServletRequestAware, ServletContextAware {

    private HttpServletRequest request;

    private ServletContext context;

    @Override
    public String execute() throws Exception {

        Map<String,String[]> map = request.getParameterMap();

        for (String key : map.keySet()){
             System.out.println(Arrays.toString(map.get(key)));
        }

        request.setAttribute("reqName","reqValue");
        request.getSession().setAttribute("sessName","sessValue");
        context.setAttribute("appName","appValue");

        return super.execute();
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }
}
