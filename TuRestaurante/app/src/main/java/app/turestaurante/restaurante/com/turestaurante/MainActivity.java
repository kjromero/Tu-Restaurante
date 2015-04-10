package app.turestaurante.restaurante.com.turestaurante;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//implementamos lo requerido
public class MainActivity extends ActionBarActivity implements ViewPager.OnPageChangeListener, ActionBar.TabListener{

    //creamos las variables requeridas para
    private ViewPager view_pager;
    private CustomPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos la barra y damos un color y titulo y subtitulo
        ActionBar barra = getSupportActionBar();
        barra.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF8F00")));
        barra.setTitle(R.string.app_name);
        barra.setSubtitle("Conoce nuestros menús!");

        //creamos el view pager mendiante el customAdapter.java que recoje los fragmentos
        adapter = new CustomPagerAdapter(getSupportFragmentManager());
        view_pager = (ViewPager)findViewById(R.id.pager);
        view_pager.setAdapter(adapter);
        view_pager.setOnPageChangeListener(this);

        //agregamos los tabs
        barra.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //quitamos todos los tabs y los volvemos a agregar para no creaer conflictos
        barra.removeAllTabs();
        barra.addTab(barra.newTab().setText("Comidas").setTabListener(this));
        barra.addTab(barra.newTab().setText("Bebidas").setTabListener(this));
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        //ponemos los tabs en la posicion actual
            getSupportActionBar().setSelectedNavigationItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        //movemos el viewpager con los tabs
        view_pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
