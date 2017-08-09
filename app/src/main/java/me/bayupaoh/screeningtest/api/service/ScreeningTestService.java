package me.bayupaoh.screeningtest.api.service;

import me.bayupaoh.screeningtest.api.dao.GuestDao;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by dsantren on 09/08/2017.
 */

public interface ScreeningTestService {
    @GET("people")
    Observable<GuestDao> getListPeople();
}
