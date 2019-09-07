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

public class Resturant_e4 extends Activity {

    ListView listview;
    String mTitle[] = new String[]{"Abu Khamis Restaurant", "Al Ghorbal Restaurant", "Salt Mill Restaurant", "Coal And Meat Restaurant"};

    String mDescription[] = {"", "", "", ""};

    int images[] = {R.drawable.abukhamisrestaurant, R.drawable.thesieverestaurant, R.drawable.windmillsrestaurant
            , R.drawable.charcoalandmeatrestaurant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e4);
        listview = (ListView) findViewById(R.id.lv);

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

                if (position == 0) {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=hwVxXefJENL7kwWanaWwBQ&q=%D9%85%D9%88%D9%82%D8%B9+%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%AE%D9%85%D9%8A%D8%B3+%D8%A7%D9%84%D8%B3%D9%84%D8%B7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%AE%D9%85%D9%8A%D8%B3+%D9%81%D9%8A+%D8%AC%D9%85%D9%8A%D8%B9&gs_l=mobile-gws-wiz-serp.1.0.0i71l3.0.0..6491...0.1..0.0.0.......0.VpFxJGtKfFs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2007360791059223533,rc_q:Al%2520Salam%2520Restaurant,ru_q:Al%2520Salam%2520Restaurant"));
                    startActivity(googleIntent);

                }
                else if (position == 1) {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=jwVxXeSQMsXBkwW4mpTQAQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%BA%D8%B1%D8%A8%D8%A7%D9%84+%D9%81%D9%8A+%D8%AC%D9%85%D9%8A%D8%B9&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%BA%D8%B1%D8%A8%D8%A7%D9%84+%D9%81%D9%8A+%D8%AC%D9%85%D9%8A%D8%B9&gs_l=mobile-gws-wiz-serp.3..33i160.23815.29784..29808...1.0..0.341.2900.0j6j5j2......0....1.......8..41i71j41j41i19j41i275j0j0i131j46j0i19j0i22i30i19.uMNQFeysXb4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4037443441092554263,rc_q:Al%2520Gherbal%2520Restaurant%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25BA%25D8%25B1%25D8%25A8%25D8%25A7%25D9%2584,ru_q:Al%2520Gherbal%2520Restaurant%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25BA%25D8%25B1%25D8%25A8%25D8%25A7%25D9%2584"));
                    startActivity(googleIntent);
                }
                else if (position == 2) {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=rwVxXbawF-3jsAfjuqigCw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B7%D9%88%D8%A7%D8%AD%D9%8A%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B7%D9%88%D8%A7%D8%AD%D9%8A%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7&gs_l=mobile-gws-wiz-serp.3..0i19l2j0i22i30i19l4.27651.31920..31944...0.1..2.301.2138.0j5j4j1......0....1.......8..0i71j41j41i71j41i19j41i275j0j0i131j46j0i22i30.eCNdma8SMq4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9945115932256352592,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B7%25D9%2588%25D8%25A7%25D8%25AD%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%2584%25D8%25B7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B7%25D9%2588%25D8%25A7%25D8%25AD%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%2584%25D8%25B7"));
                    startActivity(googleIntent);

                }
                else {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=0QVxXdujJ9G0kwXrvKbICg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AD%D9%85+%D9%88%D9%84%D8%AD%D9%85+%D9%81%D9%8A+%D8%A7%D9%84%D8%B3%D9%84%D8%B7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AD%D9%85+%D9%88+%D9%84%D8%AD%D9%85+%D9%81%D9%8A+&gs_l=mobile-gws-wiz-serp.1.0.0i22i10i30l2j0i22i30l2j0i13i5i30j33i22i29i30l2j33i160.27236.33690..35298...0.1..1.319.2583.0j5j6j1......0....1.......8..0i71j41j41i71j41i19j0j0i131j46j0i19j0i22i30i19j0i22i10i30i19.nv-gK7-s31U#trex=m_t:lcl_akp,rc_ludocids:18400245246986555607,ru_phdesc:u_5j1InbvLw"));
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

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.resturants, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
