package com.example.axxessapplication.di;

import com.example.axxessapplication.data.DataService;
import com.example.axxessapplication.view.MainActivity;

import dagger.Component;

@AxxessApplicationScope
@Component(modules = {RetrofitModule.class})
public interface AxxessApplicaitonComponent {

    void doInjection (MainActivity mainActivity);

    DataService getDataService();
}
