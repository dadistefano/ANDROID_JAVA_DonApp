package com.example.donapp.Data.Criticidad;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.donapp.Data.BaseRepository;
import com.example.donapp.Entity.Criticidad;
import com.example.donapp.Enums.StatusResponse;
import com.example.donapp.Interfaces.IReadRepository;

public class CriticidadRepository extends BaseRepository<Criticidad> implements IReadRepository<Criticidad> {
    AsyncTask<String, Void, StatusResponse> thread;

    public CriticidadRepository(Context context){
        this.context = context;
    }

    @Override
    public StatusResponse selectAllForSpinner(Spinner spn) {
        this.thread = new DataCriticidadAsync(spn, context);
        return this.selectAllAsync(thread);
    }

    @Override
    public StatusResponse selectAllForListView(ListView lv) {
        return null;
    }
}
