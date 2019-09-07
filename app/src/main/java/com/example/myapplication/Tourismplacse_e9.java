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

public class Tourismplacse_e9 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Karak Castle", "The shrine of the Prophet Noah", "Wadi Bin Hammad"};
    String mDescription[] = {"Historical", "Historical", "Historical"};
    int images[] = {R.drawable.karakcastle,R.drawable.noah,R.drawable.wadibinhammad};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e9);
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

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=dFZzXYziNf-AjLsP6bOJmA4&q=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D9%83%D8%B1%D9%83&oq=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D9%83%D8%B1%D9%83&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.193811.196254..196328...1.0..0.220.979.0j5j1......0....1.......8..41j41i19j0i131j0j46j0i22i30.zOnR6Z42LPY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17300158050447422158,rc_q:Al%2520Karak%2520Castle,ru_q:Al%2520Karak%2520Castle"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=OldzXczqMpOCjLsPpoKumA4&q=%D9%85%D9%82%D8%A7%D9%85+%D8%A7%D9%84%D9%86%D8%A8%D9%8A+%D9%86%D9%88%D8%AD+%D8%A7%D9%84%D9%83%D8%B1%D9%83&oq=%D9%85%D9%82%D8%A7%D9%85+%D8%A7%D9%84%D9%86%D8%A8%D9%8A+%D9%86%D9%88%D8%AD+%D8%A7%D9%84%D9%83%D8%B1%D9%83&gs_l=mobile-gws-wiz-serp.3..0i22i30l3j33i160.26594.32184..32210...0.1..2.216.1593.0j8j2....2..0....1.......8..0i71j41j41i19j0j46j0i19j0i22i30i19.EiW19HDPqvc#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:626935843043152534,rc_q:Prophet%2520Nuh%2520Tomb,ru_q:Prophet%2520Nuh%2520Tomb"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=gVdzXeyABou0UraSuegF&q=%D9%88%D8%A7%D8%AF%D9%8A+%D8%A8%D9%86+%D8%AD%D9%85%D8%A7%D8%AF&oq=%D9%88%D8%A7%D8%AF%D9%8A+%D8%A8%D9%86+%D8%AD%D9%85%D8%A7%D8%AF&gs_l=mobile-gws-wiz-serp.3..41l2j0i19l3j0i22i30i19l4.39902.42047..42067...0.0..0.189.811.0j5......0....1.........0i22i10i30i19.Efdl6o25ktU#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5648649687470933166,rc_q:Wadi%2520Bin%2520Hammad,ru_q:Wadi%2520Bin%2520Hammad"));
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
