package demo1;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;


/**
 * 访问Servlet的API的方式二：原生的方式
 * @author jt
 *
 * 注：这种方式可以操作域对象的数据，同时也可以获得对象的方法
 *
 */

public class RequestDemo2 extends ActionSupport {

    @Override
    public String execute() throws Exception {

        // 一、接收数据
        // 直接获得request对象，通过ServletActionContext
        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String,String[]> map = request.getParameterMap();

        for (String key : map.keySet()){
             System.out.println(Arrays.toString(map.get(key)));
        }

        // 二、向域对象中保存数据
        // 向request中保存数据:
        request.setAttribute("reqName", "reqValue");
        // 向session中保存数据
        request.getSession().setAttribute("sessName", "sessValue");
        // 向application中保存数据
        ServletActionContext.getServletContext().setAttribute("appName", "appValue");

        return super.execute();
    }
}
