package aghacom.rimaa.rimaashoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignInActivity extends AppCompatActivity
{
    private FirebaseAuth auth;
    private FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        auth= FirebaseAuth.getInstance();
        firebaseUser= auth.getCurrentUser();

        auth = FirebaseAuth.getInstance();
        firebaseUser=auth.getCurrentUser();
        if (firebaseUser==null) {
            startActivity(new Intent(this, LogTnActivity.class));
            finish();
            return;
        }
        else
        {
            String userName = firebaseUser.getDisplayName();
            if (firebaseUser.getPhotoUrl()!=null)
            {
                String photoUrl=firebaseUser.getPhotoUrl().toString();
            }
        }


    }
}
