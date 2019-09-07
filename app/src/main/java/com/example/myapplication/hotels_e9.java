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

public class hotels_e9 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Hotel Cairwan", "Chalets positive"};
    String mDescription[] = {"Star Hotel", "Three Star Hotel"};
    int images[] = {R.drawable.cairwanhotel, R.drawable.mujibchalets};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_e9);
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

                if(position==0)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%A7%D9%84%D9%82%D9%8A%D8%B1%D9%88%D8%A7%D9%86%20%D8%A7%D9%84%D9%83%D8%B1%D9%83/entity/CgsIxvG8nPzL7YypARAB?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A7%D9%84%D9%82%D9%8A%D8%B1%D9%88%D8%A7%D9%86%20%D8%A7%D9%84%D9%83%D8%B1%D9%83&rp=OAJAAEgB&ictx=1&ved=0ahUKEwjiupunlL7kAhX0AWMBHb-hBEIQ65QECCwoAA&hrf=KhYKBwjjDxAJGA4SBwjjDxAJGA8YASgA&tcfs=EhoaGAoKMjAxOS0wOS0xNBIKMjAxOS0wOS0xNVIA"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/Mujib%20Chalets/entity/CgoIzqD8j76MkusqEAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAcSBwjjDxAJGAggADAeQMoCSgcI4w8QCRgH&q=Mujib%20Chalets&rp=OAJAAEgB&ictx=1&ved=0ahUKEwjB4q3MlL7kAhXn0eAKHQCUDS4Q65QECD8oAA"));
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


