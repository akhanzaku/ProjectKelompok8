package id.sch.smktelkom_mlg.project.xiirpl308182838.projectkelompok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by WikudharaSW on 22/11/2016.
 */

public class MainActivityRecycler extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recycler);

        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerAdapter adapter=new RecyclerAdapter(this);
        //membuat adapter baru untuk reyclerview
        recyclerView.setAdapter(adapter);
        //menset nilai dari adapter
        recyclerView.setHasFixedSize(true);
        //menset setukuran
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //menset layoutmanager dan menampilkan daftar/list
        //dalam bentuk linearlayoutmanager pada class saat ini


    }
}
