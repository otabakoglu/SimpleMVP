package com.otabakoglu.simplemvpcontract.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import com.otabakoglu.simplemvpcontract.R
import com.otabakoglu.simplemvpcontract.contract.MainActivityContact
import com.otabakoglu.simplemvpcontract.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContact.View {


    lateinit var presenter: MainActivityContact.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)

        etName.doAfterTextChanged { text -> presenter.updateFullName(text.toString()) }
        etEmail.doAfterTextChanged { text -> presenter.updateEmail(text.toString()) }

    }

    override fun updateUserInfoTextView(info: String) {
        tvUserInfo.text = info
    }
}
