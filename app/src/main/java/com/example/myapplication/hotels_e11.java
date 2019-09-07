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

public class hotels_e11 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Petra Moon Hotel ","Petra Marriott Hotel","Seven Wonders Hotel"};


    String mDescription[] = {"Four Star Hotel", "Five Star Hotel", "Three Star Hotel"};
    int images[] = {R.drawable.petramoonhotel, R.drawable.petramarriotthotel, R.drawable.sevenwondershotel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_e11);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D9%82%D9%85%D8%B1%20%D8%A7%D9%84%D8%A8%D8%AA%D8%B1%D8%A7%D8%A1/entity/CgoIkZDFkdWkrNVlEAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAkSBwjjDxAJGAogADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D9%82%D9%85%D8%B1%20%D8%A7%D9%84%D8%A8%D8%AA%D8%B1%D8%A7%D8%A1&rp=OAJAAEgB&ictx=1&ved=0ahUKEwjdg6SLl77kAhVh5OAKHT1gCO8Q65QECCkoAA"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%A8%D8%AA%D8%B1%D8%A7%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%AA/entity/CgoIsIa1pOugt-sSEAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAJGAgSBwjjDxAJGAkgADAeQMoCSgcI4w8QCRgH&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A8%D8%AA%D8%B1%D8%A7%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%AA&rp=OAJAAEgB&ictx=1&ved=0ahUKEwi325GXl77kAhWr5OAKHb72B6MQ65QECDwoAA"));
                    startActivity(googleIntent);
                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%B9%D8%AC%D8%A7%D8%A6%D8%A8%20%D8%A7%D9%84%D8%AF%D9%86%D9%8A%D8%A7%20%D8%A7%D9%84%D8%B3%D8%A8%D8%B9/entity/CgoIofaX24i-_dp3EAE?g2lb=2502547%2C4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4280050%2C4282357%2C4295061%2C4296667%2C4299259%2C4301054%2C4303135%2C4256180%2C4265427%2C4270859%2C4284970&hl=en&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%B9%D8%AC%D8%A7%D8%A6%D8%A8%20%D8%A7%D9%84%D8%AF%D9%86%D9%8A%D8%A7%20%D8%A7%D9%84%D8%B3%D8%A8%D8%B9&rp=OAJAAEgC&ictx=1&ved=2ahUKEwiKo5ull77kAhV68eAKHTrsCUQQvS4wAXoECAwQHQ&hrf=CgQIPBAAIgNKT0QqFgoHCOMPEAkYBxIHCOMPEAkYCBgBIAGSAQIgAQ&tcfs=EhoaGAoKMjAxOS0wOS0wNxIKMjAxOS0wOS0wOCIYCgoyMDE5LTA5LTA3EgoyMDE5LTA5LTA4UgA"));
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
