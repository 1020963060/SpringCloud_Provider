package com.qq.springcloud_provider.service;

import com.qq.springcloud_provider.entity.Word;
import com.qq.springcloud_provider.vo.R;

import java.util.List;

public interface WordService {
    R save(Word word);
    List<Word> queryByFlag(int flag);
}
