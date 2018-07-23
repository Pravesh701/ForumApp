package just.android.uplabdhisingh.bookpalforum.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import just.android.uplabdhisingh.bookpalforum.R;
import just.android.uplabdhisingh.bookpalforum.model.AnnouncementMessages;

public class AnnouncementMessageAdapter extends ArrayAdapter<AnnouncementMessages>
{
    TextView newBookTitleTextView, newBookAuthorTextView, newBookDescTextView;

    public AnnouncementMessageAdapter(Context context, int resource, List<AnnouncementMessages> objects)
    {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if(convertView == null)
        {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.announcement_messages,parent,false);
        }

        newBookTitleTextView = (TextView) convertView.findViewById(R.id.tv_newBookTitle);
        newBookAuthorTextView = (TextView) convertView.findViewById(R.id.tv_newBookAuthor);
        newBookDescTextView = (TextView) convertView.findViewById(R.id.tv_newBookDescription);

        AnnouncementMessages announcementMessages = getItem(position);

        newBookTitleTextView.setText(announcementMessages.getNewBookTitle());
        newBookAuthorTextView.setText(announcementMessages.getNewBookAuthor());
        newBookDescTextView.setText(announcementMessages.getNewBookDesc());

        return convertView;
    }
}
