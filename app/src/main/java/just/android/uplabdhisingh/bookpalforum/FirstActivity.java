package just.android.uplabdhisingh.bookpalforum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity
{

    Button loginButton;
    TextView registerTextView;

    public String announcementTitle, announcementAuthor, announcementDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        getAnnouncementMessages();

        loginButton = (Button) findViewById(R.id.btn_login);
        registerTextView = (TextView) findViewById(R.id.tv_register_link);

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(FirstActivity.this,HomePageActivity.class);
                intent.putExtra("title",announcementTitle);
                intent.putExtra("author",announcementAuthor);
                intent.putExtra("desc",announcementDescription);
                startActivity(intent);
            }
        });

        registerTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(FirstActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }


    public void getAnnouncementMessages()
    {
        Bundle extras = getIntent().getExtras();
        if(extras!=null && extras.containsKey("BOOK_TITLE") && extras.containsKey("BOOK_AUTHOR") && extras.containsKey("BOOK_DESC") )
        {
            announcementTitle = extras.getString("BOOK_TITLE");
            announcementAuthor = extras.getString("BOOK_AUTHOR");
            announcementDescription = extras.getString("BOOK_DESC");

            Log.d("MESSAGE","ERROR MESSAGE \n\n\n"+announcementTitle);
        }
    }
}
