package com.itu.kratika.courseguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Plan4 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ExpandListAdapterFaq ExpAdapter;
    private ArrayList<groupFaq> ExpListItems;
    private ExpandableListView ExpandList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ExpandList = (ExpandableListView) findViewById(R.id.exp_list);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapterFaq(Plan4.this, ExpListItems);
        ExpandList.setAdapter(ExpAdapter);

        ExpandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                String group_name = ExpListItems.get(groupPosition).getName();

                ArrayList<childFaq> ch_list = ExpListItems.get(
                        groupPosition).getItems();

                String child_name = ch_list.get(childPosition).getName();

                // showToastMsg(group_name + "\n" + child_name);

                return false;
            }
        });

        ExpandList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                String group_name = ExpListItems.get(groupPosition).getName();
                // showToastMsg(group_name + "\n Expanded");

            }
        });

        ExpandList.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                String group_name = ExpListItems.get(groupPosition).getName();
                // showToastMsg(group_name + "\n Expanded");

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ExpandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                String group_name = ExpListItems.get(groupPosition).getName();

                ArrayList<childFaq> ch_list = ExpListItems.get(
                        groupPosition).getItems();

                String child_name = ch_list.get(childPosition).getName();

                //  showToastMsg(group_name + "\n" + child_name);

                return false;
            }
        });

        ExpandList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                String group_name = ExpListItems.get(groupPosition).getName();
                // showToastMsg(group_name + "\n Expanded");


            }
        });

        ExpandList.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                String group_name = ExpListItems.get(groupPosition).getName();
                //showToastMsg(group_name + "\n Expanded");

            }
        });
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.plan1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera)  //plan your schedule
        {
            Intent intent = new Intent(Plan4.this,PlanYourSchedule.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.discussion_forum)
        {
            //Intent intent = new Intent(Plan4.this,DiscussionForum.class);
            //startActivity(intent);
            //Intent intent = new Intent(Plan4.this, main_discussion_forum_list.class);
            //startActivity(intent);

        } else if (id == R.id.nav_slideshow)    //FAQs
        {
            Intent intent = new Intent(Plan4.this, faq.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage)   //Gettting into ITU
        {
            Intent intent = new Intent(Plan4.this, GettingIntoItu.class);
            startActivity(intent);
        } else if (id == R.id.nav_camera) {   //Plan Your Schedule
            Intent intent = new Intent(Plan4.this, PlanYourSchedule.class);
            startActivity(intent);


        } else if (id == R.id.nav_accomodation) {
            Intent intent = new Intent(Plan4.this, Accomodation.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public ArrayList<groupFaq> SetStandardGroups() {

        ArrayList<groupFaq> group_list = new ArrayList<groupFaq>();
        ArrayList<childFaq> child_list;

        // Setting Group 1
        child_list = new ArrayList<childFaq>();
        groupFaq gru1 = new groupFaq();
        gru1.setName("Plan 1");

        childFaq ch1_1 = new childFaq();
        ch1_1.setName("1st Sem:\n " +
                "SWE 500 (Core 1)\n" +
                "CSC 525 \n" +
                "CSC 560 \n" +
                "\n" +
                "2nd Sem:\n" +
                "CSC 518 \n" +
                "SWE 600 (Core 2)\n" +
                "CSC 512 \n" +
                "\n" +
                "3rd Sem:\n" +
                "SWE 602 (Core 3)\n" +
                "CSC 530 \n" +
                "SWE 680 (Core 4)\n" +
                "\n" +
                "\n" +
                "4th Sem:\n" +
                "Elective 1\n" +
                "CSC 633 \n" +
                "SWE 690 (Project or thesis)\n"+
                "Note: This plan will help you complete most of your pre-requisite courses in the first semester.");
        child_list.add(ch1_1);



        gru1.setItems(child_list);

        // Setting Group 2
        child_list = new ArrayList<childFaq>();
        groupFaq gru2 = new groupFaq();
        gru2.setName("Plan 2");

        childFaq ch2_1 = new childFaq();
        ch2_1.setName("1st Sem:\n" +
                "SWE 610 \n" +
                "CSC 511 \n" +
                "CSC 512 \n" +
                "\n" +
                "\n" +
                "2nd Sem:\n" +
                "SWE 500 (Core 1)\n" +
                "CSC 525 \n" +
                "CSC 509 \n" +
                "\n" +
                "\n" +
                "3rd Sem:\n" +
                "SWE 600 (Core 2)\n" +
                "SWE 680 \n" +
                "CSC 527 \n" +
                "\n" +
                "\n" +
                "4th Sem:\n" +
                "SWE 602 (Core 3)\n" +
                "Elective 1\n" +
                "SWE 690 (Project or thesis)\n");
        child_list.add(ch2_1);

        gru2.setItems(child_list);

        // Setting Group 3
        child_list = new ArrayList<childFaq>();
        groupFaq gru3 = new groupFaq();
        gru3.setName("Plan 3");

        childFaq ch3_1 = new childFaq();
        ch3_1.setName("1st Sem:\n" +
                "CSC 525\n" +
                "SWE 500 (Core 1) \n" +
                "CSC 530 \n" +
                "\n" +
                "\n" +
                "2nd Sem:\n" +
                "CSC 615 \n" +
                "SWE 600 (Core 2) \n" +
                "CSC 680 \n" +
                "\n" +
                "\n" +
                "3rd Sem:\n" +
                "CSC 525 (Technical writing)\n" +
                "SWE 602 (Core 3) \n" +
                "SWE 680 (Core 4) \n" +
                "\n" +
                "\n" +
                "4th Sem:\n" +
                "CSC 633 (Core 3)\n" +
                "Elective 1\n" +
                "SWE 690 (Project or thesis)\n" +
                "Note:\n"+" 1. This plan will help to complete all the pre-requisites in first semester. \n"+
                "2. It is always recommended to complete SWE 500 first and then take SWE 600.\n"+
                "3. CSC 525 and CSC 530 are both required to enroll for CSC 615.");
        child_list.add(ch3_1);

        gru3.setItems(child_list);

        // Setting Group 4
        child_list = new ArrayList<childFaq>();
        groupFaq gru4 = new groupFaq();
        gru4.setName("Plan 4");

        childFaq ch4_1 = new childFaq();
        ch4_1.setName(
                "1st Sem:\n" +
                        "1st Sem:\n" +
                        "SWE 561\n" +
                        "SWE 562\n" +
                        "SWE 500\n" +
                        "\n" +
                        "2nd Sem:\n" +
                        "SWE 600  (Core 1)\n" +
                        "CSC 631 \n" +
                        "CSC 525 \n" +
                        "\n" +
                        "3rd Sem:\n" +
                        "SWE 680 (Core 2)\n" +
                        "SWE 602 (Core 3)\n" +
                        "Elective 1\n" +
                        "\n" +
                        "4th Sem:\n" +
                        "CSC 545 \n" +
                        "CSC 625 \n" +
                        "SWE 690 (Project or thesis) \n" +
                        "Note:\n 1. If you have basic knowledge of HTML its better to skip 525 and take course CSC 625.\n" +
                        "\n2 ");
        child_list.add(ch4_1);

        gru4.setItems(child_list);

        //listing all groups
        group_list.add(gru1);
        group_list.add(gru2);
        group_list.add(gru3);
        group_list.add(gru4);


        return group_list;
    }

    public void showToastMsg(String Msg) {
        Toast.makeText(getApplicationContext(), Msg, Toast.LENGTH_SHORT).show();
    }

}


