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

public class hotels_e7 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"Ajloun Hotel", "Mountain Castle Hotel", "Olive Branch Hotel"};
    String mDescription[] = {"2 star hotel", "2 star hotel", "2 star hotel"};
    int images[] = {R.drawable.ajlounhotel,R.drawable.mountaincastlehotel, R.drawable.olivebranchhotel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_e7);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%B9%D8%AC%D9%84%D9%88%D9%86./entity/CgsImOvGv8OT4-vmARAB?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAcSBwjjDxAJGAggADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%B9%D8%AC%D9%84%D9%88%D9%86.&rp=OAJAAEgB&ictx=1&ved=0ahUKEwj6p7SOkL7kAhX1D2MBHacKDHoQ65QECEAoAA"));
                    startActivity(googleIntent);


                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D9%82%D9%84%D8%B9%D8%A9%20%D8%A7%D9%84%D8%AC%D8%A8%D9%84%20%D8%B9%D8%AC%D9%84%D9%88%D9%86/entity/CgoIr9_Rpcuy9Kt7EAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAcSBwjjDxAJGAggADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D9%82%D9%84%D8%B9%D8%A9%20%D8%A7%D9%84%D8%AC%D8%A8%D9%84%20%D8%B9%D8%AC%D9%84%D9%88%D9%86&rp=OAJAAEgB&ictx=1&ved=0ahUKEwi_7JSekL7kAhWnAmMBHaN6BkEQ65QECCkoAA"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%BA%D8%B5%D9%86%20%D8%A7%D9%84%D8%B2%D9%8A%D8%AA%D9%88%D9%86/entity/CgsI75XBtOXQ7ezvARAB?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAcSBwjjDxAJGAggADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%BA%D8%B5%D9%86%20%D8%A7%D9%84%D8%B2%D9%8A%D8%AA%D9%88%D9%86&rp=OAJAAEgB&ictx=1&ved=0ahUKEwiJte-okL7kAhUV5uAKHXTNAnQQ65QECCkoAA"));
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
