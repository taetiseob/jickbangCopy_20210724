package com.nepplus.jickbangcopy_20210724

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20210724.adapters.RoomAdapter
import com.nepplus.jickbangcopy_20210724.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mRoomAdapter : RoomAdapter
    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000,"마포구 연희동",3,"좋아요"))
        mRoomList.add(RoomData(2500,"동대문구 제기동",1,"2번째 방"))
        mRoomList.add(RoomData(208000,"송파구 신천동",33,"굳"))
        mRoomList.add(RoomData(3500,"강동구 암사동",-1,"2번째 방"))
        mRoomList.add(RoomData(8000,"중랑구 망우동",3,"와웅"))
        mRoomList.add(RoomData(15500,"동대문구 제기동",1,"2번째 방"))
        mRoomList.add(RoomData(6000,"마포구 연희동",-2,"ㅋㅋㅋㅋ"))
        mRoomList.add(RoomData(25500,"동대문구 제기동",1,"2번째 방"))
        mRoomList.add(RoomData(38000,"덕진구 금암동",13,"좋아요"))
        mRoomList.add(RoomData(105500,"서울시 금천구",11,"2번째 방"))

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdapter
    }
}