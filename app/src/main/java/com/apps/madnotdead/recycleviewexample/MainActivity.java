package com.apps.madnotdead.recycleviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRV = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRV = (RecyclerView) findViewById(R.id.main_recycle_view);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL );
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        myRV.setLayoutManager(staggeredGridLayoutManager);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John","23"));
        persons.add(new Person("Thom","42"));
        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));        persons.add(new Person("Robert","54"));
        persons.add(new Person("Josh","12"));
        persons.add(new Person("Carter","80"));

        myRV.setAdapter(new RecycleViewAdapter(persons));

    }
}
