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

public class Resturant_e2 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"Sultan Restaurant", " Yassin Al Fawwal Restaurant","Noor Restaurant Malaysia"};


    String mDescription[] = {""," ",""};
    int images[] = {R.drawable.sultanrestaurant, R.drawable.yassinalfawwalrestaurant, R.drawable.nourrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e2);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=Al-Sultan+Irbid&ludocid=12512468751125527379&ibp=gwp;0,7&lsig=AB86z5VywUFO6xGuMkXzi0JLIufU&phdesc=aRtqPq-tAGI&sa=X&ved=2ahUKEwj68ufVwbnkAhVISxoKHdCJAHYQvS4wAXoECAsQYA&biw=360&bih=600"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=s-hwXbrNEsiWadCTgrAH&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D9%81%D9%88%D8%A7%D9%84+%D8%A7%D8%B1%D8%A8%D8%AF&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D9%81%D9%88%D8%A7%D9%84+&gs_l=mobile-gws-wiz-serp.1.0.0i19j0i22i30i19l7.3031.7400..9211...0.1..0.385.1928.0j4j4j1......0....1.........0i71j41j0i131j0j46.nC8Wu93WTKM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10098685370968507304,rc_q:Yassin%2520Al%2520Fawwal,ru_q:Yassin%2520Al%2520Fawwal"));
                    startActivity(googleIntent);

                }


                else
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=s-hwXbrNEsiWadCTgrAH&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D9%81%D9%88%D8%A7%D9%84+%D8%A7%D8%B1%D8%A8%D8%AF&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D9%81%D9%88%D8%A7%D9%84+&gs_l=mobile-gws-wiz-serp.1.0.0i19j0i22i30i19l7.3031.7400..9211...0.1..0.385.1928.0j4j4j1......0....1.........0i71j41j0i131j0j46.nC8Wu93WTKM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10098685370968507304,rc_q:Yassin%2520Al%2520Fawwal,ru_q:Yassin%2520Al%2520Fawwal"));
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
