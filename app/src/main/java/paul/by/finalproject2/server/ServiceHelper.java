package paul.by.finalproject2.server;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import paul.by.finalproject2.controller.Constants;
import paul.by.finalproject2.controller.MainThreadBus;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Paul on 29.11.2015.
 */
public class ServiceHelper {

    private static ServiceHelper instance = new ServiceHelper();
    private Retrofit mRetrofit;
    private static final MainThreadBus bus = new MainThreadBus();

    private ServiceHelper() {
    }

    public static ServiceHelper getInstance() {
        if (instance == null) {
            instance = new ServiceHelper();
        }
        return instance;
    }

    public static EventBus getBus() {
        return bus;
    }

    public Retrofit getRetrofit() {

        if (mRetrofit != null) return mRetrofit;

        OkHttpClient.Builder httpClient=new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original=chain.request();

                Request request=original.newBuilder()
                        .header("X-Authorization-Token", Constants.API_KEY)
                        .header( "Content-Type", "application/json")
                        .method(original.method(),original.body())
                        .build();

                return chain.proceed(request);
            }
        });

        OkHttpClient client = httpClient.build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return mRetrofit;

    }



}
