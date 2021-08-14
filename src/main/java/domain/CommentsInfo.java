package domain;

public class CommentsInfo {
    private boolean commentAllowed; // открыты ли комменты, аналог can_post
    private int commentCount;
    private int commentId;
    private String commentAuthorAvatar;
    private String commentAuthorName;
    private String commentDataTime;
    private String commentContent;

    // новые
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
}
