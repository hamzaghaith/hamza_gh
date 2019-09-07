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

public class Tourismplacse_e1 extends Activity {


    ListView listview;

    String mTitle[]=new String[]{"Mountain Castle","Royal Automobile Museum"
            ,"Museum Of Jordan","Abu Darwish Mosque","The Umayyad Palace","King Abdullah I Mosque"
            ,"Prince Hashim Park For Birds","Haya Cultural Center","Children Museum"
            ,"Al Hussein Amusement Park","Garden Zahran","Roman Amphitheater",
            "Amman Waves"};


    String mDescription[] = {"Historical","Historical","The Jordanian Museum displays the cultural and historical heritage of the Kingdom"
            ,"religious","Historical","religious","entertaining","scientific"
            ,"entertaining + scientific","entertaining","entertaining","Historical","entertaining"};
    int images[] = {R.drawable.mountaincastle, R.drawable.museumofcars, R.drawable.museumofjordan
            , R.drawable.abudarwishmosque,R.drawable.theumayyadpalace, R.drawable.kingabdullahmosque
            , R.drawable.princehashimpark, R.drawable.hayacenter, R.drawable.childrenmuseum
            , R.drawable.alhusseinamusementpark, R.drawable.gardenzahran, R.drawable.romanamphitheater
            , R.drawable.wavesofamman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e1);
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

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?source=hp&ei=T8hwXY3LG5CymwWqnqigDA&q=%D8%AC%D8%A8%D9%84+%D8%A7%D9%84%D9%82%D9%84%D8%B9%D9%87+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=&gs_l=mobile-gws-wiz-hp.1.0.41.0.0..4832...0.0..0.0.0.......0...........1....19%3A1.sCUTZJQpJWg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9499811042245705325,rc_q:Amman%2520Citadel,ru_q:Amman%2520Citadel"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?source=hp&ei=T8hwXY3LG5CymwWqnqigDA&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B1%D8%A7%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B1%D8%A7%D8%AA+&gs_l=mobile-gws-wiz-hp.1.0.0l5j0i22i30l3.40498.44487..46026...0.0..0.264.1960.0j9j2......0....1.......0..41j0i131j46i10i275j0i10j46i10..19%3A1.DcDp2vinE0g#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:18136617922223968927,rc_q:The%2520Royal%2520Automobile%2520Museum,ru_q:The%2520Royal%2520Automobile%2520Museum"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=zMhwXaWyG7WDk74PuJCaOA&q=%D9%85%D8%AA%D8%A7%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86+%D8%B9%D9%85%D8%A7%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86+%D8%B9&gs_l=mobile-gws-wiz-serp.1.0.0i22i30l8.27302.40674..42234...0.1..0.228.3508.0j15j4......0....1.........0i71j41j0j0i22i10i30j0i19j0i22i30i19.lPr7YAA9suY#istate=lrl:iv&rlimm=11028271676819487402"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=-MhwXfflNNWCk74PpJ6o2Ac&q=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A3%D8%A8%D9%88+%D8%AF%D8%B1%D9%88%D9%8A%D8%B4&oq=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A3%D8%A8%D9%88+%D8%AF%D8%B1%D9%88%D9%8A%D8%B4&gs_l=mobile-gws-wiz-serp.3..0i19l2j0i22i30i19l6.52812.58969..59041...1.1..0.228.1727.0j6j3......0....1.......0..0i71j41i22i30j41j0j0i131j0i22i30..19%3A2.WR0wGX02mFg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16928681649168960901,rc_q:Abu%2520Darwish%2520Mosque,ru_q:Abu%2520Darwish%2520Mosque"));
                    startActivity(googleIntent);
                }

                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=NclwXdiCMrGUk74PhPCzsAw&q=%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%A3%D9%85%D9%88%D9%8A+%D8%B9%D9%85%D8%A7%D9%86&oq=%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%A7%D9%85%D9%88%D9%8A+&gs_l=mobile-gws-wiz-serp.1.0.0i19l5j0i22i30i19l3.26167.30594..33151...0.1..0.332.1675.0j4j3j1......0....1.......1..0i71j41j0j0i3j46.eDWBHZOb3NM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:676056873832747419,rc_q:Umayyad%2520Monumental%2520Gateway,ru_q:Umayyad%2520Monumental%2520Gateway"));
                    startActivity(googleIntent);
                }





                else if(position==5)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=WclwXdX0BKyFk74P3p-SuA0&q=%D8%B9%D9%85%D8%A7%D9%86+%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D9%85%D9%84%D9%83+%D8%B9%D8%A8%D8%AF%D8%A7%D9%84%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D9%88%D9%84&oq=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D9%85%D9%84%D9%83+%D8%B9%D8%A8%D8%AF%D8%A7%D9%84%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D9%88%D9%84%D8%B9%D9%85%D8%A7%D9%86+&gs_l=mobile-gws-wiz-serp.1.0.0i8i13i30.145984.151585..153191...0.1..1.295.2246.0j7j4......0....1.......2..0i71j41i19j41j0j0i131j0i19.C9NFPMD50r0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:8747785961198841361,rc_q:King%2520Abdullah%2520I%2520Mosque,ru_q:King%2520Abdullah%2520I%2520Mosque"));
                    startActivity(googleIntent);
                }

                else if(position==6)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=9MlwXZzEEZvImwXxuKv4Bw&q=%D8%AD%D8%AF%D9%8A%D9%82%D8%A9+%D8%A7%D9%84%D8%A7%D9%85%D9%8A%D8%B1+%D9%87%D8%A7%D8%B4%D9%85+%D9%84%D9%84%D8%B7%D9%8A%D9%88%D8%B1&oq=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D9%84%D8%A3%D9%85%D9%8A%D8%B1+%D9%87%D8%A7%D8%B4%D9%85+%D9%84%D9%84&gs_l=mobile-gws-wiz-serp.1.0.0i22i30l8.33541.40743..42250...0.1..1.273.2268.0j5j6......0....1.......3..0i71j41i8i13i30j41i19j41j0j0i131j46j0i19j33i160.UCuqpfWohhw#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5777270704443717725,rc_q:Prince%2520Hashem%2520Bird%2520Garden,ru_q:Prince%2520Hashem%2520Bird%2520Garden"));
                    startActivity(googleIntent);
                }

                else if(position==7)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=IcpwXZGdCcebsAezubmQBQ&q=%D9%85%D8%B1%D9%83%D8%B2+%D9%87%D9%8A%D8%A7+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A&oq=%D9%85%D8%B1%D9%83%D8%B2+%D9%87%D9%8A%D8%A7+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A&gs_l=mobile-gws-wiz-serp.3..0l2j0i22i30l6.43498.47411..47476...1.0..0.226.1845.0j3j6......0....1.......4..41i22i30j41i8i13i30j41i19j41j0i131j46.LI6LxC27DUQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2584795749434263864,rc_q:Haya%2520Cultural%2520Center,ru_q:Haya%2520Cultural%2520Center"));
                    startActivity(googleIntent);
                }


                else if(position==8)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=UspwXamhM6HksAe_hYS4Bg&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B7%D9%81%D8%A7%D9%84&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B7%D9%81%D8%A7%D9%84&gs_l=mobile-gws-wiz-serp.3..0l5j0i22i30l3.174812.181411..181457...1.1..0.278.2226.0j7j4......0....1.......5..0i71j41j41i22i30j41i8i13i30j41i19j0i131.OGiscF0kb2g#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3876842621358414087,rc_q:The%2520Children's%2520Museum%2520Jordan,ru_q:The%2520Children's%2520Museum%2520Jordan"));
                    startActivity(googleIntent);
                }

                else if(position==9)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=C8twXbXULMGtkwXO16NA&q=%D9%85%D9%84%D8%A7%D9%87%D9%8A+%D8%A7%D9%84%D8%AD%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D8%AA%D8%B1%D9%81%D9%8A%D9%87%D9%8A%D8%A9&oq=%D9%85%D9%84%D8%A7%D9%87%D9%8A+%D8%A7%D9%84%D8%AD%D8%B3%D9%8A%D9%86+&gs_l=mobile-gws-wiz-serp.1.0.0i19j0i22i30i19l7.30327.34691..36524...0.1..0.205.1323.0j7j1......0....1.......6..0i71j41j41i22i30j41i8i13i30j41i19j0i131j0j46i275j46.vZkCLDsXyWM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15761097376142268033,rc_q:Hussain%2520Luna%2520Park,ru_q:Hussain%2520Luna%2520Park"));
                    startActivity(googleIntent);
                }

                else if(position==10)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MstwXYOiFYXisAeP1Z7IBw&q=%D8%AD%D8%AF%D9%8A%D9%82%D9%87+%D8%B2%D9%87%D8%B1%D8%A7%D9%86&oq=%D8%AD%D8%AF%D9%8A%D9%82%D9%87+%D8%B2%D9%87%D8%B1%D8%A7%D9%86&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.47963.51072..51130...1.1..0.207.1074.0j5j1......0....1.......7..0i71j41i19j41j41i22i30j41i8i13i30j0j46j0i22i30.QdKxd3qDRTk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1849906377410654634,rc_q:Zahran%2520Park,ru_q:Zahran%2520Park"));
                    startActivity(googleIntent);
                }


                else if(position==11)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=aMtwXbHIE4OZkwWkjqHoBQ&q=%D8%A7%D9%84%D9%85%D8%AF%D8%B1%D8%AC+%D8%A7%D9%84%D8%B1%D9%88%D9%85%D8%A7%D9%86%D9%8A&oq=%D8%A7%D9%84%D9%85%D8%AF%D8%B1%D8%AC+%D8%A7%D9%84%D8%B1%D9%88%D9%85%D8%A7%D9%86%D9%8A&gs_l=mobile-gws-wiz-serp.3..0l6j0i22i30l2.26927.31064..31131...1.2..0.216.1377.0j6j2......0....1.......8..0i71j41j41i19j41i22i30j41i8i13i30j0i3j46.5zC5eqWD93E#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14245721869500264713,rc_q:Roman%2520Theatre,ru_q:Roman%2520Theatre"));
                    startActivity(googleIntent);
                }


                else

                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=ictwXbqnIcTTsAf6_pnYCA&q=%D8%B9%D9%85%D8%A7%D9%86+%D9%88%D9%8A%D9%81%D8%B2&oq=%D8%B9%D9%85%D8%A7%D9%86&gs_l=mobile-gws-wiz-serp.1.2.41i8i13i30j46i275j0l4j46j0l2.22100.22911..24484...0.1..0.683.1160.0j3j5-1......0....1.......8..0i71j41j41i19j41i22i30j0i3.ZgO5lG-G8c8#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15610763974014538404,rc_q:Amman%2520Waves,ru_q:Amman%2520Waves"));
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
