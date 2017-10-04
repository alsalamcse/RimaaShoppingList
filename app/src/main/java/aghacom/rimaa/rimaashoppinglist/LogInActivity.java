package aghacom.rimaa.rimaashoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText etEmail;
    private EditText etPassw;
    private Button btnIn;
    private Button btnUp;
    private Button btnForget;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPassw= (EditText) findViewById(R.id.etPassw);
        btnIn= (Button) findViewById(R.id.btnIn);
        btnUp= (Button) findViewById(R.id.btnUp);
        btnForget= (Button) findViewById(R.id.btnForget);
    }

    @Override
    public void onClick(View view)
    {
        if (view==btnIn)
        {

        }


    }
}
