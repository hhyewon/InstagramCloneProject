package com.softsquared.template.kotlin.src.main.home

import com.softsquared.template.kotlin.config.ApplicationClass
import com.softsquared.template.kotlin.src.main.home.models.PostSignUpRequest
import com.softsquared.template.kotlin.src.main.home.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.home.models.UserResponse
import com.softsquared.template.kotlin.src.main.home.models.UserSearchResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeService(val view: HomeFragmentView) {

    fun tryGetUsers(){
        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)
        homeRetrofitInterface.getUsers().enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                view.onGetUserSuccess(response.body() as UserResponse)
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                view.onGetUserFailure(t.message ?: "통신 오류")
            }
        })
    }

    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest){
        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)
        homeRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object : Callback<SignUpResponse>{
            override fun onResponse(call: Call<SignUpResponse>, response: Response<SignUpResponse>) {
                view.onPostSignUpSuccess(response.body() as SignUpResponse)
            }

            override fun onFailure(call: Call<SignUpResponse>, t: Throwable) {
                view.onPostSignUpFailure(t.message ?: "통신 오류")
            }
        })
    }

    fun tryGetUserSearch(word: String){
        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)

        homeRetrofitInterface.getUserSearch(word).enqueue(object :Callback<UserSearchResponse>{
            override fun onResponse(
                call: Call<UserSearchResponse>,
                response: Response<UserSearchResponse>,
            ) {
                //as를 쓰는 이유: response.body()이게 UserSearch~인데 코틀린이 알아서 인식할 수 없어서
                view.onGetUserSearchSuccess(response.body() as UserSearchResponse)
            }

            override fun onFailure(call: Call<UserSearchResponse>, t: Throwable) {
            view.onGetUserSearchFailure(t.message?:"통신오류") //t.message가 null이면
            }

        }
        )
    }

}
