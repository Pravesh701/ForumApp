package just.android.uplabdhisingh.bookpalforum;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import just.android.uplabdhisingh.bookpalforum.fragments.Announcement;
import just.android.uplabdhisingh.bookpalforum.fragments.Forum;
import just.android.uplabdhisingh.bookpalforum.fragments.Recommendation;

import static just.android.uplabdhisingh.bookpalforum.R.id.*;

public class DashboardActivity extends AppCompatActivity
{
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public String announcementTitle, announcementAuthor, announcementDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();

       // Announcement announcement = new Announcement();
        announcementTitle = getIntent().getStringExtra("title");
        announcementAuthor = getIntent().getStringExtra("author");
        announcementDescription = getIntent().getStringExtra("desc");

        Log.d("MESSAGE","ERROR MESSAGE \n\n"+announcementTitle);

//        Bundle announcementMessagesBundle = new Bundle();
//
//
//        announcementMessagesBundle.putString("book_title",announcementTitle);
//      announcementMessagesBundle.putString("book_author",announcementAuthor);
//      announcementMessagesBundle.putString("book_desc",announcementDescription);
//      announcement.setArguments(announcementMessagesBundle);

        FragmentManager manager = getSupportFragmentManager();
        final  android.support.v4.app.FragmentTransaction t=manager.beginTransaction();
        final Announcement m4=new Announcement();

        Bundle b2=new Bundle();
        b2.putString("book_title",announcementTitle);
        b2.putString("book_author",announcementAuthor);
        b2.putString("book_desc",announcementDescription);
        m4.setArguments(b2);
       // t.add(R.id.viewpager);
        t.commit();


    }


    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Announcements");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_announcement_white_24dp, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Forum");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_forum_white_24dp, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Recommendations");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_comment_white_24dp, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }

    private void setupViewPager(ViewPager viewPager)
    {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Announcement(), "Announcements");
        adapter.addFragment(new Forum(), "Forum");
        adapter.addFragment(new Recommendation(), "Recommendations");

        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter
    {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager)
        {
            super(manager);
        }

        @Override
        public Fragment getItem(int position)
        {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount()
        {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title)
        {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            return mFragmentTitleList.get(position);
        }
    }

}
