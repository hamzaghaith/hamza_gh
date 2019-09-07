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

public class Tourismplacse_e6 extends Activity {

    ListView listview;

    String mTitle [] = new String [] {"Dhana Protected Area", "Commodity Castle", "Afra Baths", "Cave Lot"};

    String mDescription [] = {"National Park", "Historical", "Therapeutic", "Historical"};

    int images[] = {R.drawable.dhanareserve, R.drawable.castlegoods, R.drawable.ofrabaths, R.drawable.cavelot};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e6);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MQdxXdqIMo-6kwWWuIiwBg&q=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D8%B6%D8%A7%D9%86%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D8%B6%D8%A7%D9%86%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l2.3864.7864..7909...1.1..1.294.1764.0j3j5......0....1.......8..0i71j41j41i19j41i22i10i30j0j0i131j46i275j46j0i30j0i22i30j0i22i10i30j33i160.Q_dqpT2PcvY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5940986896009862011,rc_q:Dana%2520Biosphere%2520Reserve,ru_q:Dana%2520Biosphere%2520Reserve"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=sAdxXaSeBcS6kwWNibDQBQ&q=%D9%82%D9%84%D8%B9%D8%A9+%D8%A7%D9%84%D8%B3%D9%84%D8%B9+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%82%D9%84%D8%B9%D8%A9+%D8%A7%D9%84%D8%B3%D9%84%D8%B9+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..0i22i10i30j33i160.27171.39232..39269...1.1..0.317.3025.0j3j10j1......0....1.......8..0i71j41j41i19j41i22i10i30j0i131j0j46j46i275j0i22i30j0i19j0i22i30i19.PAA1gtjyizQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:7719945646145139336,rc_q:Sela'%2520Castle,ru_q:Sela'%2520Castle"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=2QdxXYyhIMKbsAe3xqDICg&q=%D8%AD%D9%85%D8%A7%D9%85%D8%A7%D8%AA+%D8%B9%D9%81%D8%B1%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D8%AD%D9%85%D8%A7%D9%85%D8%A7%D8%AA+%D8%B9%D9%81%D8%B1%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..0i22i30l3.39081.43647..43688...1.1..0.259.1903.0j3j6......0....1.......8..0i71j41j41i19j0i131j0j46j0i19j0i22i30i19j33i160.Kgnem7wRcxI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15343974744172080197,rc_q:Afra%2520Hot%2520Springs,ru_q:Afra%2520Hot%2520Springs"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=BwhxXZODF5HXkwX33LGgDQ&q=%D9%83%D9%87%D9%81+%D9%84%D9%88%D8%B7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%83%D9%87%D9%81+%D9%84%D9%88%D8%B7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3...23890.28154..28176...1.1..0.247.1711.0j3j5......0....1.......8..0i71j41j41i19j41i71j0i131j0j46j0i19j0i22i30i19j33i160.YOVb2Qv8KBU#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5354071698814997535,rc_q:Lot's%2520Cave,ru_q:Lot's%2520Cave"));
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
