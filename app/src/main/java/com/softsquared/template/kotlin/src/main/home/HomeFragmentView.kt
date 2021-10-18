package com.softsquared.template.kotlin.src.main.home

import com.softsquared.template.kotlin.src.main.home.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.home.models.UserResponse
import com.softsquared.template.kotlin.src.main.home.models.UserSearchResponse

// 액티비티와 프레그먼트 연결
interface HomeFragmentView {

    fun onGetUserSuccess(response: UserResponse)

    fun onGetUserFailure(message: String)

    fun onPostSignUpSuccess(response: SignUpResponse)

    fun onPostSignUpFailure(message: String)

    fun onGetUserSearchSuccess(response : UserSearchResponse)

    fun onGetUserSearchFailure(message: String)
}