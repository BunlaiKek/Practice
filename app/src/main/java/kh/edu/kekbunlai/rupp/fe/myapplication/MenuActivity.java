package kh.edu.kekbunlai.rupp.fe.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends Activity implements View.OnClickListener {
    private ImageView imageView1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imageView1 = (ImageView) findViewById(R.id.ic_doc);
        imageView1.setOnClickListener(this);
        textView1 = (TextView) findViewById(R.id.txt_doc);
        textView1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ic_doc)
        {
            Intent intent = new Intent(MenuActivity.this,DocumentActivity.class);
            startActivity(intent);
        }
    }
}
