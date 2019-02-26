package demo1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;

/**
 * 访问Servlet的API方式一：完全解耦合的方式
 * @author jt
 *
 * 注：这种方式只能获得代表request、session、application的数据的Map集合，不能操作这些对象的本身方法
 *
 */
public class RequestDemo1 extends ActionSupport {


    @Override
    public String execute() throws Exception {

        /*
        接收参数
         */
        //利用Struts2中的ActionContext对象
        ActionContext context = ActionContext.getContext();

        // map中value的实际类型是string[],需要进行转换
        // 类似于Map<String,String[]> request.getParameterMap();
       Map<String,Object> map = context.getParameters();

        for (String key : map.keySet()) {
            String[] valus = (String[]) map.get(key);
             System.out.println(key + ":" + Arrays.toString(valus));
        }

        /*
        向域对象中存入对象
         */
        context.put("reqName","reqValue");//相当于request.setAttribute();
        context.getSession().put("sessName","sessValue");//相当于session.setAttribute();
        context.getApplication().put("appName","appValue"); //相当于application.setAttribute();

        return super.execute();
    }
}
