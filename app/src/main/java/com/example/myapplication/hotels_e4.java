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

public class hotels_e4 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"Saltus Hotel","Aziz House"};

    String mDescription [] = {"Three Star Hotel", "Four Star Hotel"};

    int images[] = {R.drawable.saltoshotel, R.drawable.azizhouse};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_e4);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%B3%D8%A7%D9%84%D8%AA%D9%88%D8%B3%20%D8%A7%D9%84%D8%B3%D9%84%D8%B7/entity/CgsI3_fnw53n85ibARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4282188%2C4282357%2C4286385%2C4291191%2C4295061%2C4296056%2C4296667%2C4299259%2C4300061%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970%2C4293023&hl=en&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%B3%D8%A7%D9%84%D8%AA%D9%88%D8%B3%20%D8%A7%D9%84%D8%B3%D9%84%D8%B7&rp=EN_358Od5_OYmwE4AkAASAE&ictx=1&ved=0ahUKEwi109222bnkAhVQasAKHdKsD8QQ65QECCkoAA&hrf=KhYKBwjjDxAJGAUSBwjjDxAJGAYYASgA&tcfs=EhoaGAoKMjAxOS0wOS0wNRIKMjAxOS0wOS0wNlIA"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D8%A8%D9%8A%D8%AA%20%D8%B9%D8%B2%D9%8A%D8%B2%20%D8%A8%D9%88%D8%AA%D9%8A%D9%83%20%D8%A7%D9%84%D8%B3%D9%84%D8%B7/entity/CgsI2-qFtbjl0eW2ARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4282188%2C4282357%2C4286385%2C4291191%2C4295061%2C4296056%2C4296667%2C4299259%2C4300061%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970%2C4293023&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAUSBwjjDxAJGAYgADAeQMoCSgcI4w8QCRgF&q=%D8%A8%D9%8A%D8%AA%20%D8%B9%D8%B2%D9%8A%D8%B2%20%D8%A8%D9%88%D8%AA%D9%8A%D9%83%20%D8%A7%D9%84%D8%B3%D9%84%D8%B7&rp=ENvqhbW45dHltgE4AkAASAE&ictx=1&ved=0ahUKEwjNhOmC3bnkAhUC3aQKHVDjAwQQ65QECCkoAA"));
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
