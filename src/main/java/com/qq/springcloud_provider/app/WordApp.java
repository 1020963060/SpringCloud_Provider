package com.qq.springcloud_provider.app;

import com.qq.springcloud_provider.entity.Word;
import com.qq.springcloud_provider.service.WordService;
import com.qq.springcloud_provider.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordApp {
    @Autowired
    private WordService wordService;
    //新增
    @PostMapping("/wordsave.do")
    public R save(Word word) {
        return wordService.save(word);
    }
    //查询
    @GetMapping("/wordlist.do")
    public List<Word> list(int flag) {
        return wordService.queryByFlag(flag);
    }
}
