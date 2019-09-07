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

public class Resturant_a8 extends Activity {
    ListView listview;
    String mTitle[]=new String[]{  "مطعم القصر السوري"  , "مطعم فورموزا الصيني", "مطعم كابتنز" , "مطعم نادي اليخوت الملكي"};
    String mDescription[] = {"", "", "", "", "",""};
    int images[] = {R.drawable.syrianpalacerestaurant
            ,R.drawable.formosachineserestaurant, R.drawable.captainrestaurant,R.drawable.royalyachtclubrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a8);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=ICZdXeGQKonKwQKaw6LQBg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%B3%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%B3%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...18244.23354..24212...0.1..0.1567.8603.0j7j3j0j3j2j0j2j1......0....1.........0i71j0i7i30j0i8i30j0i7i10i30.iSZi7CBiMAw#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1603861327271982742,rc_q:Syrian%2520Palace%2520Restaurant,ru_q:Syrian%2520Palace%2520Restaurant"));
                    startActivity(googleIntent);

                }




                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=ViZdXbCLL4TbwAL7souQAg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%82%D9%88%D8%B1%D9%85%D9%88%D8%B2%D8%A7+%D8%A7%D9%84%D8%B5%D9%8A%D9%86%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%82%D9%88%D8%B1%D9%85%D9%88%D8%B2%D8%A7+%D8%A7%D9%84%D8%B5%D9%8A%D9%86%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.35120.43227..43876...0.1..0.219.4583.0j23j3......0....1.........0i71j0i7i10i30j0i7i30j0i8i30j0i13i30.xmdkK3eFo2s#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:13559080879841140636,rc_q:Formosa%2520Chinese%2520Restaurant,ru_q:Formosa%2520Chinese%2520Restaurant"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=hCZdXczvMszDwQL__4b4Bg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A7%D8%A8%D8%AA%D9%86%D8%B2+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A8%D8%AA%D9%86%D8%B2+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.1.0.30i10.40871.46619..48740...0.1..0.290.3600.0j15j4......0....1.........0i71j0i13i30j0i7i30j0i8i30j0i7i10i30.YdserPC3oLw#istate=lrl:iv&rlimm=4374805478833976939"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=tyZdXZ-4KMbLwQKQwrfgCg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D9%8A%D8%AE%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D9%8A%D8%AE%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...33144.40335..40630...0.1..0.367.5547.0j10j10j4......0....1.........0i71j0i7i30j0i8i30j0i7i10i30j30i10.CjJ4PJp--iI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3597642416339575158,rc_q:Mirwas%2520Cafe%2520and%2520Restaurant,ru_q:Mirwas%2520Cafe%2520and%2520Restaurant"));
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
