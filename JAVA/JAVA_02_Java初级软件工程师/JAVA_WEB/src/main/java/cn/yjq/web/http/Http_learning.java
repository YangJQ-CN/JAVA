package cn.yjq.web.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Http_learning
 * @Date 2020/10/14 11:11
 * @Author YangJQ
 * @Description Http学习
 *
 *      Http协议：超文本传输协议
 *
 *          规范了浏览器和服务器交互的数据格式
 *
 *          1.简单快捷：只需要传送请求方法和路径。
 *              请求方法：
 *                  1.0版本
 *                      GET 请求指定页面信息，并返回实体主体
 *                      POST 向指定资源提交数据进行处理请求（例如表单提交，上传文件）数据包含在请求体中，POST请求可能会导致新的资源的简历或已有资源的修改
 *                      HEDA 类似于GET请求，只比不过返回的响应中没有具体的内容，用于获取报文头
 *                  1.1版本
 *                      PUT 从客户端向服务器传送的数据取代指定文档的内容
 *                      DELETE 请求服务器删除指定的页面
 *                      CONNECT HTTP协议中预留给能够将连接改为管道方式的代理服务器
 *                      OPTIONS 允许客户端查看服务器的性能
 *                      TRACE 辉县服务器收到的请求，主要用于测试或诊断
 *                      PATCH 是对PUT方法的补充，用来对已知资源进行局部更新。
 *
 *
 **/
public class Http_learning {



    @Test
    public void get_test() {

        try{
            URL url = new URL("http://localhost:8080/JAVA_WEB_war_exploded/Servlet_learning");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);//设置该链接是可以输出的
            connection.setRequestMethod("GET");//设置请求方式
            connection.setRequestProperty("Content-Type", "application/x-ww-from-urlencoded; charset=UTF-8");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                result.append(line + "\n");
            }

            connection.disconnect();

            System.out.println(result.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Post方法发送form表单
     */
    @Test
    public void post_test_form() {
        try {
            URL url = new URL("http://localhost:8080/JAVA_WEB_war_exploded/Servlet_learning");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true); // 设置可输入
            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

            PrintWriter pw = new PrintWriter(new BufferedOutputStream(connection.getOutputStream()));
            pw.write("code=001&name=测试");
            pw.flush();
            pw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();

            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Post方法发送json数据
     */
    @Test
    public void post_test_json() {
        try {
            URL url = new URL("http://localhost:8080/JAVA_WEB_war_exploded/Servlet_learning");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoInput(true); // 设置可输入
            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");

            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("code", "001");
            data.put("name", "测试");
            PrintWriter pw = new PrintWriter(new BufferedOutputStream(connection.getOutputStream()));
            pw.write(objectMapper.writeValueAsString(data));
            pw.flush();
            pw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();

            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
