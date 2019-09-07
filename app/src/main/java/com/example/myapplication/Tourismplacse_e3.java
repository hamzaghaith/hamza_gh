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

public class Tourismplacse_e3 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"Temple of Artemis","Forum","South Theatre","Hadrian’s Arch","South Gate"};

    String mDescription[] = {"Historical","Historical","Historical","Historical","Historical"};

    int images[] = {R.drawable.templeofartemis, R.drawable.forum, R.drawable.southerntheater, R.drawable.archofhadrian,R.drawable.southgate};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e3);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?source=hp&ei=8vZwXbSsLpDQaKiYipgI&q=%D9%85%D8%B9%D8%A8%D8%AF+%D8%A7%D8%B1%D8%AA%D9%85%D9%8A%D8%B3+%D8%AC%D8%B1%D8%B4&oq=%D9%85%D8%B9%D8%A8%D8%AF+%D8%A7%D8%B1%D8%AA%D9%85%D9%8A%D8%B3+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-hp.3..0i22i30l2.14982.18961..18988...0.0..1.563.2812.0j1j4j3j0j1......0....1.......7..41j0i131j0j46i275j46j0i19j0i22i30i19.YyR9HMRW16E#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9431316274664396885,rc_q:Temple%2520of%2520Artemis,ru_q:Temple%2520of%2520Artemis"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=CPdwXYGUI63DlwTFh7DICQ&q=%D8%B3%D8%A7%D8%AD%D9%87+%D8%A7%D9%84%D9%86%D8%AF%D9%88%D9%87+%D8%AC%D8%B1%D8%B4&oq=%D8%B3%D8%A7%D8%AD%D9%87+%D8%A7%D9%84%D9%86%D8%AF%D9%88%D9%87+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-serp.3..0i22i30l2.119071.122426..122459...0.1..1.306.1829.0j2j3j2......0....1.......8..0i71j41j0j46j46i275j0i30.rrBOV1c8LgI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4450077379372769675,rc_q:Oval%2520Plaza,ru_q:Oval%2520Plaza"));
                    startActivity(googleIntent);

                }




                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=hfdwXYeNGISLlwT8j6S4Cw&q=%D8%A7%D9%84%D9%85%D8%B3%D8%B1%D8%AD+%D8%AC%D8%B1%D8%B4&oq=%D8%A7%D9%84%D9%85%D8%B3%D8%B1%D8%AD+%D8%AC%D8%B1%D8%B4+&gs_l=mobile-gws-wiz-serp.1.0.0i22i30l8.50674.58674..60860...1.1..0.483.2752.2-6j1j2......0....1.......8..0i71j41j0j0i3j46.9H_g4vqSLuY#trex=m_t:lcl_akp,rc_ludocids:2917420277341233835,ru_phdesc:fM8dhedNbhU"));
                    startActivity(googleIntent);
                }


                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=xPdwXdXuJIfQaYP0mcAI&q=%D9%82%D9%88%D8%B3+%D9%87%D8%A7%D8%B1%D8%AF%D9%8A%D9%86+%D8%AC%D8%B1%D8%B4&oq=%D9%82%D9%88%D8%B3+%D9%87%D8%A7%D8%B1%D8%AF%D9%8A%D9%86+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-serp.3..0i13i30j0i8i13i30.24108.30330..30366...1.1..0.568.2232.2-7j5-1......0....1.......8..0i71j41i22i30j41j0j46j46i275j0i19j0i13i30i19j33i160.H6f5EJ1MJ8M#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:8971176916568234845,rc_q:Arch%2520of%2520Hadrian,ru_q:Arch%2520of%2520Hadrian"));
                    startActivity(googleIntent);
                }


                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?source=hp&ei=D_hwXZ6xJ8mNlwSVtaS4Cg&q=%D8%A7%D9%84%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%AC%D9%86%D9%88%D8%A8%D9%8A%D9%87+%D8%AC%D8%B1%D8%B4&oq=%D8%A7%D9%84%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%AC%D9%86%D9%88%D8%A8%D9%8A%D9%87+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-hp.3..0i22i30l2j33i160.1977.8165..8196...1.0..1.2030.7085.2-3j2j1j2j8-1j1......0....1.......8..41i22i30j41j0j0i3j46.83u-uuyOi28#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9499193800307727640,rc_q:South%2520Gate,ru_q:South%2520Gate"));
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
