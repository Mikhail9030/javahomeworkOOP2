package ru.netology.domain;

public class PostComment {
    private String id;
    private String imageUrl;
    private String name;
    private String genre;
    private PostComment() comments;

    private boolean isGroupsCanPost(){
        return groupsCanPost;

    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public PostComment[] getComments() {
        return comments;
    }

    public void setComments(PostComment[] comments) {
        this.comments = comments;
    }



}
