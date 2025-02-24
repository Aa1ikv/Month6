package kg.geeks.month6.ui.data.serviceLocator

import kg.geeks.month6.ui.data.api.CharacterApiService
import kg.geeks.month6.ui.data.api.EpisodeApiService
import kg.geeks.month6.ui.data.api.LocationApiService
import kg.geeks.month6.ui.data.repository.CharacterRepasitory
import kg.geeks.month6.ui.data.repository.EpisodeRepository
import kg.geeks.month6.ui.data.repository.FavoriteCharacterRepository
import kg.geeks.month6.ui.data.repository.LocationRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val dataModule = module {

    single { provideOkhttpClient() }

    single { provideRetrofit(get()) }

    single { get<Retrofit>().create(CharacterApiService::class.java) }

    single { get<Retrofit>().create(EpisodeApiService::class.java) }

    single { get<Retrofit>().create(LocationApiService::class.java) }

    single { FavoriteCharacterRepository(get()) }

    single { CharacterRepasitory(get()) }

    single { EpisodeRepository(get()) }

    single { LocationRepository(get()) }
}

fun provideOkhttpClient(): OkHttpClient{
    return OkHttpClient.Builder()
        .connectTimeout(1,TimeUnit.MINUTES)
        .writeTimeout(1,TimeUnit.MINUTES)
        .readTimeout(1,TimeUnit.MINUTES)
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()
}

fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
    return Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}