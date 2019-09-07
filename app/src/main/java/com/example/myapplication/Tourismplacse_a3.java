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

public class Tourismplacse_a3 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"معبد أرتميس" , "ساحه الندوه" , "المسرح ","قوس هادريان","البوابة الجنوبية"};
    String mDescription[] = {"تاريخي","تاريخي","تاريخي","تاريخي","تاريخي"};
    int images[] = {R.drawable.templeofartemis,R.drawable.forum,R.drawable.southerntheater,R.drawable.archofhadrian,R.drawable.southgate};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a3);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=XPpcXfzAAoXCwAKOz62oCQ&q=%D9%85%D8%B9%D8%A8%D8%AF+%D8%A7%D8%B1%D8%AA%D9%85%D9%8A%D8%B3+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B9%D8%A8%D8%AF+%D8%A7%D8%B1%D8%AA%D9%85%D9%8A%D8%B3+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i7i30l8.37428.44736..45653...1.0..1.2167.6507.3-1j1j1j0j1j1j1......0....1.txLUnhvl96g#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9431316274664396885,rc_q:%25D9%2587%25D9%258A%25D9%2583%25D9%2584%2520%25D8%25A2%25D8%25B1%25D8%25AA%25D9%2585%25D9%258A%25D8%25B3,ru_q:%25D9%2587%25D9%258A%25D9%2583%25D9%2584%2520%25D8%25A2%25D8%25B1%25D8%25AA%25D9%2585%25D9%258A%25D8%25B3"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=kPpcXfvXKsvewQKJiZxg&q=%D8%B3%D8%A7%D8%AD%D9%87+%D8%A7%D9%84%D9%86%D8%AF%D9%88%D9%87+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%B3%D8%A7%D8%AD%D9%87+%D8%A7%D9%84%D9%86%D8%AF%D9%88%D9%87+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...41666.47684..48063...0.1..0.279.2788.0j12j3......0....1.........0i71j0i7i30j30i10.R_t3-Nsp_AQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4450077379372769675,rc_q:%25D8%25B3%25D8%25A7%25D8%25AD%25D8%25A9%2520%25D8%25A7%25D9%2584%25D9%2586%25D8%25AF%25D9%2588%25D8%25A9,ru_q:%25D8%25B3%25D8%25A7%25D8%25AD%25D8%25A9%2520%25D8%25A7%25D9%2584%25D9%2586%25D8%25AF%25D9%2588%25D8%25A9"));
                    startActivity(googleIntent);

                }




                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=wvpcXcjBOor6wALN96Ao&q=%D8%A7%D9%84%D9%85%D8%B3%D8%B1%D8%AD+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D9%85%D8%B3%D8%B1%D8%AD+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...7290.11929..12945...0.1..0.203.1673.0j9j1......0....1.........0i71j0i7i30j0i8i7i30j30i10.VjuFaK91p1w#istate=lrl:iv&rlimm=2917420277341233835"));
                    startActivity(googleIntent);
                }


                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=8vpcXdmZHcTLwQL91qrAAg&q=%D9%82%D9%88%D8%B3+%D9%87%D8%A7%D8%B1%D8%AF%D9%8A%D9%86+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%82%D9%88%D8%B3+%D9%87%D8%A7%D8%B1%D8%AF%D9%8A%D9%86+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.57471.68065..69086...0.1..0.6134.17948.2-6j5j9-3......0....1.........0i71j0i7i30.ttdcSR2JXXk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:8971176916568234845,rc_q:%25D9%2582%25D9%2588%25D8%25B3%2520%25D9%2587%25D8%25A7%25D8%25AF%25D8%25B1%25D9%258A%25D8%25A7%25D9%2586,ru_q:%25D9%2582%25D9%2588%25D8%25B3%2520%25D9%2587%25D8%25A7%25D8%25AF%25D8%25B1%25D9%258A%25D8%25A7%25D9%2586"));
                    startActivity(googleIntent);
                }


                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=iftcXbemDcXNwQLY0LW4Aw&q=%D8%A7%D9%84%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%AC%D9%86%D9%88%D8%A8%D9%8A%D9%87+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%AC%D9%86%D9%88%D8%A8%D9%8A%D9%87+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i71l5.2981.9156..9955...0.1..0.0.0.......0....1.LBMmQZ36NhI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9499193800307727640,rc_q:%25D8%25A7%25D9%2584%25D8%25A8%25D9%2588%25D8%25A7%25D8%25A8%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25AC%25D9%2586%25D9%2588%25D8%25A8%25D9%258A%25D8%25A9,ru_q:%25D8%25A7%25D9%2584%25D8%25A8%25D9%2588%25D8%25A7%25D8%25A8%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25AC%25D9%2586%25D9%2588%25D8%25A8%25D9%258A%25D8%25A9"));
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
