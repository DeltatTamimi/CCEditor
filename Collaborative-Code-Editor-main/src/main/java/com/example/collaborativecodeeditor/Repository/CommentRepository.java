package com.example.collaborativecodeeditor.Repository;

import com.example.collaborativecodeeditor.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByFileId(Long fileId);
}
