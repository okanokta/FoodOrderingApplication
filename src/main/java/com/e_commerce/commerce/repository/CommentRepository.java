package com.e_commerce.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.commerce.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
