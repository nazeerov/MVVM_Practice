package com.nazirov.android_mvvm.network.service

import com.nazirov.android_mvvm.model.Post
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface PostService {

    @Headers(
        "Content-type:application/json"
    )

    @GET("posts")
    fun listPost(): Call<ArrayList<Post>>

    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: Int): Call<Post>

}