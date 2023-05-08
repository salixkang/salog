package com.myblog.salog.comment;

import com.myblog.salog.article.Article;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;


    public void create(Article article, String content) {
        Comment comment = new Comment();
        comment.setContent(content);
        comment.setCreateDate(LocalDateTime.now());
        comment.setArticle(article);
        this.commentRepository.save(comment);
    }
}