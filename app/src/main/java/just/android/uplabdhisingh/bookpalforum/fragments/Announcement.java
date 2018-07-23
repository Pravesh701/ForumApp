package just.android.uplabdhisingh.bookpalforum.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import just.android.uplabdhisingh.bookpalforum.R;
import just.android.uplabdhisingh.bookpalforum.adapter.AnnouncementMessageAdapter;
import just.android.uplabdhisingh.bookpalforum.model.AnnouncementMessages;

public class Announcement extends Fragment
{

    List<AnnouncementMessages> announcementMessagesList;
    AnnouncementMessageAdapter announcementMessageAdapter;

    ListView announcementsListView;

    public Announcement(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View announcement_view = inflater.inflate(R.layout.announcement_fragment,container,false);

        Bundle b3 = getArguments();

        String title = b3.getString("book_title");
        String author = b3.getString("book_author");
        String description = b3.getString("book_desc");

        announcementsListView = (ListView) announcement_view.findViewById(R.id.lv_announcements);

        AnnouncementMessages announcementMessages = new AnnouncementMessages(title,author,description);
        announcementMessagesList = new ArrayList<>();
        announcementMessagesList.add(announcementMessages);
        announcementMessageAdapter = new AnnouncementMessageAdapter((Activity) getContext(),R.layout.announcement_messages,announcementMessagesList);
        announcementsListView.setAdapter(announcementMessageAdapter);

//        Bundle b=getIntent().getExtras();
//        String n= b.getString("name_key");
//        String a=b.getString("kuchbhi");



        return announcement_view;
    }
}
