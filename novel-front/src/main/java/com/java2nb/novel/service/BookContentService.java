package com.java2nb.novel.service;

import com.java2nb.novel.entity.BookContent;

public interface BookContentService {

    BookContent queryBookContent(Long bookId, Long bookIndexId);

}
