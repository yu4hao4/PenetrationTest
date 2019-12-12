//package yuhao.PenetrationTest;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.net.URI;
//
///**
// * @author 喻浩
// * @create 2019-12-11-22:28
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class TestApi {
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    public void listAll() {
////        // 封装 JSON 参数
////        String param = "{formulas:[{'name':'总收入=','value':'基本工资+工龄工资+基本课时费+星级课时费+招生奖金+交通补助+加班/请假+管理工资+管理绩效+新生补课+试听报名+个人养老+个人医疗+实发工资+学校代交保险+应发工资+全勤奖*公积金+伯乐奖+(课时费/人数*人次数)+(课时费/星级*星级)'},{'name':'个人养老=','value':'测试1+测试2'},{'name':'个人医疗=','value':'测试3+测试4'}]}";
//
//        // 1、使用postForObject请求接口
//        URI result = restTemplate.postForLocation("/test",null);
//        System.out.println("result1==================" + result);
//    }
//}
