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

public class Resturant_e11 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Baraka House Restaurant", "Petra Kitchen"};


    String mDescription[] = {"","","",""};
    int images[] = {R.drawable.barakahouserestaurant, R.drawable.petrakitchen};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e11);
        listview=(ListView)findViewById(R.id.lv);
        String str[]=new String[]{"Abu Ezz Grills ","Yemen Palace Mandi","Hadramot Restaurant",
                "Aquarium restaurant ","Abu Stayf Restaurant ","Restaurant & Sweets Issa Darwish "};
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=WVtzXcqSMPrigwe62KegBA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%8A%D8%AA+%D8%A7%D9%84%D8%A8%D8%B1%D9%83%D9%87+%D9%85%D8%B9%D8%A7%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%8A%D8%AA+%D8%A7%D9%84%D8%A8%D8%B1%D9%83%D9%87+%D9%85%D8%B9%D8%A7%D9%86&gs_l=mobile-gws-wiz-serp.3..33i22i29i30.10528.19578..19622...0.1..2.213.1995.0j10j2......0....1.......8..0i71j41j41i19j0j46j0i19j0i22i30i19.WJyhtR9NfRs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16402908401146437846,rc_q:House%2520Of%2520Blessing%2520Restaurant%2520%252F%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D9%258A%25D8%25AA%2520%25D8%25A7%25D9%2584%25D8%25A8%25D8%25B1%25D9%2583%25D9%2587,ru_q:House%2520Of%2520Blessing%2520Restaurant%2520%252F%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D9%258A%25D8%25AA%2520%25D8%25A7%25D9%2584%25D8%25A8%25D8%25B1%25D9%2583%25D9%2587"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=hltzXbKvGPuEjLsP3bSPmAY&q=%D9%85%D8%B7%D8%A8%D8%AE+%D8%A7%D9%84%D8%A8%D8%AA%D8%B1%D8%A7%D8%A1&oq=%D9%85%D8%B7%D8%A8%D8%AE+%D8%A7%D9%84%D8%A8%D8%AA%D8%B1%D8%A7%D8%A1&gs_l=mobile-gws-wiz-serp.3..0i19.18874.22972..23002...1.1..0.177.1066.0j7......0....1.......8..0i71j41j41i19j0j46j0i22i30.zpAjffDjAEM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6584750682822410668,rc_q:Petra%2520Kitchen,ru_q:Petra%2520Kitchen"));
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
