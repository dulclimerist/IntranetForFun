package com.IntranetForFun.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
    private CommentId commentId;
    private String text;

    @EmbeddedId
    public CommentId getCommentId() {
        return commentId;
    }

    public void setCommentId(CommentId commentId) {
        this.commentId = commentId;
    }

    @Column(length = 5000)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
