package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer like;

    private List<Comment> comments = new ArrayList<>();

    Post() {

    }

    public Post(Date moment, String title, String content, Integer like) {

        this.moment = moment;
        this.title = title;
        this.content = content;
        this.like = like;
    }

    // getter e setter
    public String getContent() {
        return content;
    }

    public Integer getLike() {
        return like;
    }

    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public List<Comment> getComment() {
        return comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(like);
        sb.append("Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

}
