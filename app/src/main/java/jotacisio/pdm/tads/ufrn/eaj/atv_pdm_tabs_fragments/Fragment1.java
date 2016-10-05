package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_tabs_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    //Implementar os Fragments e seus Layouts(passo 3).
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        //logica do fragment
        return v;
    }
}
