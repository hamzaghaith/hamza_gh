package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

public class Hotels_a3 extends Activity {
    ListView listview;

    String mTitle[]=new String[]{"فندق هادريان غيت","فندق غصن الزيتون","أجنحة البلوطي الفندقية"};
    String mDescription[] = {"فندق ثلاثه نجوم","فندق اربع نجوم","فندق ثلاثه نجوم"};
    int images[] = {R.drawable.hardianhotel, R.drawable.hotelbridle, R.drawable.baloutisuiteshotel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_a3);
        listview=(ListView)findViewById(R.id.lv);

        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listview.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub


                if(position==0)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D9%87%D8%A7%D8%AF%D8%B1%D9%8A%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%20%D8%AC%D8%B1%D8%B4/entity/CgsIlZbxr_zyv5LtARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D9%87%D8%A7%D8%AF%D8%B1%D9%8A%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%20%D8%AC%D8%B1%D8%B4&rp=OAJAAEgB&ictx=1&ved=0ahUKEwi9icHy_5HkAhWiwcQBHYNDA0sQ65QECCgoAA&hrf=KhYKBwjjDxAIGBQSBwjjDxAIGBUYASAB&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMSIYCgoyMDE5LTA4LTIwEgoyMDE5LTA4LTIxUgA"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D9%84%D9%8A%D8%AC%D8%A7%D9%85%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%20%D8%AC%D8%B1%D8%B4/entity/CgsI75XBtOXQ7ezvARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D9%84%D9%8A%D8%AC%D8%A7%D9%85%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%20%D8%AC%D8%B1%D8%B4&rp=OAJAAEgB&ictx=1&ved=0ahUKEwi0qpuLgJLkAhWMfZoKHUICDQwQ65QECCooAA&hrf=KhYKBwjjDxAIGBQSBwjjDxAIGBUYASgA&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMVIA"));
                    startActivity(googleIntent);

                }

                else
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D8%A7%D8%AC%D9%86%D8%AD%D9%87%20%D8%A7%D9%84%D8%A8%D9%84%D9%88%D8%B7%D9%8A%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%20%D8%AC%D8%B1%D8%B4/entity/CgsIzbbB1tTO9cb7ARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D8%A7%D8%AC%D9%86%D8%AD%D9%87%20%D8%A7%D9%84%D8%A8%D9%84%D9%88%D8%B7%D9%8A%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%20%D8%AC%D8%B1%D8%B4&rp=OAJAAEgB&ictx=1&ved=0ahUKEwjZ9p6zgJLkAhUdwsQBHascA6QQ65QECCgoAA&hrf=KhYKBwjjDxAJGBUSBwjjDxAJGBYYASAB&tcfs=EhoaGAoKMjAxOS0wOS0yMRIKMjAxOS0wOS0yMiIYCgoyMDE5LTA5LTIxEgoyMDE5LTA5LTIyUgA"));
                    startActivity(googleIntent);
                }

            }
        });
    }


    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }


        @Override
        public View getView(int position,  View convertView,  ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }

}
