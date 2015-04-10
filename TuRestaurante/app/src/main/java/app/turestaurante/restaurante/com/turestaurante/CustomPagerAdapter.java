package app.turestaurante.restaurante.com.turestaurante;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import app.turestaurante.restaurante.com.turestaurante.fragments.Bebidas;
import app.turestaurante.restaurante.com.turestaurante.fragments.Comidas;

/**
 * Created by Patricia Gloria on 08/03/2015.
 */
public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    private Fragment[] fragments;

    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[]{
                new Comidas(),
                new Bebidas()
        };
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
