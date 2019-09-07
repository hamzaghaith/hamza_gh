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

public class Tourismplacse_e10 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Madaba Archaeological Museum", "St. George Greek Orthodox Church", "Church of the Apostles"};
    String mDescription[] = {"Historical", "religious + historical", "religious + historical"};
    int images[] = {R.drawable.madabaarchaeologicalmuseum,R.drawable.greekorthodox,R.drawable.churchoftheapostles};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e10);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=-VhzXbegI9SbjLsPipm28Aw&q=%D9%85%D8%AA%D8%AD%D9%81+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A&oq=%D9%85%D8%AA%D8%AD%D9%81+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A&gs_l=mobile-gws-wiz-serp.3..0i19j33i22i29i30j33i160.32851.37994..38034...1.1..0.183.1542.0j10......0....1.......8..0i71j41j41i22i10i30i19j0j0i22i30i19j0i22i30.Nft6qKe-waQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10550674986140970688,rc_q:Madaba%2520Archaeological%2520Museum,ru_q:Madaba%2520Archaeological%2520Museum"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=IVlzXdLbG8GGjLsP87uXiAM&q=Greek+Orthodox+Basilica+of+Saint+George&oq=Greek+Orthodox+Basilica+of+Saint+George&gs_l=mobile-gws-wiz-serp.3..0l2j0i22i30l3j0i22i10i30j0i22i30l2.3438.36218..37133...1.1..0.182.1333.0j9......0....1.......8..0i71j41j41i22i10i30i19j0i131j46i275j46j0i19j0i22i30i19.RsDkE_TKOQQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:7332986411042896643,rc_q:Greek%2520Orthodox%2520Basilica%2520of%2520Saint%2520George,ru_q:Greek%2520Orthodox%2520Basilica%2520of%2520Saint%2520George"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=XllzXdnJII-gUJqAhBA&q=%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%A7%D9%84%D8%B1%D8%B3%D9%84+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&oq=%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%A7%D9%84%D8%B1%D8%B3%D9%84+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l3j33i22i29i30j33i160l3.25009.38554..38621...1.1..0.178.2481.0j17......0....1.......8..0i71j41j0i131j0j46i275j46j0i10i19j0i10i30i19j0i13j0i13i30i19j0i8i13i30i19j33i21j0i22i30.xUp5ZvJeOo0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17972147527194103117,rc_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B1%25D8%25B3%25D9%2584,ru_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B1%25D8%25B3%25D9%2584"));
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
