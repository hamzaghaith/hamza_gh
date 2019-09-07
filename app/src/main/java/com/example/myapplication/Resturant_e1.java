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

public class Resturant_e1 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"Hashim Resturant","Restaurant Safra","Areej Sham Restaurant",
            "Fakhr El Din Restaurant","Kan Zaman"};

    String mDescription[] = {"","","","",""};
    int images[] = {R.drawable.hashimrestaurant, R.drawable.restauranttravel, R.drawable.areejshamrestaurant
            , R.drawable.fakhreldinrestaurant, R.drawable.restaurantzaman};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e1);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=ydBwXamKLIuOlwTnsLLQAw&hotel_occupancy=&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%87%D8%A7%D8%B4%D9%85&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%87%D8%A7%D8%B4%D9%85&gs_l=mobile-gws-wiz-serp.3..0l7j0i22i30.3273.7789..7838...1.1..0.184.1328.0j8......0....1.......8..0i71j41j41i22i30j41i71j41i7i30j41i19j0i131j46.DH0nx7ffILg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16706868647590184418,rc_q:Hashem%2520Restaurant%2520Down%2520Town,ru_q:Hashem%2520Restaurant%2520Down%2520Town"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=6tBwXdCNObCIlwTvmIfQDw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B3%D9%81%D8%B1%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B3%D9%81%D8%B1%D9%87&gs_l=mobile-gws-wiz-serp.3..0l5j0i22i30l3.2735.5750..5815...1.1..0.199.1190.0j7......0....1.........0i71j41.V3Be5gsLwxo#istate=lrl:iv&rlimm=4548883249632360849"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=BtFwXdiwHNK_lwSCnImoDQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%B1%D9%8A%D8%AC+%D8%A7%D9%84%D8%B4%D8%A7%D9%85+%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%B1%D9%8A%D8%AC+%D8%A7%D9%84%D8%B4%D8%A7%D9%85+%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&gs_l=mobile-gws-wiz-serp.3..0i22i30l8.18976.25675..25738...1.1..0.736.3113.0j7j3j5-1j1......0....1.........0i71j41j0j0i10j0i19.Q5GpeSPeEHA#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:721976942593220058,rc_q:Areej%2520Al%2520Sham%2520Restaurant,ru_q:Areej%2520Al%2520Sham%2520Restaurant"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=IdFwXcmeK8OOlwTDybmABg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AE%D8%B1+%D8%A7%D9%84%D8%AF%D9%8A%D9%86+%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AE%D8%B1+%D8%A7%D9%84%D8%AF%D9%8A%D9%86+%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&gs_l=mobile-gws-wiz-serp.3..0i19j0i5i30i19j0i8i30i19j0i5i30i19l3.26350.31461..32447...0.1..0.250.3005.0j13j4......0....1.........0i71j0i7i30j0i7i5i30j33i10j0i8i7i30j0i7i30i19j0i7i10i30i19j0i8i7i30i19j0i7i5i30i19j0i8i30.fP94JWkCRyg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4600019864815893504,rc_q:Fakhreldin%2520Restaurant,ru_q:Fakhreldin%2520Restaurant"));
                    startActivity(googleIntent);
                }

                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=RNFwXZGmDqmflwTG5YnABw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A7%D9%86+%D8%B2%D9%85%D8%A7%D9%86+%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A7%D9%86+%D8%B2%D9%85%D8%A7%D9%86+%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&gs_l=mobile-gws-wiz-serp.3..0i19l2.34422.37763..38245...0.1..0.199.1836.0j11......0....1.........0i71j0i7i30j0i7i5i30j0i8i30j0i7i10i30j0i7i30i19.yeZkyFKaMoo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5161381331042390166,rc_q:Kan%2520Zaman,ru_q:Kan%2520Zaman"));
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
            super(c, R.layout.resturants, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }


        @Override
        public View getView(int position,  View convertView,  ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View resturants = layoutInflater.inflate(R.layout.resturants, parent, false);
            ImageView images = resturants.findViewById(R.id.image);
            TextView myTitle = resturants.findViewById(R.id.textView1);
            TextView myDescription = resturants.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return resturants;
        }
    }
}
