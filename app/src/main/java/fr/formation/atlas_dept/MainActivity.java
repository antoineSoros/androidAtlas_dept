package fr.formation.atlas_dept;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etSearch,etNoDept,etNom,etNomStd,etSurface,etDateCreation,etChefLieu,etUrlWiki,etNoRegion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChefLieu=findViewById(R.id.etChefLieu);
        etDateCreation=findViewById(R.id.etDateCreation);
        etNoDept=findViewById(R.id.etNoDept);
        etNom=findViewById(R.id.etNom);
        etNomStd=findViewById(R.id.etNomStd);
        etSurface=findViewById(R.id.etSurface);
        etUrlWiki=findViewById(R.id.etUrlWiki);
        etNoRegion=findViewById(R.id.etNoRegion);

    }

    public void btSearch(View view) {

    }

    public void btClear(View view) {
    }

    public void btDelete(View view) {
    }

    public void btInsert(View view) {
    }

    public void btUpdate(View view) {
    }

    public void deleteDB(View view) {
    }
}
