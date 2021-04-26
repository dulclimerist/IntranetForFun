package com.IntranetForFun.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
    private VoteId voteId;
    private boolean upvote;

    public boolean isUpvote() {
        return upvote;
    }

    public void setUpvote(boolean upvote) {
        this.upvote = upvote;
    }

    @EmbeddedId
    public VoteId getVoteId() {
        return voteId;
    }

    public void setVoteId(VoteId voteId) {
        this.voteId = voteId;
    }
}
