package domain;

public class Post {

    private int postId; // id
    private String postDataTime; // аналог date, в документации int

    private int groupId; // аналог owner_id
    private String groupLogo;
    private String groupName;
    private String groupUrl;

    private PostContent postContent; // - аналог text и attachments
    private LikeInfo likeInfo; // likes
    private RepostInfo repostInfo; // reposts

    private int postViewsCounter; // в документации тип object с единственным полем

    private CommentsInfo commentsInfo; // comments

    // новые из документации
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly; // boolean вместо int
    private String postType;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private int postponedId;

    // + get/set на все поля
}
