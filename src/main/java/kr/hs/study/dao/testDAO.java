package kr.hs.study.dao;

import kr.hs.study.dto.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class testDAO {
    //실제 디비에 접속해서 쿼리를 날림
    //쿼리 날리는 애 : JdbcTemplate class
    //저장 (insert)
    @Autowired
    JdbcTemplate jdbc;
    public void insert(testDTO dto){

        String sql = "insert into test values (?, ?)";
        jdbc.update(sql, dto.getData1(), dto.getData2());
    }
    public void update(testDTO dto){
        // data1 = 2인 애의 data2를 spring22222로 변경
        String sql = "update test SET data2 = ? WHERE data1 = ?";
        jdbc.update(sql, dto.getData2(), dto.getData1());
    }

    public void delete(testDTO dto){
        //data1이 1인 애 삭제
        String sql = "delete FROM test where data1 = ?";
        jdbc.update(sql, dto.getData1());
    }
}

