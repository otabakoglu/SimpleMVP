package com.otabakoglu.simplemvpcontract.presenter

import com.otabakoglu.simplemvpcontract.contract.MainActivityContact
import com.otabakoglu.simplemvpcontract.model.User

class MainActivityPresenter(private val view: MainActivityContact.View): MainActivityContact.Presenter {

    private var user: User = User()

    override fun updateFullName(fullName: String){
        user.fullName = fullName
        view.updateUserInfoTextView(user.toString())
    }

    override fun updateEmail(email: String){
        user.email = email
        view.updateUserInfoTextView(user.toString())
    }

}