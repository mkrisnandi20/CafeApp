package lat.pam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenuAct extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, price, description;

    String data1, data2, data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);
        price = findViewById(R.id.price);
        description = findViewById(R.id.description);

        getData();
        setData();
    }

    private void  getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2") && getIntent().hasExtra("data2") ) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");

            myImage = getIntent().getIntExtra("myImage", 1);
        } else {
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        title.setText(data1);
        price.setText(data2);
        description.setText(data3);

        mainImageView.setImageResource(myImage);
    }
}