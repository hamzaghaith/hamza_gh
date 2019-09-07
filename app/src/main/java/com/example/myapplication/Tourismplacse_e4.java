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

public class Tourismplacse_e4 extends Activity {

    ListView listview;
    String mTitle [] = new String [] {"Salt Archaeological Museum", "Orthodox Church", "Ottoman Mosque", "Sail Sixtieth View", "Dead Sea"};
    String mDescription [] = {"Historical", "religious", "religious", "Entertainment", "therapeutic"};

    int images[] = {R.drawable.saltmuseum, R.drawable.achurch, R.drawable.theottomanmosque, R.drawable.overlookingthe60thstreet
            , R.drawable.deadsea};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e4);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=t_9wXaDNM6CDhbIP4_m8kA4&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%84%D8%B7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%84%D8%B7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A&gs_l=mobile-gws-wiz-serp.3..0i22i30j33i160l2.46858.52266..52303...0.0..1.253.2410.0j7j5......0....1.......8..41j41i19j0i131j0j0i19j0i22i30i19.07s_VSf1Ars#trex=m_t:lcl_akp,rc_ludocids:12084846055080725395,ru_phdesc:GMnPGA_cVWU"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=LgBxXYCJOduQ8gLHzLHIBg&q=%D8%A7%D9%84%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%A7%D9%84%D8%A3%D8%B1%D8%AB%D9%88%D8%B0%D9%83%D8%B3%D9%8A%D9%87+%D9%81%D9%8A+%D8%B3%D9%84%D8%B7&oq=%D8%A7%D9%84%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%A7%D9%84%D8%A3%D8%B1%D8%AB%D9%88%D8%B0%D9%83%D8%B3%D9%8A%D9%87+%D9%81%D9%8A+%D8%B3%D9%84%D8%B7&gs_l=mobile-gws-wiz-serp.3...12575.15285..15891...0.1..0.211.1793.0j9j1......0....1.........0i71.toKXnhsYFzg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1265983744569339865,rc_q:St%2520George's%2520Church%252C%2520As-Salt.,ru_q:St%2520George's%2520Church%252C%2520As-Salt"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=LgBxXYCJOduQ8gLHzLHIBg&q=%D8%A7%D9%84%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B9%D8%AB%D9%85%D8%A7%D9%86%D9%8A+%D8%A7%D9%84%D8%B3%D9%84%D8%B7&oq=%D8%A7%D9%84%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B9%D8%AB%D9%85%D8%A7%D9%86%D9%8A+%D8%A7%D9%84%D8%B3%D9%84%D8%B7&gs_l=mobile-gws-wiz-serp.3..33i160.2953.7063..7095...0.1..1.249.2302.0j4j7......0....1.......8..0i71j41j41i19j0j0i3j0i131j46j41i22i30j0i19j0i22i30i19.-CGbL77Wqp8#trex=m_t:lcl_akp,rc_ludocids:14917047501269273784"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=LgBxXYCJOduQ8gLHzLHIBg&q=%D9%85%D8%B7%D9%84+%D8%B4%D8%A7%D8%B1%D8%B9+%D8%A7%D9%84%D8%B3%D8%AA%D9%8A%D9%86&oq=%D9%85%D8%B7%D9%84+%D8%B4%D8%A7%D8%B1%D8%B9+&gs_l=mobile-gws-wiz-serp.1.1.0i19l4j0i22i30i19l3.3456.6112..7671...0.1..0.240.1743.0j6j3......0....1.......8..0i71j41j0i131j0j41i19j46.sy6aOSH3pGg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3255582000708998113,rc_q:%25D9%2585%25D8%25B7%25D9%2584%2520%25D8%25B4%25D8%25A7%25D8%25B1%25D8%25B9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D8%25AA%25D9%258A%25D9%2586,ru_q:%25D9%2585%25D8%25B7%25D9%2584%2520%25D8%25B4%25D8%25A7%25D8%25B1%25D8%25B9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D8%25AA%25D9%258A%25D9%2586"));
                    startActivity(googleIntent);

                }

                else
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.m.wikipedia.org/wiki/Dead_Sea"));
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
