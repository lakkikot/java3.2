package domain;

public class PostContent {
    private String postText;
    private String postMedia;
    private String postLink; // имеется в виду предпросмотр ссылки
    private String postArticle; // блок с кнопкой "Читать"
    private boolean postArticleFav; // добавлен ли предыдущий блок в избранное - вероятно, аналог "is_favorite"
}
