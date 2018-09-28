package com.qq.springcloud_provider.manager;

import com.qq.springcloud_provider.entity.Word;
import com.qq.springcloud_provider.mapper.WordMapper;
import com.qq.springcloud_provider.service.WordService;
import com.qq.springcloud_provider.vo.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WordServiceImpl implements WordService {
    @Resource()
    private WordMapper wordMapper;
    @Override
    public R save(Word word) {
        if (wordMapper.insert(word) > 0){
            return new R(200,"ok");
        } else {
            return new R(404,"error");
        }
    }

    @Override
    public List<Word> queryByFlag(int flag) {
        return wordMapper.selectAll(flag);
    }
}
