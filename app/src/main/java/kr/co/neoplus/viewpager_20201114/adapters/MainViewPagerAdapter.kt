package kr.co.neoplus.viewpager_20201114.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.neoplus.viewpager_20201114.fragments.AddressFragment
import kr.co.neoplus.viewpager_20201114.fragments.BirthYearFragment
import kr.co.neoplus.viewpager_20201114.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //뷰페이저가 총 몇 장 짜리인지를 정수로 리턴
    override fun getCount(): Int {
        return 3
    }

    //제목 설정하기
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "이름"
            1-> "출생년도"
            else -> "거주지"
        }
    }


    //position에 맞는 프래그먼트(생성자로 객체화해서) 리턴
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> AddressFragment()
        }
    }
}