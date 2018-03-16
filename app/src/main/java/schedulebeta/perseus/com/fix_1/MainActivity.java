package schedulebeta.perseus.com.fix_1;


import android.app.DialogFragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import schedulebeta.perseus.com.fix_1.Menu_Fragments.FragmentInfo;
import schedulebeta.perseus.com.fix_1.Menu_Fragments.FragmentMessager;
import schedulebeta.perseus.com.fix_1.Menu_Fragments.FragmentNotifications;
import schedulebeta.perseus.com.fix_1.Menu_Fragments.FragmentShare;
import schedulebeta.perseus.com.fix_1.Menu_Fragments.ListGroupFragment;
import schedulebeta.perseus.com.fix_1.Menu_Fragments.MainFragment;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView = null;
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MainFragment mainFragment = new MainFragment();
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.schedule, mainFragment);
        fragmentTransaction.commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        initBottomNavigationView();

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
//comment
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.calendar) {
            DialogFragment newFragment = new DataPickerFragment();
            newFragment.show(getFragmentManager(), "date picker");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_schedule) {
            MainFragment mainFragment = new MainFragment();
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.schedule, mainFragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_list_group) {
            ListGroupFragment mainFragment = new ListGroupFragment();
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.schedule, mainFragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_notify) {
            FragmentNotifications mainFragment = new FragmentNotifications();
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.schedule, mainFragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_send) {
            FragmentMessager mainFragment = new FragmentMessager();
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.schedule, mainFragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_share) {
            FragmentShare mainFragment = new FragmentShare();
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.schedule, mainFragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_info) {
            FragmentInfo mainFragment = new FragmentInfo();
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.schedule, mainFragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void initBottomNavigationView() {
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.getMenu().getItem(2).setChecked(true);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.bnv_group:
                                selectedFragment = new ListGroupFragment();
                                break;
                            case R.id.bnv_notifications:
                                selectedFragment = new FragmentNotifications();
                                break;
                            case R.id.bnv_schedule:
                                selectedFragment = new MainFragment();
                                break;
                            case R.id.bnv_message:
                                selectedFragment = new FragmentMessager();
                                break;
                            case R.id.bnv_share:
                                selectedFragment = new FragmentShare();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.schedule, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });
    }

}