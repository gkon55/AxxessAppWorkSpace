package com.example.axxessapplication;

import android.app.Application;
import android.content.Context;

import com.example.axxessapplication.data.DataService;
import com.example.axxessapplication.di.AxxessApplicaitonComponent;
import com.example.axxessapplication.di.ContextModule;
import com.example.axxessapplication.di.DaggerAxxessApplicaitonComponent;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class AxxessApplication extends Application {

    protected AxxessApplicaitonComponent axxessApplicaitonComponent;
    Context context;
    private Scheduler scheduler;
    private DataService dataService;

    private static AxxessApplication get(Context context) {
        return (AxxessApplication) context.getApplicationContext();
    }

    public static AxxessApplication create(Context context) {
        return AxxessApplication.get(context);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        axxessApplicaitonComponent = DaggerAxxessApplicaitonComponent.builder().contextModule(new ContextModule(this)).build();
        dataService = axxessApplicaitonComponent.getDataService();
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }
        return scheduler;
    }

    public DataService getDataService() {
        return dataService;
    }

    public AxxessApplicaitonComponent getComponent(){
        return axxessApplicaitonComponent;
    }
}
