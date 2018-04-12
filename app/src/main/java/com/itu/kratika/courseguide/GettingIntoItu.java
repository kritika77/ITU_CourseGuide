package com.itu.kratika.courseguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class GettingIntoItu extends AppCompatActivity {
    private ExpandListAdapterFaq ExpAdapter;
    private ArrayList<groupFaq> ExpListItems;
    private ExpandableListView ExpandList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_into_itu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ExpandList = (ExpandableListView) findViewById(R.id.exp_list);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapterFaq(GettingIntoItu.this, ExpListItems);
        ExpandList.setAdapter(ExpAdapter);

        ExpandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                String group_name = ExpListItems.get(groupPosition).getName();

                ArrayList<childFaq> ch_list = ExpListItems.get(
                        groupPosition).getItems();

                String child_name = ch_list.get(childPosition).getName();

                //showToastMsg(group_name + "\n" + child_name);

                return false;
            }
        });

        ExpandList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                String group_name = ExpListItems.get(groupPosition).getName();
                //showToastMsg(group_name + "\n Expanded");

            }
        });

        ExpandList.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                String group_name = ExpListItems.get(groupPosition).getName();
                // showToastMsg(group_name + "\n Expanded");

            }
        });

    }

    public ArrayList<groupFaq> SetStandardGroups() {

        ArrayList<groupFaq> group_list = new ArrayList<groupFaq>();
        ArrayList<childFaq> child_list;

        // Setting Group 1
        child_list = new ArrayList<childFaq>();
        groupFaq gru1 = new groupFaq();
        gru1.setName("How to Apply?");

        childFaq ch1_1 = new childFaq();
        ch1_1.setName("Application completion: The application for admission must be successfully completed and submitted online. Please note that after submission, no changes to your application can be made. In addition, it is highly recommended that you make copies of all submitted documents to keep for your personal use as we will not provide originals or copies of submitted documents.");
        child_list.add(ch1_1);



        gru1.setItems(child_list);

        // Setting Group 2
        child_list = new ArrayList<childFaq>();
        groupFaq gru2 = new groupFaq();
        gru2.setName("International Admission Requirements");

        childFaq ch2_1 = new childFaq();
        ch2_1.setName("1. Steps for Obtaining ITU I-20/DS-2019:\n" +
                "Submit ITU Admission Application\n" +
                "Gain FULL acceptance to a program of study at ITU\n" +
                "Complete the I-20/DS-2019 Application for Newly Admitted Students and submit it along with all other required documents. Please be very careful in completing the form accurately in order to avoid mistakes or delays.\n" +
                " \n" +
                "\n" +
                "In order to complete your application, you will need to have:\n" +
                "\n" +
                "A copy of your ITU admission letter (an electronic version is fine)\n" +
                "A copy of the photo page of your passport\n" +
                "Financial documents that prove you can pay for the estimated expenses at ITU");
        child_list.add(ch2_1);

        gru2.setItems(child_list);

        // Setting Group 3
        child_list = new ArrayList<childFaq>();
        groupFaq gru3 = new groupFaq();
        gru3.setName("Online Application");

        childFaq ch3_1 = new childFaq();
        ch3_1.setName("ITU’s Office of Admissions requires all applicants to complete and submit the online application - we do not accept paper-based applications.\n" +
                "\n" +
                "Upload the following:\n" +
                "\n" +
                "Statement of Purpose\n" +
                "Resume\n" +
                "Transcripts\n" +
                "Test scores (where applicable)\n" +
                "Letters of Recommendation (where applicable)");
        child_list.add(ch3_1);

        gru3.setItems(child_list);

        // Setting Group 4
        child_list = new ArrayList<childFaq>();
        groupFaq gru4 = new groupFaq();
        gru4.setName("Admission Deadlines");

        childFaq ch4_1 = new childFaq();
        ch4_1.setName("If you miss an ITU deadline,\n"+"your application will be withdrawn\n for admission." +
                        " If you have an \n extreme hardship or unusual \n circumstance" +
                        " that may cause you\n"+" to miss one of the deadlines,\n" +
                        " contact admissions@itu.edu immediately! ");
        child_list.add(ch4_1);

        gru4.setItems(child_list);



        // Setting Group 5
        child_list = new ArrayList<childFaq>();
        groupFaq gru5 = new groupFaq();
        gru5.setName("Application Fee Waiver");

        childFaq ch5_1 = new childFaq();
        ch5_1.setName("The ITU application fee is pro-rated based on the application period and is payable by Visa, Discover or MasterCard major credit cards. Please note: all application fees are non-refundable. Application fee waivers are granted for individuals who express financial hardship. Please complete the application fee waiver section of the online application if you wish to request an application fee waiver.");
        child_list.add(ch5_1);

        gru5.setItems(child_list);



        //listing all groups
        group_list.add(gru1);
        group_list.add(gru2);
        group_list.add(gru3);
        group_list.add(gru4);
        group_list.add(gru5);


        return group_list;
    }

    //public void showToastMsg(String Msg) {
    // Toast.makeText(getApplicationContext(), Msg, Toast.LENGTH_SHORT).show();
    //}

}
