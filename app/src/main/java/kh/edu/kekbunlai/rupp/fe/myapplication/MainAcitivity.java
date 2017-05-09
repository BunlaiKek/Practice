package kh.edu.kekbunlai.rupp.fe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainAcitivity extends AppCompatActivity implements View.OnClickListener{
    private Button logoutButton;
    private Button anotherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acitivity);
        logoutButton = (Button) findViewById(R.id.btn_logout);
        logoutButton.setOnClickListener(this);
        anotherButton = (Button) findViewById(R.id.btn_another);
        anotherButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_logout)
        {
            Intent intent = new Intent(MainAcitivity.this,LoginScreenActivity.class);
            startActivity(intent);
            finish();
        }
        if (view.getId() == R.id.btn_another)
        {
            Intent intent = new Intent(MainAcitivity.this,MenuActivity.class);
            startActivity(intent);
        }
    }
}
