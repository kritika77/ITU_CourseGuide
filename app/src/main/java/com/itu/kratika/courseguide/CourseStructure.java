package com.itu.kratika.courseguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CourseStructure extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private AnimatedExpandableListView listView;
    private ExampleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_structure);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<GroupItem> items = new ArrayList<GroupItem>();


        GroupItem item1 = new GroupItem();
        item1.title = "SWE 500 Software Engineering";
        ChildItem child = new ChildItem();
        child.title = "The course introduces\n" +
                "traditional and contemporary approaches to software engineering\n" +
                "practice. These include: requirements development,\n" +
                "architecture and detailed design, modeling, testing strategies,\n" +
                "process selection, project management, how to interact with\n" +
                "other engineers on large-scale systems.";
        child.hint = "Professors: Richard Riehle, Qamar Asghar";
        item1.items.add(child);
        items.add(item1);

        GroupItem item2 = new GroupItem();
        item2.title = "SWE 600 Advanced Software Engineering";
        ChildItem child2 = new ChildItem();
        child2.title = "Integrated approach to software design and development including requirements elicitation and analysis, system design and construction through studying multiple facets of software development processes, design methodologies, modeling approaches, and implementation techniques. Prerequisite: SWE 500 or instructor consent. ";
        child2.hint ="Professors: Richard Riehle, Qamar Asghar";
        item2.items.add(child2);
        items.add(item2);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GroupItem item3 = new GroupItem();
        item3.title = "SWE 602 Software Requirements Elicitation";
        ChildItem child3 = new ChildItem();
        child3.title = " In this course, we expand our understanding of software\n" +
                "modeling to include real time, concurrency, and embedded\n" +
                "systems software engineering. It also goes into more depth in\n" +
                "software metrics, project estimation techniques, risk management,\n" +
                "software reliability, new and emerging directions for\n" +
                "software development.";
        child3.hint = "Professors: Richard Riehle, Tony Nguyen";
        item3.items.add(child3);
        items.add(item3);

        GroupItem item4 = new GroupItem();
        item4.title = "SWE 680 Software Architecture";
        ChildItem child4 = new ChildItem();
        child4.title = "The course\n" +
                "interests will include the requirements development, system\n" +
                "context, and relationships between the various components\n" +
                "and structures in a software architecture. Prerequisite: SWE 600, or instructor consent.";
        child4.hint = "Professors: Richard Riehle, Srinivasan Mandyam";
        item4.items.add(child4);
        items.add(item4);

        GroupItem item5 = new GroupItem();
        item5.title = "CSC 501 Discrete Structures";
        ChildItem child5 = new ChildItem();
        child5.title = "In-depth study of the principles and architecture of Internet protocols in current practice. Analysis of protocols of network, transport, and application layers. Topics will also cover emerging network architecture and protocols. Network analysis project.. Prerequisite: CMPE 206 or instructor consent.";
        child5.hint = "Professors: Alex Wu";
        item5.items.add(child5);
        items.add(item5);

        GroupItem item6 = new GroupItem();
        item6.title = "CSC 680 Advanced Computer Algorithms";
        ChildItem child6 = new ChildItem();
        child6.title = "Network security protocols and applications, cryptography algorithms, authentication systems, intrusion detection, network attacks and defenses, system-level security issues, and how to build secure systems. Prerequisite: CMPE 206 or EE 281.";
        child6.hint = "Professors: Richard Sun";
        item6.items.add(child6);
        items.add(item6);

        GroupItem item8 = new GroupItem();
        item8.title = "CSC 670 Network and Data Security ";
        ChildItem child8 = new ChildItem();
        child8.title = "The course covers development and implementation of Software-defined Networks and Network Functions Virtualization for building programmable network applications. It includes their concepts with various use cases. Students conduct a network programming project related to SDN/NFV by using open source projects. Prerequisite: CMPE 206 (or equivalent graduate network courses) or instructor consent.";
        child8.hint = "Professors: Tony Nguyen";
        item8.items.add(child8);
        items.add(item8);

        GroupItem item9 = new GroupItem();
        item9.title = "ICS 601 Advanced Cyber Security";
        ChildItem child9 = new ChildItem();
        child9.title = "Introduction to SoC system configuration and integration; on chip protocols; assertion based verification; code and functional coverage metrics; methodologies, tools, and environments for functional verification of special function blocks (IPs) and integrated SoC-based computer systems. Prerequisite: CMPE 200 and CMPE 264 or instructor consent.";
        child9.hint = "Professors: Tony Nguyen";
        item9.items.add(child9);
        items.add(item9);

        GroupItem item10 = new GroupItem();
        item10.title = "CSC 580 Computer Algorithms";
        ChildItem child10 = new ChildItem();
        child10.title = "This course will cover algorithm design, sorting, searching,\n" +
                "graph algorithms, stacks, queues, and dictionary implementations,\n" +
                "divide and conquer algorithms, dynamic programming,\n" +
                "randomized algorithms, amortized analysis, lower bound\n" +
                "analysis, NP-Completeness";
        child10.hint = "Professors: Leandro Loss";
        item10.items.add(child10);
        items.add(item10);

        GroupItem item11 = new GroupItem();
        item11.title = "SWE 561 Cloud Computing";
        ChildItem child11 = new ChildItem();
        child11.title = "Prerequisites: Knowledge of Operating Systems\n" +
                "Introduction to cloud computing, cloud architecture and service\n" +
                "models, the economics and benefits of cloud computing,\n" +
                "horizontal/vertical scaling, thin client, multimedia content\n" +
                "distribution, multiprocessor and virtualization, distributed\n" +
                "storage, security and federation / presence/ identity/ privacy\n" +
                "in cloud computing";
        child11.hint = "Professors: Tony Nguyen";
        item11.items.add(child11);
        items.add(item11);

        GroupItem item12 = new GroupItem();
        item12.title = "CSC 518 OO Programming with Java";
        ChildItem child12 = new ChildItem();
        child12.title = "Architecture of a computing system including system bus, memory subsystems and peripherals. Unidirectional and bidirectional bus architectures. SRAM, SDRAM and FLASH memories. Design of DMA, interrupt controller, transmitter/receiver, timer, display adapter, A/D and D/A converters and other system peripherals. Design of memory and peripheral bus interfaces. Prerequisite: CMPE 127 or instructor consent. Computer Engineering and Software Engineering majors only.";
        child12.hint = "Professors: Victor Yu";
        item12.items.add(child12);
        items.add(item12);

        GroupItem item13 = new GroupItem();
        item13.title = "CSC 502 Principles of OS and Distributed Systems";
        ChildItem child13 = new ChildItem();
        child13.title = "The course begins with basic principles of a monolithic OS,\n" +
                "as exemplified by Linux, MacOS, and Windows, then advances\n" +
                "to more sophisticated details of processes, preemptive\n" +
                "multiprocessing, lightweight processes, and interrupts various\n" +
                "types of interprocess communications, demons, file systems,\n" +
                "signals, and paging, which are present on each independent\n" +
                "node of the network";
        child13.hint = "Professors: Harry Li, Arijit Das";
        item13.items.add(child13);
        items.add(item13);

        GroupItem item14 = new GroupItem();
        item14.title = "CSC 633 Machine Learning ";
        ChildItem child14 = new ChildItem();
        child14.title = "Experiments dealing with advanced embedded software programming concepts, interfacing techniques, hardware organization and software development using an embedded systems. Individual projects. Prerequisite: CMPE 200, CMPE 220 or instructor consent.";
        child14.hint = "Professors: Leandro Loss";
        item14.items.add(child14);
        items.add(item14);

        GroupItem item15 = new GroupItem();
        item15.title = "CEN 556 Distributed Computing Systems";
        ChildItem child15 = new ChildItem();
        child15.title = "Advanced topics in register-transfer-level design of complex digital functional blocks, application-specific instruction set processors, and system-level integration/validation using Verilog/VHDL/C-level hardware description languages. Prerequisite: CMPE 200 or instructor consent.";
        child15.hint = "Professors: Arijit Das";
        item15.items.add(child15);
        items.add(item15);


        GroupItem item16 = new GroupItem();
        item16.title = "SWE 695 Master’s Thesis";
        ChildItem child16 = new ChildItem();
        child16.title = "It is recommended to take project part A in your third/fourth semester after clearing all of the pre-requisite, Technical writing (CMPE 294), minimum 2 core and minimum 2 specialization courses. Student should have GPA not less than 3.0.";
        child16.hint = "Project Advisor: Richard Riehle, Victor Yu";
        item16.items.add(child16);
        items.add(item16);

        GroupItem item17 = new GroupItem();
        item17.title = "SWE 690 Capstone Project";
        ChildItem child17 = new ChildItem();
        child17.title = "Prerequisites: Department Chair approval and completion of\n" +
                "27 credit hours of the MSSE program.\n" +
                "The capstone project is a report, analysis, software project, or\n" +
                "program, submitted by a graduate student. It is designed to\n" +
                "demonstrate the in-depth learning and higher-order-thinking of\n" +
                "the student.";
        child17.hint = "Project Advisor: Richard Riehle, Victor Yu";
        item17.items.add(child17);
        items.add(item17);

        GroupItem item18 = new GroupItem();
        item18.title = "INT 593: Internship";
        ChildItem child18 = new ChildItem();
        child18.title = "A student must satisfy all the conditions - Complete all admission conditions, overall ITU GPA 3.0 or better, satisfactory completion of four SWE graduate courses including two degree core courses. Student is allowed to work part-time (20 hrs/week) or full-time (40 hrs/week) in each trimester.";
        child18.hint = "Professors: Ming Hwa Wang";
        item18.items.add(child18);
        items.add(item18);



        adapter = new ExampleAdapter(this);
        adapter.setData(items);

        listView = (AnimatedExpandableListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        // In order to show animations, we need to use a custom click handler
        // for our ExpandableListView.
        listView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                // We call collapseGroupWithAnimation(int) and
                // expandGroupWithAnimation(int) to animate group
                // expansion/collapse.
                if (listView.isGroupExpanded(groupPosition)) {
                    listView.collapseGroupWithAnimation(groupPosition);
                } else {
                    listView.expandGroupWithAnimation(groupPosition);
                }
                return true;
            }

        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.course_structure, menu);
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

    private static class GroupItem {
        String title;
        List<ChildItem> items = new ArrayList<ChildItem>();
    }

    private static class ChildItem {
        String title;
        String hint;
    }

    private static class ChildHolder {
        TextView title;
        TextView hint;
    }

    private static class GroupHolder {
        TextView title;
    }

    /**
     * Adapter for our list of {@link GroupItem}s.
     */
    private class ExampleAdapter extends AnimatedExpandableListView.AnimatedExpandableListAdapter {
        private LayoutInflater inflater;

        private List<GroupItem> items;

        public ExampleAdapter(Context context) {
            inflater = LayoutInflater.from(context);
        }

        public void setData(List<GroupItem> items) {
            this.items = items;
        }

        @Override
        public ChildItem getChild(int groupPosition, int childPosition) {
            return items.get(groupPosition).items.get(childPosition);
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public View getRealChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            ChildHolder holder;
            ChildItem item = getChild(groupPosition, childPosition);
            if (convertView == null) {
                holder = new ChildHolder();
                convertView = inflater.inflate(R.layout.list_item, parent, false);
                holder.title = (TextView) convertView.findViewById(R.id.textTitle);
                holder.hint = (TextView) convertView.findViewById(R.id.textHint);
                convertView.setTag(holder);
            } else {
                holder = (ChildHolder) convertView.getTag();
            }

            holder.title.setText(item.title);
            holder.hint.setText(item.hint);

            return convertView;
        }

        @Override
        public int getRealChildrenCount(int groupPosition) {
            return items.get(groupPosition).items.size();
        }

        @Override
        public GroupItem getGroup(int groupPosition) {
            return items.get(groupPosition);
        }

        @Override
        public int getGroupCount() {
            return items.size();
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            GroupHolder holder;
            GroupItem item = getGroup(groupPosition);
            if (convertView == null) {
                holder = new GroupHolder();
                convertView = inflater.inflate(R.layout.group_items, parent, false);
                holder.title = (TextView) convertView.findViewById(R.id.textTitle);
                convertView.setTag(holder);
            } else {
                holder = (GroupHolder) convertView.getTag();
            }

            holder.title.setText(item.title);

            return convertView;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public boolean isChildSelectable(int arg0, int arg1) {
            return true;
        }

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera)  //plan your schedule
        {
            Intent intent = new Intent(CourseStructure.this, PlanYourSchedule.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.discussion_forum) {
            Intent intent = new Intent(CourseStructure.this, main_discussion_forum_list.class);
            startActivity(intent);

        } else if (id == R.id.nav_slideshow)    //FAQs
        {
            Intent intent = new Intent(CourseStructure.this, faq.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage)   //Gettting into ITU
        {
            Intent intent = new Intent(CourseStructure.this, GettingIntoItu.class);
            startActivity(intent);
        }
        else if(id == R.id.nav_course){
            Intent intent = new Intent(CourseStructure.this, CourseStructure.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_share) {

            String sharingMessage = "Welcome to ITU Course Guide! Share the word among all the students of International Technological University and download the apk file from here";
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, sharingMessage);
            sendIntent.setType("text/plain");

            //String shareTitle = CourseStructure.this.getResources().getString(R.string.share_title) + " " + allTiles.get(pos).getGroupName();
            String shareTitle = "SWE 500";
            CourseStructure.this.startActivity(Intent.createChooser(sendIntent, shareTitle));

        } else if (id == R.id.nav_send) {

            Intent intent = new Intent(CourseStructure.this, ContactUs.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_accomodation){
            Intent intent = new Intent(CourseStructure.this, Accomodation.class);
            startActivity(intent);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
