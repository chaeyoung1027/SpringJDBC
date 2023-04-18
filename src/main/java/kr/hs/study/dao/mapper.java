package kr.hs.study.dao;

import kr.hs.study.dto.testDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class mapper implements RowMapper<testDTO> {
    @Override
    public testDTO mapRow(ResultSet rs, int i ) throws SQLException{
        testDTO t = new testDTO();

        //rs에 있는 값을 dto에 넣어주는 과정
        t.setData1(rs.getInt("data1"));
        t.setData2(rs.getString("data1"));
        return t;
    }
}
