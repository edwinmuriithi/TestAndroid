package com.moringaschool.android_ip_1.Network;

import com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse;
import com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface GetMovies {

    //pass all the api headers here. Replace api key with Constants.IMDB_API
    @Headers({

            "Accept: application/json",
            "x-rapidapi-host:imdb-internet-movie-database-unofficial.p.rapidapi.com",
            "x-rapidapi-key:7701f21098msh24137e68c02d540p16282bjsn2f745c53ff8"

    })

    //Endpoint.
    @GET("search/{movie_name}") //{movie_name} is a placeholder. the user supplies the query parameter
    Call<SearchApiResponse> callMovies(

            @Path("movie_name") String movie_name //Replace movie_name with the supplied movie_name in url

    );

    public interface GetMovieDetails {

        //pass all the api headers here. Replace api key with Constants.IMDB_API
        @Headers({
                "Accept: application/json",
                "x-rapidapi-host:imdb-internet-movie-database-unofficial.p.rapidapi.com",
                "x-rapidapi-key:7701f21098msh24137e68c02d540p16282bjsn2f745c53ff8"
        })

        //Endpoint.
        @GET("film/{movie_id}") //{movie_id} is a placeholder. the user supplies the query parameter
        Call<DetailApiResponse> callMovieDetails(

                @Path("movie_id") String movie_id //Replace movie_name with the supplied movie_name in url

        );


    }

}
