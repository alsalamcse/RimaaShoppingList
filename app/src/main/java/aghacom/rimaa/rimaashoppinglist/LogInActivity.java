package aghacom.rimaa.rimaashoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity
{
    private EditText idEmail;
    private EditText idPassw;
    private Button btnLogin;
    private Button btnSignUp;
    private Button btnForget;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        idEmail= (EditText) findViewById(R.id.idEmail);
        idPassw= (EditText) findViewById(R.id.idPassw);
        btnLogin= (Button) findViewById(R.id.btnLogin);
        btnSignUp= (Button) findViewById(R.id.btnSignUp);
        btnForget= (Button) findViewById(R.id.btnForget);
    }
}
