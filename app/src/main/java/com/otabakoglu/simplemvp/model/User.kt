package com.otabakoglu.simplemvp.model

data class User(var fullName: String?, var email: String?){
    constructor() : this("", "")
}