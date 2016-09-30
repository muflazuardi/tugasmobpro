package muflazuardi.tampilanlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button btnlogin, btnregister;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin=(Button)findViewById(R.id.button);
        btnregister=(Button)findViewById(R.id.btnregister);
        username=(EditText)findViewById(R.id.editUser);
        password=(EditText)findViewById(R.id.editPass);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((username.getText().toString().equals("admin"))&&(password.getText().toString().equals("admin")))
                {
                    Intent intent=new Intent(login.this,Menu.class);
                    intent.setData(Uri.parse("1"));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(login.this, "Username dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,register.class));
            }
        });

    }
    public void LoginFacebook(View view)
    {
        Uri uri = Uri.parse("http://www.facebook.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public void LoginGoogle(View view)
    {
        Uri uri = Uri.parse("http://www.plus.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public void LoginTwitter(View view)
    {
        Uri uri = Uri.parse("http://www.twitter.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
