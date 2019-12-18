package demo1;

import domain.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

public class OgnlDemo1 {


    /*
        OGNL调用对象的方法
     */
    @Test
    public void demo1() throws Exception {

        //获取context
        OgnlContext context = new OgnlContext();

        //获取根对象
        Object root = context.getRoot();

        //执行表达式
        Object obj = Ognl.getValue("'helloword'.length()", context, root);

        System.out.println(obj);
    }

    /*
        访问对象的静态方法
     */
    @Test
    public void demo2() throws OgnlException {

        OgnlContext context = new OgnlContext();

        Object root = context.getRoot();

        // 执行表达式：@类名@方法名
        Object obj = Ognl.getValue("@java.lang.Math@random()", context, root);

        System.out.println(obj);
    }


    /*
        访问Root中的数据 不需要加#
     */
    @Test
    public void demo3() throws OgnlException {

        OgnlContext context = new OgnlContext();

        User user = new User("aaa", "123456");
        context.setRoot(user);
        Object root = context.getRoot();
        Object username = Ognl.getValue("username", context, root);
        Object password = Ognl.getValue("password", context, root);
        System.out.println(username + "------" + password);
    }

    /*
        访问context中的数据 需要加#
     */
    @Test
    public void demo4() throws OgnlException{


        OgnlContext context = new OgnlContext();
        Object root = context.getRoot();

        // 向context中存入数据
        context.put("name","张三");

        Object obj = Ognl.getValue("#name",context,root);

         System.out.println(obj);
    }

}











