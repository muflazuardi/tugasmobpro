package muflazuardi.tampilanlogin;

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
        btnregister=(Button)findViewById(R.id.btnRegis);
        username=(EditText)findViewById(R.id.editUser);
        password=(EditText)findViewById(R.id.editPass);


    }
}
