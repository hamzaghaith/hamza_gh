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

public class Tourismplacse_e5 extends Activity {

    ListView listview;

    String mTitle [] = new String [] {"Amra Palace","Palace Shabib"};
    String mDescription [] = {"Historical","Historical"};

    int images[] = {R.drawable.amrapalace,R.drawable.shabibpalace};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e5);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MgZxXeiBI8uWsAfWuoCoCw&q=%D9%82%D8%B5%D8%B1+%D8%B9%D9%85%D8%B1%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&oq=%D9%82%D8%B5%D8%B1+%D8%B9%D9%85%D8%B1%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&gs_l=mobile-gws-wiz-serp.3..0i22i30l2.92346.96652..96689...1.1..0.224.1584.0j4j4......0....1.......8..0i71j41i22i10i30j41j41i71j41i19j0i131j0j46j0i19j0i22i30i19j33i160.s035CNhmCws#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4189699778198464204,rc_q:Quseir%2520'Amra,ru_q:Quseir%2520'Amra"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MgZxXeiBI8uWsAfWuoCoCw&q=%D9%82%D8%B5%D8%B1+%D8%B4%D8%A8%D9%8A%D8%A8+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&oq=%D9%82%D8%B5%D8%B1+%D8%B4%D8%A8%D9%8A%D8%A8+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.3073.6708..6767...1.1..0.238.1619.0j3j5......0....1.......8..0i71j41i22i10i30j41j41i71j0i131j0j46j0i22i30.cWTs9-HQCI8#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15903649970668547733,rc_q:Qasr%2520Shabeeb,ru_q:Qasr%2520Shabeeb"));
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
