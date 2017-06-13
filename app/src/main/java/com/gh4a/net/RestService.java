package com.gh4a.net;

import com.gh4a.net.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Project OctoDroid.
 * <p>
 * Created by Rhony Abdullah Siagian on 6/13/17.
 */
public interface RestService {
    @GET(RestConstant.GET_USER_INFO)
    Call<User> getUser(@Path("user") String user);
}
