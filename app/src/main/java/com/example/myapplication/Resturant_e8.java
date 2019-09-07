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

public class Resturant_e8 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Syrian Palace Restaurant", "Formosa Chinese Restaurant"," Captains restaurant ","Royal Yacht Club Restaurant "};
    String mDescription[] = {"", "", "", "", "",""};
    int images[] = {R.drawable.syrianpalacerestaurant
            ,R.drawable.formosachineserestaurant, R.drawable.captainrestaurant,R.drawable.royalyachtclubrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e8);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=0FVzXZG3NrucjLsPj-SE2A8&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%B3%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%B3%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&gs_l=mobile-gws-wiz-serp.3..0i22i30j33i22i29i30.14216.20039..20075...1.1..0.229.2107.0j11j2......0....1.......8..0i71j41j41i19j41i22i30j0j46j33i160.OF0dj319RnY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1603861327271982742,rc_q:Syrian%2520Palace%2520Restaurant,ru_q:Syrian%2520Palace%2520Restaurant"));
                    startActivity(googleIntent);

                }




                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=8FVzXZDgKI6vULvZrfAE&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%B1%D9%85%D9%88%D8%B2%D8%A7+%D8%A7%D9%84%D8%B5%D9%8A%D9%86%D9%8A&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D9%88%D8%B1%D9%85%D9%88%D8%B2%D8%A7&gs_l=mobile-gws-wiz-serp.1.0.0i19l2.21408.45269..46913...2.1..0.242.1786.0j9j2......0....1.......8..0i71j41j41i19j41i22i30j0j46j0i22i30j0i10i19j0i22i30i19j0i22i10i30i19.FAhGb2nclVU#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:13559080879841140636,rc_q:Formosa%2520Chinese%2520Restaurant,ru_q:Formosa%2520Chinese%2520Restaurant"));
                    startActivity(googleIntent);
                }

                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=SlZzXdSdEuPRgwe8j7HAAw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A8%D8%AA%D9%86%D8%B2+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A8%D8%AA%D9%86%D8%B2+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&gs_l=mobile-gws-wiz-serp.3..33i160.6848.11404..11430...1.1..0.235.858.2-4......0....1.........0i71j0i13j0i13i30j0i19.dX2vKnL3Mm4#istate=lrl:iv&rlimm=4374805478833976939"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=V1ZzXaH4F4usUpiOmbgD&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D9%8A%D8%AE%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D9%8A%D8%AE%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87&gs_l=mobile-gws-wiz-serp.3..0i22i30j33i22i29i30.20163.26804..26834...1.0..0.227.2630.0j14j2......0....1.......8..41j41i19j0j46j0i19j0i22i30i19j33i160.lvk6meTV_fg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3597642416339575158,rc_q:Mirwas%2520Cafe%2520and%2520Restaurant,ru_q:Mirwas%2520Cafe%2520and%2520Restaurant"));
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
