package just.android.uplabdhisingh.bookpalforum;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    String title,author,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        title = getIntent().getStringExtra("title");
        author = getIntent().getStringExtra("author");
        desc = getIntent().getStringExtra("desc");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_announcements)
        {
            Intent intent = new Intent(HomePageActivity.this,DashboardActivity.class);
            intent.putExtra("title",title);
            intent.putExtra("author",author);
            intent.putExtra("desc",desc);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_forum)
        {
            Intent intent = new Intent(HomePageActivity.this,DashboardActivity.class);
            intent.putExtra("title",title);
            intent.putExtra("author",author);
            intent.putExtra("desc",desc);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_recommendations)
        {
            Intent intent = new Intent(HomePageActivity.this,DashboardActivity.class);
            intent.putExtra("title",title);
            intent.putExtra("author",author);
            intent.putExtra("desc",desc);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_feedback)
        {

        } else if (id == R.id.nav_share)
        {

        } else if (id == R.id.nav_contact_us)
        {

        } else if (id == R.id.nav_account_settings)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
