package com.nepplus.jickbangcopy_20210724

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20210724.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        val roomData = intent.getSerializableExtra("roomInfo") as RoomData

        priceTxt.text = roomData.getFormattedPrice()
        descTxt.text = roomData.desc
        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFloor()


    }
}