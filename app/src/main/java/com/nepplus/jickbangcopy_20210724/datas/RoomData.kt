package com.nepplus.jickbangcopy_20210724.datas

import java.text.NumberFormat
import java.util.*

//Shift + F6 클래스 파일명 변경
class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val desc : String
) {
//    기능 1. 내가 가진 가격에 따라 (1억이 넘냐 아니냐) -> 다른 형태의 가격으로 가공하는 기능

    fun getFormattedPrice() : String {
        if(this.price >= 10000){
            // ? 억 5,500 천 단위의 , 처리.
            val uck = this.price / 10000
            val thousand = this.price % 10000
            val thousandStr = NumberFormat.getNumberInstance(Locale.KOREA).format(thousand)

            // 두개의 구해진 데이터(엌, 컴마천단위) 를 조합해서 결과 String으로 만들자.

            var resultStr = "${uck}억${thousandStr}"

            return resultStr
        }else{
            // 1억미만 => 천단위 컴맟퍼리만 해서 결과로
            val thousandStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            //어차피 천만원 단위이므로

            return thousandStr
        }
    }
}