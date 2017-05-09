package kh.edu.kekbunlai.rupp.fe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import kh.edu.kekbunlai.rupp.fe.myapplication.Adapter.Document;
import kh.edu.kekbunlai.rupp.fe.myapplication.Adapter.DocumentAdapter;

public class DocumentActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DocumentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);
        recyclerView = (RecyclerView) findViewById(R.id.rv_doc);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new DocumentAdapter(loadDocuments());
        recyclerView.setAdapter(adapter);

    }
    public Document[] loadDocuments()
    {
        Document d1 = new Document("Ch. 1: Introduction to Mobile App Dev", "", 1);
        Document d2 = new Document("Ch. 2: Google Play Store", "", 23);
        Document d3 = new Document("Ch. 3: Android Studio", "", 233);
        Document d4 = new Document("Ch. 4: Drawer Layout", "", 122);
        Document d5 = new Document("Ch. 5: Recycler View", "", 123);
        Document d6 = new Document("Ch. 1: Introduction to Mobile App Dev", "", 1);
        Document d7 = new Document("Ch. 2: Google Play Store", "", 23);
        Document d8 = new Document("Ch. 3: Android Studio", "", 233);
        Document d9 = new Document("Ch. 4: Drawer Layout", "", 122);
        Document d10 = new Document("Ch. 5: Recycler View", "", 123);
        Document[] documents = {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10};
        return documents;
    }
}
