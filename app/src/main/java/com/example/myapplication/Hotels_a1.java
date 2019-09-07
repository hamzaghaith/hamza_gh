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

public class Hotels_a1 extends Activity {

    ListView listview;

    String  mTitle[]=new String[]{"فندق البوصلة","فندق لارسا","فندق برج العرب",
            "فندق عمان روتانا","فندق جراند ميلينيوم عمان","فندق أرجان بوليفارد روتانا"};

    String mDescription[] = {"فندق ثلاثه نجوم","فندق ثلاثه نجوم","فندق نجمتين",
            "فندق خمس نجوم","فندق خمس نجوم","فندق خمس نجوم"};
    int images[] = {R.drawable.hotelcompass, R.drawable.larsahotel, R.drawable.borgelarabhotel, R.drawable.rotanahotel,
            R.drawable.grandhotel,R.drawable.arjanrotanahotel};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_a1);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D8%B9%D9%85%D9%91%D8%A7%D9%86/entity/CgoIoLTSr47n-YBfEAE?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A7%D9%84%D8%A8%D9%88%D8%B5%D9%84%D8%A9%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&rp=OAJAAEgC&ictx=1&ved=2ahUKEwjYnoWB-JHkAhVHlYsKHYzvBmcQvS4wAHoECAsQFg&hrf=CgQIRhAAIgNKT0QqFgoHCOMPEAgYFBIHCOMPEAgYFRgBIAGSAQIgAQ&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMSIYCgoyMDE5LTA4LTIwEgoyMDE5LTA4LTIxUgA"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D9%84%D8%A7%D8%B1%D8%B3%D8%A7/entity/CgoItMS2sv2X-fogEAE?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D9%84%D8%A7%D8%B1%D8%B3%D8%A7&rp=OAJAAEgB&ictx=1&ved=0ahUKEwiTkoLbv4_kAhUIfxoKHW7IAuoQ65QECDkoAA&hrf=KhYKBwjjDxAIGBQSBwjjDxAIGBUYASAB&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMSIYCgoyMDE5LTA4LTIwEgoyMDE5LTA4LTIxUgA"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%A8%D8%B1%D8%AC%20%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86/entity/CgoIpr_z2sTesMxNEAE?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A8%D8%B1%D8%AC%20%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&rp=OAJAAEgB&ictx=1&ved=0ahUKEwizuNeh-JHkAhVok4sKHcSiBn0Q65QECDgoAA&hrf=KhYKBwjjDxAIGBQSBwjjDxAIGBUYASAB&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMSIYCgoyMDE5LTA4LTIwEgoyMDE5LTA4LTIxUgA"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%B1%D9%88%D8%AA%D8%A7%D9%86%D8%A7/entity/CgoIrubR8u-5koVmEAE?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%B1%D9%88%D8%AA%D8%A7%D9%86%D8%A7&rp=OAJAAEgB&ictx=1&ved=0ahUKEwilsNm6-JHkAhUvtIsKHVMQCZ8Q65QECDwoAA&hrf=KhYKBwjjDxAIGBQSBwjjDxAIGBUYASgA&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMVIA"));
                    startActivity(googleIntent);
                }

                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D9%81%D9%86%D8%AF%D9%82%20%D8%AC%D8%B1%D8%A7%D9%86%D8%AF%20%D9%85%D9%8A%D9%84%D9%8A%D9%86%D9%8A%D9%88%D9%85%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86/entity/CgsIoKeVyuuyqp_4ARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&grf=Ei4KLAgOEigSJnIkKiIKBwjjDxAIGBQSBwjjDxAIGBUgADAeQMoCSgcI4w8QCBgU&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%AC%D8%B1%D8%A7%D9%86%D8%AF%20%D9%85%D9%8A%D9%84%D9%8A%D9%86%D9%8A%D9%88%D9%85%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&rp=OAJAAEgB&ictx=1&ved=0ahUKEwj36trR-JHkAhUOuIsKHf2yDugQ65QECEUoAA"));
                    startActivity(googleIntent);
                }

                else
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D8%B9%D9%85%D9%91%D8%A7%D9%86/entity/CgoIhs3SqM_x4scUEAE?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4274671%2C4276661%2C4282357%2C4288707%2C4288958%2C4291191%2C4295675%2C4296056%2C4297327%2C4265427%2C4270859%2C4272931%2C4295945&hl=ar&gl=jo&un=1&q=%D9%81%D9%86%D8%AF%D9%82%20%D8%A7%D8%B1%D8%AC%D8%A7%D9%86%20%D8%A8%D9%88%D9%84%D9%8A%D9%81%D8%A7%D8%B1%D8%AF%20%D8%B1%D9%88%D8%AA%D8%A7%D9%86%D8%A7%20%20%D8%B9%D9%85%D8%A7%D9%86%20%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&rp=OAJAAUgD&ictx=1&ved=2ahUKEwi0gKzn-JHkAhUKmIsKHcvAD9oQvS4wAHoECA0QFA&hrf=CgQIRhAAIgNKT0QqFgoHCOMPEAgYFBIHCOMPEAgYFRgBKACSAQIgAQ&tcfs=EhoaGAoKMjAxOS0wOC0yMBIKMjAxOS0wOC0yMVIA"));
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
