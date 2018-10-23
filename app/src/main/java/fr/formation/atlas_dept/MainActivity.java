package fr.formation.atlas_dept;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etSearch,etNoDept,etNom,etNomStd,etSurface,etDateCreation,etChefLieu,etUrlWiki,etNoRegion;
    Departement dept;

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
        etSearch=findViewById(R.id.etSearch);

        dept=new Departement(this);


    }

    public void btSearch(View view)  {
        String numDept = etSearch.getText().toString();

        try {
            dept.select(numDept);
            etNoDept.setText(dept.getNoDept());
            etChefLieu.setText(dept.getChefLieu());
            etDateCreation.setText(dept.getDateCreation());
            etUrlWiki.setText(dept.getUrlWiki());
            etNom.setText(dept.getNom());
            etSurface.setText(String.valueOf(dept.getSurface()));
            etNoRegion.setText(String.valueOf(dept.getNoRegion()));
            etNomStd.setText(dept.getNomStd());
            etSearch.setEnabled(false);


        } catch (Exception e) {
            Toast.makeText(this,"Departement inconnus",Toast.LENGTH_LONG).show();
        }


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
