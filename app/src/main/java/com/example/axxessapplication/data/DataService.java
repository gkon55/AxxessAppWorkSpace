package com.example.axxessapplication.data;

import com.example.axxessapplication.model.Root;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface DataService {

  @GET("/3/gallery/search/1")
  Observable<Root> fetchResult(@Query ("q") String search);
}
