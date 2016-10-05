package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_tabs_fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciando o viewpager e o page adapter (passo 4)
        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pa = new FixedTabsPageAdapter(getSupportFragmentManager());

        //Ligando o viewpager ao pager adapter(passo 5)
        vp.setAdapter(pa);
        //instanciando o tabLayout e ligando ao viewpager (passo 6)
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);

        //inserindo imagens padrões do android nos tabLayouts
        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);


        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            //alterando imagens ao selecionar um tabLayout
            @Override
            public void onPageSelected(int position) {
            switch (position){
                    case 0:
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);
                        break;

                    case 1:
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_on);
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);
                        break;
                case 2:
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_on);
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                    break;
                default:
                        return;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
