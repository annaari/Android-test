package com.test.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    public static final String EXTRA_MESSAGE = "com.halcyonmobile.learning.myapplication.MESSAGE";
    private MenuItem menuItem;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setActionBar(myToolbar);
        myToolbar.inflateMenu(R.menu.menu);
        Switch dark_switch = findViewById(R.id.switch_design);

    }

/**
 * drawerLayout = findViewById(R.id.drawer_layout);
 * <p>
 * //ActionBar.NavigationMode navigationView = findViewById(R.id.navigationView);
 * <p>
 * ActionBar actionbar = getSupportActionBar();
 * actionbar.setDisplayHomeAsUpEnabled(true);
 * actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
 * <p>
 * drawerLayout.addDrawerListener(
 * new DrawerLayout.DrawerListener() {
 *
 * @Override public void onDrawerSlide(View drawerView, float slideOffset) {
 * // Respond when the drawer's position changes
 * }
 * @Override public void onDrawerOpened(View drawerView) {
 * // Respond when the drawer is opened
 * }
 * @Override public void onDrawerClosed(View drawerView) {
 * // Respond when the drawer is closed
 * }
 * @Override public void onDrawerStateChanged(int newState) {
 * // Respond when the drawer motion state changes
 * }
 * }
 * );
 * Called when the user clicks the Send button
 */
    /**
     * Called when the user clicks the Send button
     */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,
                DisplayMessageActivity.class);
        EditText editTextArtist = findViewById(R.id.artist);
        EditText editTextSong = findViewById(R.id.song);
        String artist = editTextArtist.getText().toString();
        String song = editTextSong.getText().toString();

        Music music = new Music(artist, song);
        intent.putExtra("Music", music);
        startActivity(intent);
    }


    /**
     * @Override public boolean onOptionsItemSelected(MenuItem item) {
     * switch (item.getItemId()) {
     * case android.R.id.home:
     * drawerLayout.openDrawer(GravityCompat.START);
     * return true;
     * }
     * return super.onOptionsItemSelected(item);
     * }
     */


    public void newLayout(View view) {
        Intent intent = new Intent(this,
                RecyclerViewActivity.class);
        startActivity(intent);

    }

    public void newViewPager(View view) {
        Intent intent = new Intent(this,ViewPagerActivity.class);
        startActivity(intent);
    }
}