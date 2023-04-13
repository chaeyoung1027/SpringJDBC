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
//        t.setData1(1);
//        t.setData2("spring1");
//        dao.insert(t);
//        System.out.println("inserted");
//        t.setData1(1);
//        t.setData2("spring22222");
//        dao.update(t);
//        System.out.println("update");
        t.setData1(1);
        t.setData2("spring22222");
        dao.delete(t);
        System.out.println("delete!");

//        3, spring
//        2, spring

        ctx.close();
    }
}