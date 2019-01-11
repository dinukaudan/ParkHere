package test1.parkhere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
TextView link_login;
    android.support.v7.widget.AppCompatButton btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        link_login=(TextView)findViewById(R.id.link_login);
        link_login.setOnClickListener(this);
        btn_signup=(android.support.v7.widget.AppCompatButton)findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(this);

    }


@Override
    public void onClick(View v){
    switch(v.getId()){

        case R.id.link_login:
            startActivity(new Intent(this,Main2Activity.class));

            break;
        case R.id.btn_signup:
            startActivity(new Intent(this,Main4Activity.class));
            break;

    }


}


}
