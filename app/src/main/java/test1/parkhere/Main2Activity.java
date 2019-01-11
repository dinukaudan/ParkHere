package test1.parkhere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
TextView tvRegisterlink;
    android.support.v7.widget.AppCompatButton btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvRegisterlink=(TextView) findViewById(R.id.tvRegisterlink);
        tvRegisterlink.setOnClickListener(this);
        btn_login=(android.support.v7.widget.AppCompatButton)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
    }



@Override
    public void onClick(View v){
    switch(v.getId()){
        case R.id.tvRegisterlink:

        startActivity(new Intent(this,Main3Activity.class));
        break;
        case R.id.btn_login:
            startActivity(new Intent(this,Main4Activity.class));
            break;


    }


}

}
