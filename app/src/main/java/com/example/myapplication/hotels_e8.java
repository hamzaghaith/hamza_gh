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

public class hotels_e8 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Yacht Hotel", "Golden Rose Hotel", "Lacosta Hotel", "Prestige Hotel", "Holiday Hotel Aqaba"};
    String mDescription[] = {"Three Star Hotel", "Star Hotel", "Four Star Hotel", "Four Star Hotel", "Four Star Hotel"};
    int images[] = {R.drawable.yachthotel, R.drawable.goldenrosehotel,R.drawable.hotellacosta
            ,R.drawable.prestigehotel,R.drawable.holidayhotel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_e8);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%A7%D9%84%D9%8A%D8%AE%D8%AA/entity/CgsIsOe16MuJyOjQARAB?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A7%D9%84%D9%8A%D8%AE%D8%AA&rp=OAJAAEgB&ictx=1&ved=0ahUKEwjrise4kb7kAhUc8uAKHUFUCC4Q65QECD8oAA&hrf=KhYKBwjjDxAJGAkSBwjjDxAJGAoYASgA&tcfs=EhoaGAoKMjAxOS0wOS0wORIKMjAxOS0wOS0xMFIA"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%AC%D9%88%D9%84%D8%AF%D9%86%20%D8%B1%D9%88%D8%B2%20%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9/entity/CgoIl4aPtMul2oYLEAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAkSBwjjDxAJGAogADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%AC%D9%88%D9%84%D8%AF%D9%86%20%D8%B1%D9%88%D8%B2%20%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9&rp=OAJAAEgB&ictx=1&ved=0ahUKEwje4t7Skb7kAhVq5eAKHbvEB6EQ65QECDwoAA"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D9%84%D8%A7%D9%83%D9%88%D8%B3%D8%AA%D8%A7%20%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9/entity/CgsIs_CbuM_9zofqARAB?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGBISBwjjDxAJGBMgADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D9%84%D8%A7%D9%83%D9%88%D8%B3%D8%AA%D8%A7%20%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9&rp=OAJAAEgB&ictx=1&ved=0ahUKEwiF16vhkb7kAhUi3uAKHZnyAnEQ65QECCkoAA"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/Aqaba/entity/CgoIlNjIjq2gmp1TEAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A8%D8%B1%D9%8A%D8%B3%D8%AA%D9%8A%D8%AC%20%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9&rp=OAJAAEgC&ictx=1&ved=2ahUKEwiM57Pvkb7kAhVl5OAKHZnaB_EQvS4wAHoECAoQFw&hrf=CgUIyAEQACIDSk9EKhYKBwjjDxAJGAkSBwjjDxAJGAoYASgAkgECIAE&tcfs=EhoaGAoKMjAxOS0wOS0wORIKMjAxOS0wOS0xMFIA"));
                    startActivity(googleIntent);

                }

                else if(position==4)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9/entity/CgoI-YWRmvKUnblbEAE?g2lb=2502547,4208993,4253230,4253565,4254308,4258168,4260007,4274032,4276661,4280050,4282357,4295061,4296667,4299259,4301054,4303135,4256180,4265427,4270859,4284970&hl=en&gl=jo&un=1&grf=EpMBCiwIDhIoEiZyJCoiCgcI4w8QCRgJEgcI4w8QCRgKIAAwHkDKAkoHCOMPEAkYBxIKCAcoAToEOgIgARIKCAIoAToEEgIIARoCCAIaAggOGj8IBxINCgs6CQoCCEsaA0pPRBINCgs6CQoCCGQaA0pPRBINCgs6CQoCCH0aA0pPRBIOCgw6CgoDCMgBGgNKT0QiAiAB&q=%D9%81%D9%86%D8%AF%D9%82+%D9%87%D9%88%D9%84%D9%8A%D8%AF%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D8%A9&rp=OAJAAEgC&ictx=1&ved=2ahUKEwiR38qBkr7kAhU7DmMBHQ8yAfsQvS4wAXoECAgQHQ"));
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
