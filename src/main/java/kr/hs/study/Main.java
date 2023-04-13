package kr.hs.study;

import kr.hs.study.config.BeanConfig;
import kr.hs.study.dao.testDAO;
import kr.hs.study.dto.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        //testDAO 가지고오기
        testDAO dao = ctx.getBean(testDAO.class);

        //데이터 저장할 bean 생성
        testDTO t = new testDTO();
        //insert부분
//        t.setData1(1);
//        t.setData2("spring1");
//        dao.insert(t);
//        System.out.println("inserted");

        //update부분
//        t.setData1(1);
//        t.setData2("spring22222");
//        dao.update(t);
//        System.out.println("update");

        //delete부분
//        t.setData1(1);
//        t.setData2("spring22222");
//        dao.delete(t);
//        System.out.println("delete!");

//        3, spring
//        2, spring

        //select 할 땐 mapper클래스가 필요하다. dto와 dao사이에 mapper 클래스가 있음.
        ctx.close();
    }
}