package kr.co.neoplus.viewpager_20201114

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    val mContext = this
    //this 대신 mContext사용.

    //overiding 무조건 구현해서 사용해야됨.
    abstract fun setupEvents()
    abstract fun setValues()

}