package com.otabakoglu.simplemvp.presenter

import com.otabakoglu.simplemvp.model.User

class MainActivityPresenter(private val view: View) {

    private var user: User = User()

    fun updateFullName(fullName: String){
        user.fullName = fullName
        view.updateUserInfoTextView(user.toString())
    }

    fun updateEmail(email: String){
        user.email = email
        view.updateUserInfoTextView(user.toString())
    }


    interface View {
        fun updateUserInfoTextView(info: String)
    }
}