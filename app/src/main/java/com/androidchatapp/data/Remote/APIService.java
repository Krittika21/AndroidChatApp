package com.androidchatapp.data.Remote;

import com.androidchatapp.data.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
/**
 * Created by Krittika on 13-03-2019.
 */

public interface APIService {
    @POST("user/login")
    @FormUrlEncoded
    Call<Post> savePost(@Body Post post);
}
