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

public class Tourismplacse_a1 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{" جبل القلعة  ", "متحف السيارات الملكي"
            ,"متحف الأردن" , "مسجد أبو درويش","القصر الأموي" , "مسجد الملك عبد الله الأول"
            ,"منتزه الأمير هاشم للطيور" , "مركز هيا الثقافي" , "متحف الأطفال"
            ,"ملاهي الحسين" , "حديقة زهران" , "المدرج الروماني",
            "أمواج عمان"};

    String mDescription[] = {"تاريخي","تاريخي","يعرض متحف الأردن تراث المملكة الحضاري والتاريخي"
            ,"ديني","تاريخي","ديني","ترفيهي","علمي","ترفيهي + علمي","ترفيهي","ترفيهي","تاريخي","ترفيهي"};
    int images[] = {R.drawable.mountaincastle, R.drawable.museumofcars, R.drawable.museumofjordan
            , R.drawable.abudarwishmosque,R.drawable.theumayyadpalace, R.drawable.kingabdullahmosque
            , R.drawable.princehashimpark, R.drawable.hayacenter, R.drawable.childrenmuseum
            , R.drawable.alhusseinamusementpark, R.drawable.gardenzahran, R.drawable.romanamphitheater
            , R.drawable.wavesofamman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a1);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=8t9cXeyFN47FwQKYn6XQBg&q=%D8%AC%D8%A8%D9%84+%D8%A7%D9%84%D9%82%D9%84%D8%B9%D9%87+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%AC%D8%A8%D9%84+%D8%A7%D9%84%D9%82%D9%84%D8%B9%D9%87+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..41.3362.19264..19283...0.0..0.0.0.......0....1.......1.fWbOlyNWT-A#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9499811042245705325,rc_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25B9%25D9%2585%25D8%25A7%25D9%2586,ru_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25B9%25D9%2585%25D8%25A7%25D9%2586"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=e_RcXc31Cs7ZwAK8vbWYAw&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B1%D8%A7%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B1%D8%A7%D8%AA+%D8%A7%D9%84%D9%85%D9%84%D9%83%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...63284.71483..72363...0.1..1.1849.7099.0j7j3j2j3j7-1j1......0....1.........0i71j30i10.0z-2e4QsdQA#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:18136617922223968927,rc_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25B1%25D8%25A7%25D8%25AA%2520%25D8%25A7%25D9%2584%25D9%2585%25D9%2584%25D9%2583%25D9%258A,ru_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25B1%25D8%25A7%25D8%25AA%2520%25D8%25A7%25D9%2584%25D9%2585%25D9%2584%25D9%2583%25D9%258A"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=1vRcXenbEoHYwAKasoH4CA&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...36534.45634..46454...1.1..0.1084.5334.0j8j2j2j1j2j0j1......0....1.........0i71j0i7i30j0i13i30j0i8i13i30.37Hezd9br2A#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:11028271676819487402,rc_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D8%25A3%25D8%25B1%25D8%25AF%25D9%2586,ru_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D8%25A3%25D8%25B1%25D8%25AF%25D9%2586"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=B_VcXYsvzM_AAqeyvbAE&q=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A3%D8%A8%D9%88+%D8%AF%D8%B1%D9%88%D9%8A%D8%B4+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A3%D8%A8%D9%88+%D8%AF%D8%B1%D9%88%D9%8A%D8%B4+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i30.39940.45708..47332...0.1..0.587.5238.0j3j10j1j2j2......0....1.........0i71j0i7i30j0i8i30j46i67.6npXQ4nYI9w#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16928681649168960901,rc_q:%25D9%2585%25D8%25B3%25D8%25AC%25D8%25AF%2520%25D8%25A3%25D8%25A8%25D9%2588%2520%25D8%25AF%25D8%25B1%25D9%2588%25D9%258A%25D8%25B4,ru_q:%25D9%2585%25D8%25B3%25D8%25AC%25D8%25AF%2520%25D8%25A3%25D8%25A8%25D9%2588%2520%25D8%25AF%25D8%25B1%25D9%2588%25D9%258A%25D8%25B4"));
                    startActivity(googleIntent);
                }

                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=OPVcXbC6LMb4wALQ-oyICA&q=%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%A7%D9%85%D9%88%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D9%82%D8%B5%D8%B1+%D8%A7%D9%84%D8%A7%D9%85%D9%88%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...147055.152951..153738...1.1..0.229.3301.0j12j6......0....1.........0i71j0i7i30j0i8i30j46i67j0i8i7i30j0i7i5i30j0i13i30j0i13i5i30j0i8i13i30j30i10.ZCC0Y5tIqBk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:676056873832747419,rc_q:%25D8%25A7%25D9%2584%25D9%2582%25D8%25B5%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25A3%25D9%2585%25D9%2588%25D9%258A,ru_q:%25D8%25A7%25D9%2584%25D9%2582%25D8%25B5%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25A3%25D9%2585%25D9%2588%25D9%258A"));
                    startActivity(googleIntent);
                }





                else if(position==5)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&q=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D9%85%D9%84%D9%83+%D8%B9%D8%A8%D8%AF%D8%A7%D9%84%D9%84%D9%87+%D8%A7%D9%84%D8%A3%D9%88%D9%84+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&spell=1&sa=X&ved=0ahUKEwiexZrHu5PkAhWOaVAKHZ4QBvYQBQgkKAA#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:8747785961198841361,rc_q:%25D9%2585%25D8%25B3%25D8%25AC%25D8%25AF%2520%25D8%25A7%25D9%2584%25D9%2585%25D9%2584%25D9%2583%2520%25D8%25B9%25D8%25A8%25D8%25AF%25D8%25A7%25D9%2584%25D9%2584%25D9%2587%2520%25D8%25A7%25D9%2584%25D8%25A3%25D9%2588%25D9%2584,ru_q:%25D9%2585%25D8%25B3%25D8%25AC%25D8%25AF%2520%25D8%25A7%25D9%2584%25D9%2585%25D9%2584%25D9%2583%2520%25D8%25B9%25D8%25A8%25D8%25AF%25D8%25A7%25D9%2584%25D9%2584%25D9%2587%2520%25D8%25A7%25D9%2584%25D8%25A3%25D9%2588%25D9%2584"));
                    startActivity(googleIntent);
                }

                else if(position==6)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=BvZcXfT8HIbIwALf_oGgCw&q=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D9%84%D8%A3%D9%85%D9%8A%D8%B1+%D9%87%D8%A7%D8%B4%D9%85+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D9%84%D8%A3%D9%85%D9%8A%D8%B1+%D9%87%D8%A7%D8%B4%D9%85+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i71l5.24845.32076..33204...0.1..0.0.0.......0....1.e2om68AsQ_M#istate=lrl:iv&rlimm=5777270704443717725"));
                    startActivity(googleIntent);
                }

                else if(position==7)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=BvZcXfT8HIbIwALf_oGgCw&q=%D9%85%D8%B1%D9%83%D8%B2+%D9%87%D9%8A%D8%A7+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B1%D9%83%D8%B2+%D9%87%D9%8A%D8%A7+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...23139.29740..30506...0.1..0.520.7907.2-3j16j2j2......0....1.........0i71j0i7i30j46i67j30i10.xC3lfc8JXCU#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2584795749434263864,rc_q:%25D9%2585%25D8%25B1%25D9%2583%25D8%25B2%2520%25D9%2587%25D9%258A%25D8%25A7%2520%25D8%25A7%25D9%2584%25D8%25AB%25D9%2582%25D8%25A7%25D9%2581%25D9%258A,ru_q:%25D9%2585%25D8%25B1%25D9%2583%25D8%25B2%2520%25D9%2587%25D9%258A%25D8%25A7%2520%25D8%25A7%25D9%2584%25D8%25AB%25D9%2582%25D8%25A7%25D9%2581%25D9%258A"));
                    startActivity(googleIntent);
                }


                else if(position==8)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=BvZcXfT8HIbIwALf_oGgCw&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B7%D9%81%D8%A7%D9%84+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%A7%D8%B7%D9%81%D8%A7%D9%84+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...8099.14710..15490...0.1..0.257.257.2-1......0....1.........0i71.TZqzWUKbeZA#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3876842621358414087,rc_q:The%2520Children's%2520Museum%2520Jordan%2520-%2520%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D8%25A3%25D8%25B7%25D9%2581%25D8%25A7%25D9%2584%2520%25D8%25A7%25D9%2584%25D8%25A3%25D8%25B1%25D8%25AF%25D9%2586,ru_q:The%2520Children's%2520Museum%2520Jordan%2520-%2520%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D8%25A3%25D8%25B7%25D9%2581%25D8%25A7%25D9%2584%2520%25D8%25A7%25D9%2584%25D8%25A3%25D8%25B1%25D8%25AF%25D9%2586"));
                    startActivity(googleIntent);
                }

                else if(position==9)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=v_ZcXajuIYmmwQLHnq2ACQ&q=%D9%85%D9%84%D8%A7%D9%87%D9%8A+%D8%A7%D9%84%D8%AD%D8%B3%D9%8A%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D9%84%D8%A7%D9%87%D9%8A+%D8%A7%D9%84%D8%AD%D8%B3%D9%8A%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...68198.73876..74889...0.1..0.586.4526.0j4j8j0j2j2......0....1.........0i71j0i7i30j0i30j0i8i30j46i67j30i10.tB2oalGb7i0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15761097376142268033,rc_q:%25D9%2585%25D8%25AF%25D9%258A%25D9%2586%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25AD%25D8%25B3%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25AA%25D8%25B1%25D9%2581%25D9%258A%25D9%2587"));
                    startActivity(googleIntent);
                }

                else if(position==10)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=DPdcXY6WL4nIwQLv4YnIDw&q=%D8%AD%D8%AF%D9%8A%D9%82%D9%87+%D8%B2%D9%87%D8%B1%D8%A7%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%AD%D8%AF%D9%8A%D9%82%D9%87+%D8%B2%D9%87%D8%B1%D8%A7%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...60431.66320..67158...0.1..0.1512.6146.0j7j3j5-1j1j1j1......0....1.........0i71j0i7i30j46i67j0i8i7i30j0i13i30j0i8i13i30j30i10.HGP4kzu4rLQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1849906377410654634,rc_q:%25D8%25AD%25D8%25AF%25D9%258A%25D9%2582%25D8%25A9%2520%25D8%25B2%25D9%2587%25D8%25B1%25D8%25A7%25D9%2586,ru_q:%25D8%25AD%25D8%25AF%25D9%258A%25D9%2582%25D8%25A9%2520%25D8%25B2%25D9%2587%25D8%25B1%25D8%25A7%25D9%2586"));
                    startActivity(googleIntent);
                }


                else if(position==11)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=UvdcXavaLIP5wQL5xJDADQ&q=%D8%A7%D9%84%D9%85%D8%AF%D8%B1%D8%AC+%D8%A7%D9%84%D8%B1%D9%88%D9%85%D8%A7%D9%86%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D9%85%D8%AF%D8%B1%D8%AC+%D8%A7%D9%84%D8%B1%D9%88%D9%85%D8%A7%D9%86%D9%8A+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i8i30.44423.53755..54667...0.1..1.1141.7729.0j3j6j2j1j4j1j1......0....1.........0i71j0i7i30j46i67j0i8i7i30j0i8i13i30.cu8sH0tCuCI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14245721869500264713,rc_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D9%2585%25D8%25AF%25D8%25B1%25D8%25AC%2520%25D8%25A7%25D9%2584%25D8%25B1%25D9%2588%25D9%2585%25D8%25A7%25D9%2586%25D9%258A,ru_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25A7%25D9%2584%25D9%2585%25D8%25AF%25D8%25B1%25D8%25AC%2520%25D8%25A7%25D9%2584%25D8%25B1%25D9%2588%25D9%2585%25D8%25A7%25D9%2586%25D9%258A"));
                    startActivity(googleIntent);
                }


                else

                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=i_dcXazqJI_FwAKV94rQCw&q=%D8%A3%D9%85%D9%88%D8%A7%D8%AC+%D8%B9%D9%85%D8%A7%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A3%D9%85%D9%88%D8%A7%D8%AC+%D8%B9%D9%85%D8%A7%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i71l5.36835.40833..41623...0.1..0.0.0.......0....1.wTI9BCM8nVw#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15610763974014538404,rc_q:Amman%2520Waves,ru_q:Amman%2520Waves"));
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
