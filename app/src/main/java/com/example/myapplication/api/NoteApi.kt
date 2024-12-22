package com.example.myapplication.api

import com.example.myapplication.model.NoteResponse
import retrofit2.Response
import retrofit2.http.GET

interface NoteApi {

    @GET("/api/collections/notes/records")
    suspend fun getNotes(): Response<NoteResponse>

}