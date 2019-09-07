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

public class Tourismplacse_e8 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Aqaba Castle", "Mosque of Sharif Hussein bin Ali"
            , "Ghandour Beach", "Aqaba Aquarium", "Wadi Rum"};
    String mDescription[] ={"Historical", "religious","Entertaining", "Entertaining", "Historical Tourist Entertainment"};
    int images[] = {R.drawable.castleaqaba,R.drawable.mosqueofsharifhusseinbinali
            ,R.drawable.ghandourbeach,R.drawable.aqabaaquarium,R.drawable.wadirum};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e8);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=dlRzXYb0KuudjLsPloKd0A8&q=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&oq=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.34875.38033..38104...1.0..0.211.987.0j5j1....2..0....1.......8..41i22i30j41j41i19j0i131j0j46j0i22i30.v7J9VLkepw0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1168212378646810962,rc_q:Aqaba%2520Castle,ru_q:Aqaba%2520Castle"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=nlRzXfXJHIGqgwfDt57ACQ&q=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B4%D8%B1%D9%8A%D9%81+%D8%AD%D8%B3%D9%8A%D9%86+%D8%A8%D9%86+%D8%B9%D9%84%D9%8A&oq=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B4%D8%B1%D9%8A%D9%81+&gs_l=mobile-gws-wiz-serp.1.0.0j0i22i30l7.23134.25517..27395...0.1..0.175.1004.0j7......0....1.......8..0i71j41j41i22i30j41i19.pMwGnbbn6FY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16775853054501355002,rc_q:Sharif%2520Hussein%2520bin%2520Ali%2520Mosque,ru_q:Sharif%2520Hussein%2520bin%2520Ali%2520Mosque"));
                    startActivity(googleIntent);


                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=u1RzXcuxOJGxUKmKjuAM&q=%D8%B4%D8%A7%D8%B7%D8%A6+%D8%A7%D9%84%D8%BA%D9%86%D8%AF%D9%88%D8%B1&oq=%D8%B4%D8%A7%D8%B7%D8%A6+%D8%A7%D9%84%D8%BA%D9%86%D8%AF%D9%88%D8%B1&gs_l=mobile-gws-wiz-serp.3..46i19i275j0i19l2j0i22i30i19l5.27195.33444..33513...1.0..0.239.1248.0j5j2....2..0....1.......8..41j41i22i30j41i19j0i131j0j46.HtnAp9ZB_hg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17445966292116881516,rc_q:Al-Ghandour%2520Beach,ru_q:Al-Ghandour%2520Beach"));
                    startActivity(googleIntent);


                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=31RzXc7jIN6HjLsPuo6q2AI&q=%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%83%D9%88%D8%A7%D8%B1%D9%8A%D9%88%D9%85&oq=%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%83%D9%88%D8%A7%D8%B1%D9%8A%D9%88%D9%85&gs_l=mobile-gws-wiz-serp.3..0i22i30j33i22i29i30.24446.28204..28236...1.0..0.257.1545.0j5j3......0....1.......8..41j41i22i30j41i19j0i131j0j46j0i3j46i275j0i10i30j0i30j33i160.twk9zAq_f10#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:11798860079545269701,rc_q:Aqaba%2520Aquarium,ru_q:Aqaba%2520Aquarium"));
                    startActivity(googleIntent);


                }

                else if(position==4)
                {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=وادي رم");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);


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
