package com.java2nb.common.service;

import com.java2nb.common.domain.LogDO;
import com.java2nb.common.domain.PageDO;
import com.java2nb.common.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
    void save(LogDO logDO);
    PageDO<LogDO> queryList(Query query);
    int remove(Long id);
    int batchRemove(Long[] ids);
}
