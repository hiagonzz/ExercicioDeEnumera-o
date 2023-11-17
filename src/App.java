import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1  = new Comment("Have a nice trip");
        Comment c2  = new Comment ("wow that's awesome!");
        Post p1  =  new Post(sdf.parse("21/06/2018 13:05:59"), "traveling to new zealand ", "I'm gonig to visit this wonderful country", 12);
    
    
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
