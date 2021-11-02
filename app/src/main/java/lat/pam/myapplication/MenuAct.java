package lat.pam.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenuAct extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int images[] = {R.drawable.kopi_hitam, R.drawable.cappuchino, R.drawable.batagor,
    R.drawable.black_salad, R.drawable.cheesecake, R.drawable.cireng, R.drawable.donut,
    R.drawable.mie_goreng, R.drawable.nasgor, R.drawable.nasigoreng, R.drawable.sparkling_tea};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.title_menu);
        s2 = getResources().getStringArray(R.array.prices_menu);
        s3 = getResources().getStringArray(R.array.description);


        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout_item:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                this.finish();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }


}