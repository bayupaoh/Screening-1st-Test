package me.bayupaoh.screeningtest.api.endpoint;

import java.util.concurrent.TimeUnit;

import me.bayupaoh.screeningtest.util.AppConstant;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dsantren on 09/08/2017.
 */

public class ScreeningTestEndPoint {
    public static Retrofit getService() {
        OkHttpClient mClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();

        Retrofit mRequest = new Retrofit.Builder()
                .baseUrl(AppConstant.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(mClient)
                .build();

        return mRequest;
    }
}
