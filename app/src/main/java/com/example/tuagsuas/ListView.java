package com.example.tuagsuas;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListView extends AppCompatActivity {
    android.widget.ListView listView;
    String mTitle[] = {"YORK Coffee & Cookery", "Luthier Coffee", "Equatore Rooftop Cafe", "Ombre Cafe", "Bingen Kafe", "EEGsperience", "Mayor Board Game Cafe","Rendezvous Cafe and Drink"};
    String mDescription[] = {"Jl. Basuki Rahmat B C.02, Kemuning, Palembang", "Jl. Bangau No. 170, Ilir Timur, Palembang", "Hotel Barong Lantai 5, Komplek Palembang Square Mall, Palembang", "Jl. Akbp Cek Agus Blok A1 No. 1, Palembang", "Jl. Residen H. Abdul Rozak No.5, Palembang", "Jl. Cendrawasih No.4, 9 Ilir, Ilir Tim.II, Palembang","Jl. Mayor Ruslan No.406, Palembang","Jl. Residen Abdul Rozak, Bukit Sangkal, Kalidoni, Palembang" };
    int images[] = {R.drawable.satu, R.drawable.dua, R.drawable.tiga, R.drawable.empat, R.drawable.lima, R.drawable.lima, R.drawable.enam, R.drawable.tujuh, R.drawable.delapan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), FragmentSatu.class);
                    intent.putExtra("York Cafe",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "York Cafe Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), FragmentDua.class);
                    intent.putExtra("Luthier Coffee",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "Luthier Coffee Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), FragmentSatu.class);
                    intent.putExtra("Equatore Rooftop Cafe",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "Equatore Rooftop Cafe Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), FragmentDua.class);
                    intent.putExtra("Ombre Cafe",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "Ombre Cafe Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), FragmentSatu.class);
                    intent.putExtra("Bingen Kafe",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "Bingen Kafe Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), FragmentDua.class);
                    intent.putExtra("EEGsperience",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "EEGsperience Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), FragmentSatu.class);
                    intent.putExtra("Mayor Board Game Cafe",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "Mayor Board Game Cafe Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), FragmentDua.class);
                    intent.putExtra("Rendezvous Cafe and Drink",id);
                    startActivity(intent);
                    Toast.makeText(ListView.this, "Rendezvous Cafe and Drink Description", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
