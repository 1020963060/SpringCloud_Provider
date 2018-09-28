package com.qq.springcloud_provider.mapper;

import com.qq.springcloud_provider.entity.Word;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WordMapper {
    //新增
    @Insert("insert into t_word (word1,word2,createdate,flag) values(#{word1},#{word2},now(),1)")
    int insert(Word word);
    //查询
    @Select("select * from t_word where flag = #{flag}")
    @ResultType(Word.class)
    List<Word> selectAll(int flag);
}
