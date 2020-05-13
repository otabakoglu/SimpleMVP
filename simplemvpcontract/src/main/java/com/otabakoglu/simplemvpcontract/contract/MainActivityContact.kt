package com.otabakoglu.simplemvpcontract.contract

interface MainActivityContact {

    interface View {
        fun updateUserInfoTextView(info: String)
    }

    interface Presenter {
        fun updateFullName(fullName: String)
        fun updateEmail(email: String)
    }

}