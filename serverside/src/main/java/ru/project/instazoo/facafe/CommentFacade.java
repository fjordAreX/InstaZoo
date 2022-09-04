package ru.project.instazoo.facafe;

import org.springframework.stereotype.Component;

import ru.project.instazoo.dto.CommentDTO;
import ru.project.instazoo.entity.Comment;

@Component
public class CommentFacade {

    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());

        return commentDTO;
    }

}

