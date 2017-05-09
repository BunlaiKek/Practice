package kh.edu.kekbunlai.rupp.fe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreenActivity extends AppCompatActivity implements View.OnClickListener {
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        loginButton = (Button) findViewById(R.id.btn_login);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login){
            Intent intent = new Intent(LoginScreenActivity.this,MainAcitivity.class);
            startActivity(intent);
            finish();
        }
    }
}
