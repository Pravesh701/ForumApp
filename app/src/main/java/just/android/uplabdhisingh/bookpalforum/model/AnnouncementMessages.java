package just.android.uplabdhisingh.bookpalforum.model;

public class AnnouncementMessages
{
    private String newBookTitle, newBookAuthor, newBookDesc;

    public AnnouncementMessages(String newBookTitle, String newBookAuthor, String newBookDesc)
    {
        this.newBookTitle=newBookTitle;
        this.newBookAuthor=newBookAuthor;
        this.newBookDesc=newBookDesc;
    }

    public String getNewBookTitle()
    {
        return newBookTitle;
    }

    public String getNewBookAuthor()
    {
        return newBookAuthor;
    }

    public String getNewBookDesc()
    {
        return newBookDesc;
    }

}
