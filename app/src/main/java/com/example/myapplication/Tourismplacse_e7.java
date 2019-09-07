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

public class Tourismplacse_e7 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Ajloun Castle", "Ajloun Forest Park and Reserve", "Ashtafina Tourist Park"
            , "The tourist path of the mountain", "Deben Forest Reserve", "Our Lady of the Mountain Church"};
    String mDescription[] = {"Historical", "Recreational", "Recreational", "Tourist Attraction", "National Protected Area", "Religious"};
    int images[] = {R.drawable.ajlooncastle, R.drawable.ajlounforestpark,R.drawable.ishtafinatouristpark
            ,R.drawable.thepathofthetourist,R.drawable.dibeenforestreserve,R.drawable.churchofourladyofthemountain};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_e7);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=sVJzXfyuKuidjLsP0MumoAo&q=Ajloon+Castle&oq=Ajloon+Castle&gs_l=mobile-gws-wiz-serp.3..0i10l8.27407.27407..28624...0.1..0.173.173.0j1......0....1.......1..0i71j41.hu8o3lSUECE#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:12472082876583266860,rc_q:%25D9%2585%25D8%25B1%25D9%2583%25D8%25B2%2520%25D8%25B2%25D9%2588%25D8%25A7%25D8%25B1%2520%25D9%2585%25D8%25AD%25D8%25A7%25D9%2581%25D8%25B8%25D8%25A9%2520%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586%2520(%25D9%2585%25D8%25AF%25D9%258A%25D8%25B1%25D9%258A%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D8%25A9),ru_q:%25D9%2585%25D8%25B1%25D9%2583%25D8%25B2%2520%25D8%25B2%25D9%2588%25D8%25A7%25D8%25B1%2520%25D9%2585%25D8%25AD%25D8%25A7%25D9%2581%25D8%25B8%25D8"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=0FJzXZj8HdiDjLsPi6aEoAM&q=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D9%88%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%B9%D8%AC%D9%84%D9%88%D9%86&oq=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D9%88%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%B9%D8%AC%D9%84%D9%88%D9%86&gs_l=mobile-gws-wiz-serp.3..0i22i30l2.55752.61512..61543...1.1..0.205.1496.0j9j1......0....1.......2..0i71j41j0j46j0i19j0i22i30i19j33i22i29i30.vt-hFuY1Zq8#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6033599800690261870,rc_q:Ajloun%2520Forest%2520Reserve,ru_q:Ajloun%2520Forest%2520Reserve"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=EFNzXZqgCZGsUvHwqNAK&q=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D8%B4%D8%AA%D9%81%D9%8A%D9%86%D8%A7+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86&oq=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D8%B4%D8%AA%D9%81%D9%8A%D9%86%D8%A7+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A+&gs_l=mobile-gws-wiz-serp.1.0.0i19j0i22i30i19j33i160l2.30823.36179..38664...0.1..0.205.1773.0j9j2......0....1.......3..0i71j41j0j46.eYq7oGe0Ies#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10211078725541908745,rc_q:Ishtafina%2520Park%2520Tourism,ru_q:Ishtafina%2520Park%2520Tourism"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=EFNzXZqgCZGsUvHwqNAK&q=%D9%85%D8%B3%D8%A7%D8%B1+%D8%A7%D9%84%D8%AC%D8%A8+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A&oq=%D9%85%D8%B3%D8%A7%D8%B1+%D8%A7%D9%84%D8%AC%D8%A8+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A&gs_l=mobile-gws-wiz-serp.3..0i19j33i160.2971.6672..6697...1.1..1.725.2769.0j4j0j3j1j0j1......0....1.......4..0i71j41j41i19j0j46j0i22i10i30i19j0i22i30i19j0i22i30.IErjvkgVOsk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5865522979500227194,rc_q:%25D9%2585%25D8%25B3%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D9%258A,ru_q:%25D9%2585%25D8%25B3%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D9%258A"));
                    startActivity(googleIntent);

                }

                else if(position==4)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=XFNzXYb2A5yDjLsPgrujoA4&q=%D9%85%D8%AD%D9%85%D9%8A%D8%A9+%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%AF%D8%A8%D9%8A%D9%86&oq=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D9%88+%D8%BA%D8%A7%D8%A8%D8%A7&gs_l=mobile-gws-wiz-serp.1.1.0i22i30l8.24109.33752..34929...2.0..0.340.2651.0j10j2j2......0....1.......5..41j41i19j0j46i275j46j0i30j0i22i10i30j33i22i29i30j33i160.VoPncNRd-MY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14925668244918489302,rc_q:Dibbeen%2520Forest%2520Reserve,ru_q:Dibbeen%2520Forest%2520Reserve"));
                    startActivity(googleIntent);

                }

                else if(position==5)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=gFNzXaDtIcrkgweQy5zgBQ&q=%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%B3%D9%8A%D8%AF%D9%87+%D8%A7%D9%84%D8%AC%D8%A8%D9%84+%D8%B9%D8%AC%D9%84%D9%88%D9%86&oq=%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%B3%D9%8A%D8%AF%D9%87+%D8%A7%D9%84%D8%AC%D8%A8%D9%84+%D8%B9%D8%AC%D9%84%D9%88%D9%86&gs_l=mobile-gws-wiz-serp.3..0i22i30l3.23485.31417..31462...1.1..0.307.2128.0j7j3j1......0....1.......6..0i71j41i22i30j41j41i19j0j46j46i275j0i10i19j0i10i30i19j0i19j0i13i30i19j0i22i10i30i19j33i160.8dKszuNipmA#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:8357605594836829364,rc_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25B3%25D9%258A%25D8%25AF%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%25D9%2584,ru_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8"));
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
