package com.example.axxessapplication.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @AxxessApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }
}
