package com.myblog.salog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Optional;

import com.myblog.salog.article.Article;
import com.myblog.salog.article.ArticleRepository;
import com.myblog.salog.comment.Comment;
import com.myblog.salog.comment.CommentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SalogApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private CommentRepository commentRepository;
	@Test
	void testJpa() {
		Optional<Article> oa = this.articleRepository.findById(1);
		assertTrue(oa.isPresent());
		Article a = oa.get();

		Comment c = new Comment();
		c.setContent("Test Comment 1");
		c.setArticle(a);
		c.setCreateDate(LocalDateTime.now());
		this.commentRepository.save(c);
	}

}
