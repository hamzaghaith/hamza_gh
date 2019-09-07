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

public class Tourismplacse_e2 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"Dar Al Saraya Museum","Arar Cultural House" };
    String mDescription[] = {"Historical","cultural"};
    int images[] = {R.drawable.daralsarayamuseum,R.drawable.ararculturalhouse};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e2);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=RNFwXZGmDqmflwTG5YnABw&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%AF%D8%A7%D8%B1+%D8%A7%D9%84%D8%B3%D8%B1%D8%A7%D9%8A%D8%A7+%D8%A7%D8%B1%D8%A8%D8%AF&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%AF%D8%A7%D8%B1+%D8%A7%D9%84%D8%B3%D8%B1%D8%A7%D9%8A%D8%A7+%D8%A7%D8%B1%D8%A8%D8%AF&gs_l=mobile-gws-wiz-serp.3..0i22i30l2j33i22i29i30.528609.535241..535265...0.1..2.491.2950.0j6j4j1j1......0....1.......8..0i71j41j41i22i30j0i131j0j0i10j0i19j0i22i30i19.62-Gi2Voi0c#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2814077232301631203,rc_q:Irbid%2520Osmanli%2520Saray%2520Museum,ru_q:Irbid%2520Osmanli%2520Saray%2520Museum"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=G-dwXcrlKcGKlwSAj7uICQ&q=%D8%A8%D9%8A%D8%AA+%D8%B9%D8%B1%D8%A7%D8%B1+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A+%D8%A7%D8%B1%D8%A8%D8%AF&oq=%D8%A8%D9%8A%D8%AA+%D8%B9%D8%B1%D8%A7%D8%B1+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A+&gs_l=mobile-gws-wiz-serp.1.0.0i19j0i22i30i19l6j33i160.34394.39008..40764...0.1..0.221.1623.0j7j2......0....1.......8..0i71j41j0j46._zfXu39uOhg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3019751873913304186,rc_q:Arar's%2520Cultural%2520House,ru_q:Arar's%2520Cultural%2520House"));
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
