package com.example.gsm_festival

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Account(
        @PrimaryKey var name : String = "",
        var age : Int = 0,
        var height : Int = 0,
        var weight : Int = 0
): RealmObject() {

}